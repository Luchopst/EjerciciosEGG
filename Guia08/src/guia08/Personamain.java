/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import Servicios.Ej03PersonaServicio;
import Entidades.Ej03Persona;
import Entidades.Ej03Persona;
import java.util.ArrayList;
import java.util.List;

/**
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * // * Persona con distintos valores, a continuación, llamaremos todos los
 * métodos // * para cada objeto, deberá comprobar si la persona está en su peso
 * ideal, tiene // * sobrepeso o está por debajo de su peso ideal e indicar para
 * cada objeto si la // * persona es mayor de edad. Por último, guardaremos los
 * resultados de los // * métodos calcularIMC y esMayorDeEdad en distintas
 * variables(arrays), para // * después calcular un porcentaje de esas 4
 * personas cuantas están por debajo de // * su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también // * calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores. // * Para esto, podemos crear unos métodos
 * adicionales.
 *
 * @author User
 */
/**
 * resolver Vectores vector[i] = ps.esMayorDeEdad(); Crear 4 objetos de tipo
 Ej03Persona con distintos valores , a continuación, llamaremos todos los métodos
 para cada objeto, deberá comprobar si la persona está en su peso ideal ,
 tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto
 si la persona es mayor de edad . Por último, guardaremos los resultados de
 * los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays) , para
 * después calcular un porcentaje de esas 4 personas cuantas están por debajo de
 * su peso, cuantas en su peso ideal y cuantos, por encima , y también
 * calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * .* Para esto, podemos crear unos métodos adicionales
 */
public class Personamain {

    /**
     * @param args the command line arguments
     */
//   
    public static void main(String[] args) {

        Ej03PersonaServicio ps = new Ej03PersonaServicio();
        //se crean lista de 4 personas
        List<Ej03Persona> listaPersona = new ArrayList<>();//crea una Lista llamada "listaPersona"

        int[] vectorIMC = new int[4];

        int[] vectorMayor = new int[4];
        int cont = 0;
        for (int i = 0; i < 4; i++) {//realiza un bucle para crear objetos persona
            listaPersona.add(ps.crearPersonas());  //guarda cada una iteracion una persona en la lista 
        }
        for (Ej03Persona alguien : listaPersona) {//se recorre la persona de la lista "listaPersona"
            int imc = ps.calcularIMC(alguien);
            if (imc == -1) {
                System.out.println("La persona tiene bajo peso.");
            } else if (imc == 0) {
                System.out.println("La persona tiene un peso saludable.");
            } else {
                System.out.println("La persona tiene sobrepeso.");
            }
            boolean mayorMenor = ps.esMayorDeEdad(alguien);
            int esMayor;
            if (mayorMenor) {
                esMayor = 1;
            } else {
                esMayor = 0;
            }
            vectorIMC[cont] = imc;
            //se muestran los vectores solo para contatar su funcionamineto
            // System.out.println("VectorIMC: "+vectorIMC[cont]);
            vectorMayor[cont] = esMayor;
            // System.out.println("VectorMayor: "+vectorMayor[cont]);
            cont++;
        }
        double porcentajePesoBajo = 0;
        double porcentajePesoNormal = 0;
        double porcentajeSobrepeso = 0;
        int pbp = 0;                                //persona bajo peso
        int ppn = 0;                                //persona peso normal
        int psp = 0;                                //persona sobre peso

        double porcentajeEdadMayor = 0;
        double porcentajeEdadMenor = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < cont; i++) {
            if (vectorIMC[i] == -1) {
                pbp++;
            } else if (vectorIMC[i] == 0) {
                ppn++;
            } else {
                psp++;
            }
            if (vectorMayor[i] == 1) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("Porcentaje de Peso Bajo: " + (porcentajePesoBajo = (100 * pbp) / cont));
        System.out.println("Porcentaje de peso Normal: " + (porcentajePesoNormal = (100 * ppn) / cont));
        System.out.println("Porcentaje de Sobrepeso: " + (porcentajePesoNormal = (100 * psp) / cont));
        System.out.println("Porcentaje de Mayoria de Edad: " + (porcentajeEdadMayor = (100 * mayor) / cont));
        System.out.println("porcentaje de Minoria de Edad: " + (porcentajeEdadMenor = (100 * menor) / cont));

    }

}
