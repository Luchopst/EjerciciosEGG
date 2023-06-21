/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Perro;
import entidad.Persona;
import java.util.*;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro
 * programa va a tener que contar con muchas personas y muchos perros. El
 * programa deberá preguntarle a cada persona, que perro según su nombre, quiere
 * adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió
 * un perro que ya estaba adoptado, se le debe informar a la persona. Una vez
 * que la Persona elige el Perro se le asigna, al final deberemos mostrar todas
 * las personas con sus respectivos perros.
 *
 * @author User
 */
public class adoptarService {

    Persona persona = new Persona();

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Perro> perrosDisponibles = new ArrayList<>();
    ArrayList<Perro> perrosAdoptados = new ArrayList<>();
    ArrayList<Persona> personaConPerro = new ArrayList();
    ArrayList<Persona> personaSinPerro = new ArrayList();

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del Perro");
        perro.setNombre(input.next());
        System.out.println("ingrese La Raza");
        perro.setRaza(input.next());
        System.out.println("Ingrese la Edad");
        perro.setEdad(input.nextInt());
        System.out.println("Ingrese El Tamaño");
        perro.setTamanio(input.nextInt());
        perrosDisponibles.add(perro);//guarda el ingreso de cada perro
        return perro;
    }

    public Persona crearPersona() {
        System.out.println("Ingrese el Nombre");
        persona.setNombre(input.next());
        System.out.println("Ingrese el Apellido");
        persona.setApellido(input.next());
        System.out.println("Ingrese la Edad");
        persona.setEdad(input.nextInt());
        System.out.println("Ingrese el DNI");
        persona.setDni(input.nextLong());
        personaSinPerro.add(persona);
        return persona;
    }

    public void Adopcion() {
        String s = "";
        do {
            System.out.println("Desea Adoptar algun Perro? responda S/N");
            s = input.next();

            if (s.equalsIgnoreCase("s")) {
                System.out.println("Ingrese su DNI");
                Long dni = input.nextLong();

                if (!(BuscarPersona(persona.getDni()))) {
                    System.out.println("Usted Ya Ha Adoptado");
                      break;
                }
            } else {
                System.out.println("gracias Por su Visita");
                Menu();
                break;
            }

            System.out.println("Esta es la Lista de Perros Disponibles");
            System.out.println("--------------------------------------");
            System.out.println(perrosDisponibles.toString());
            System.out.println("ingrese el nombre del Perro a Adoptar");
            String perroAAdoptar = input.next();

            Perro perro = Buscar(perroAAdoptar);//se le llama a el metodo buscar y se lo busca en la lista.
            if (!(perro.getNombre().equalsIgnoreCase(null))) {
                persona.setPerro(perro);
                personaConPerro.add(persona);//se agrega a la lista de persona con perro.
                personaSinPerro.remove(persona);//se quita la persona de la lista.
                System.out.println("El Perro " + perro.getNombre() + " Fue Adoptado Exitosamente");
                perrosDisponibles.remove(perro);//el perro se remueve de la lista perros disponibles. 
                perrosAdoptados.add(perro);//el perro se ingresa a la lista de adoptados.
            }
        } while (s.equalsIgnoreCase("s"));

    }

    public Perro Buscar(String perroAAdoptar) {
        Perro pb = new Perro();
        boolean disp = false;
        for (Perro perroDisp : perrosDisponibles) {
            if (perroAAdoptar.equalsIgnoreCase(perroDisp.getNombre())) {
                disp = true;
                System.out.println("El Perro " + "[" + perroDisp.getNombre() + "]" + "Esta Disponible");
                pb = perroDisp;
                break;
            }
        }
        if (disp == false) {

            System.out.println("El Perro " + perroAAdoptar + "NO Esta Disponible");
        }
        return pb;
    }

    public boolean BuscarPersona(Long dni) {

        Persona pcp = new Persona();
        boolean disp = false;
        for (Persona PersPdisp : personaSinPerro) {
            if ((dni == PersPdisp.getDni())) {
                disp = true;
                System.out.println("La Persona " + "[" + PersPdisp.getNombre() + "]" + "Esta Disponible para Adoptar");
                {
                    pcp = PersPdisp;
                    break;
                }
            } else if (disp == false) {
                System.out.println("La Persona " + PersPdisp.getNombre() + "Ya Ha Adoptado");
                personaConPerro.add(PersPdisp);//se agrega a la lista (con perro)
                personaSinPerro.remove(PersPdisp);//se elimina la person de la lista (sin perro)

            } else if (personaSinPerro.isEmpty()) {
                System.out.println("La Lista Se Encentra Vacia");
            }
        }
        return disp;
    }

    public void Mostrar() {
        System.out.println("La Lista de Perros Adoptados es: ");
        System.out.println("-------------------------------");
        System.out.println(perrosAdoptados.toString());
        System.out.println("");
        System.out.println("La Lista de Perros Disponible es: ");
        System.out.println("----------------------------------");
        System.out.println(perrosDisponibles.toString());
        System.out.println("Las Personas Que Adoptaron Fueron: ");
        System.out.println("----------------------------------");
        System.out.println(personaConPerro.toString());
    }

    public void Menu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione la Opcion Deseada");
            System.out.println("----------------------------");
            System.out.println("1-ingresar Sus Datos");
            System.out.println("2-Ingresar Un Perro A Adoptar");
            System.out.println("3-Adoptar");
            System.out.println("4-Mostrar Listas");
            System.out.println("5-Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    crearPerro();
                    break;
                case 3:
                    Adopcion();
                    break;
                case 4:
                    Mostrar();
                    break;
                case 5:
                    System.out.println("Gracias Por Su Visita");
                    break;
                default:
            }

        } while (opcion != 5);

    }
}
//public Persona BuscarPersona(Long dni) {
//    Persona pcp = new Persona();
//    boolean disp = false;
//    for (Persona persona : personaSinPerro) {
//        if (dni == persona.getDni()) {
//            if (persona.getPerro() == null) {
//                disp = true;
//                System.out.println("La Persona " + "[" + persona.getNombre() + "]" + " Esta Disponible para Adoptar");
//                pcp = persona;
//                break;
//            } else {
//                System.out.println("La Persona " + persona + " Ya Ha Adoptado");
//                personaSinPerro.remove(persona);
//                personaConPerro.add(persona);
//            }
//        }
//    }
//    if (!disp) {
//        System.out.println("La Persona No Esta Disponible para Adoptar");
//    }
//    return pcp;
//}
