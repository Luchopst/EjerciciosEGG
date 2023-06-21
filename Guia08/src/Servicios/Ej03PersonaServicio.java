/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ej03Persona;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej03PersonaServicio {

    // En el paquete Servicios crear Ej03PersonaServicio con los siguientes 3 métodos:
    // Método esMayorDeEdad(): indica si la persona es mayor de edad La función devuelve un booleano.
    public boolean esMayorDeEdad(Ej03Persona per) {
        if (per.getEdad() > 18) {
            System.out.println("Es Mayor de Edad");
            return true;
        } else {
            System.out.println("Es Menor de Edad");
        }
        return false;
    }
//   Metodo crearPersona(): el método crear persona, le pide
// * los valores de los atributos al usuario y después se le asignan a sus
// * respectivos atributos para llenar el objeto Ej03Persona. Además, comprueba que el
// * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
// * deberá mostrar un mensaje

    public Ej03Persona crearPersonas() {
        String nombre;
        int edad;
        String sexo;
        double peso;
        double altura;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        nombre = input.next();
        
        boolean salir = true;

        System.out.println("Ingrese su Edad");
        edad = input.nextInt();
        do {
            System.out.println("Ingrese su Sexo");
            System.out.println("H-Hombre");
            System.out.println("M-Mujer");
            System.out.println("O-Otros");

            sexo = input.next();

            salir = false;
            switch (sexo.toLowerCase()) {
                case "h":
                    System.out.println("Selecciono Hombre");

                    break;
                case "m":
                    System.out.println("Selecciono Mujer");

                    break;
                case "o":
                    System.out.println("Selecciono Otro");

                    break;
                default:
                    System.out.println("Opcion Invalida");
                    salir = true;

            }
        } while (salir);

        System.out.println("Ingrese su Peso");
        peso = input.nextDouble();

        System.out.println("Ingrese su Altura");
        altura = input.nextDouble();

        return new Ej03Persona(nombre, edad, sexo, peso, altura);

    }
//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
// * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
// * 20, significa que la persona está por debajo de su peso ideal y la función
// * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
// * (incluidos), significa que la persona está en su peso ideal y la función
// * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
// * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

    public int calcularIMC(Ej03Persona persona) {
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return -1; // por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // en el peso ideal
        } else {
            return 1; // con sobrepeso
        }
    }
}
