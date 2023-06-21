/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AdivinaMain {

    /**
     * Escribir un programa en Java que juegue con el usuario a adivinar un
     * número. La computadora // debe generar un número aleatorio entre 1 y 500,
     * y el usuario tiene que intentar adivinarlo. Para // ello, cada vez que el
     * usuario introduce un valor, la computadora debe decirle al usuario si el
     * // número que tiene que adivinar es mayor o menor que el que ha
     * introducido el usuario. Cuando // consiga adivinarlo, debe indicárselo e
     * imprimir en pantalla el número de veces que el usuario // ha intentado
     * adivinar el número. Si el usuario introduce algo que no es un número, se
     * debe // controlar esa excepción e indicarlo por pantalla. En este último
     * caso también se debe contar el // carácter fallido como un intento.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Random rand = new Random();
        int num = rand.nextInt(500);
        int resp = 0;
        System.out.println("[" + num + "]");

        boolean bandera = true;
        int cont = 0;
        do {
            try {

                System.out.println("Ingrese el Numero a Adivinar");
                resp = input.nextInt();

                if (resp < num) {
                    System.out.println("El Numero Ingresado es Menor Intente con uno Mayor ");
                    System.out.println("--------------------");
                    cont++;

                }
                if (resp > num) {
                    System.out.println("El Numero Ingresado es Mayor Intente con uno Menor");
                    System.out.println("--------------------");
                    cont++;

                }
                if (resp == num) {
                    System.out.println("[" + "[" + "Respuesta Correcta has Acertado" + "]" + "]");
                    System.out.println("--------------------");
                    System.out.println("Sus Intentos fueron: " + cont);
                    System.out.println("--------------------");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error al Ingresar datos");
                input.next();                                                    // Descartar el ingreso de datos erroneo y continua.
            }
        } while (resp != num);

        System.out.println("Gracias por Jugar");

    }

}
