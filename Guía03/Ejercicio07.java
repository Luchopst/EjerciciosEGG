/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
.
 */
package Guía03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "";
        //String letraO = 
        int correctas=0;
        int incorrectas=0;
        String varFDE = "&&&&&";
        do {
        System.out.println("ingrese una Cadena del Protocolo RS232");
        Scanner input = new Scanner(System.in);
        cadena = input.nextLine();
        String letraX = cadena.substring(0,1);
        String letraO = cadena.substring(cadena.length()-1,cadena.length());
        if (letraX.equalsIgnoreCase("x") && letraO.equalsIgnoreCase("o") && cadena.length()<=5 ){
            correctas++;
        }else{
            incorrectas++;
        }
        }
        
        while (!cadena.equalsIgnoreCase(varFDE) );
        System.out.println("Correctas = " + correctas );
        System.out.println("Incorrectas = " + (incorrectas -1 ));
    }
    
}
