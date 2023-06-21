/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DivisionNumeroMain {

    /**
     * Defina una clase llamada DivisionNumero. En el método main utilice un
     * Scanner para leer dos números en forma de cadena. A continuación, utilice
     * el método parseInt() de la clase Integer, para convertir las cadenas al
     * tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
     * una división con los dos numeros y mostrar el resultado.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

//        String var1 = "";
//        String var2 = "";
//        int var3 = 0;
//        int var4 = 0;
        int resultado = 0;
        boolean bandera = true;
        do {
            try {

                System.out.println("Ingrese el Primer Numero");
                dn.setVar1(input.next());
                System.out.println("Ingrese el Segundo Numero");
                dn.setVar2(input.next());
                dn.setVar3(Integer.parseInt(dn.getVar1()));
                dn.setVar4(Integer.parseInt(dn.getVar2()));
                System.out.println(dn.getVar3() + " " + dn.getVar4());
                resultado = (dn.getVar3() / dn.getVar4());
                System.out.println("el resultado de la division es: " + resultado);
                bandera = true;

            } catch (NumberFormatException e) {
                System.out.println("No Se Puede Convertir la Cadena");
                bandera = false;
            } catch (ArithmeticException e) {
                System.out.println("Error aritmetico");
                bandera = false;
            } catch (InputMismatchException e) {
                System.out.println("Error al Ingresar datos");
                bandera = false;
            }
        } while (bandera == false);

    }

    
}
