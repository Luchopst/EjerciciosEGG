/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía03;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author User
 */
public class extras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WindowsInternalFrameTitlePane leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int n = leer.nextInt();
        switch (n) {
                case 1, 2, 3:
                    resultado += "I".repeat(n);
                    break;
                case 4:
                    resultado = "IV";
                    break;
                case 5, 6, 7, 8:
                    resultado = "V" + "I".repeat(n - 5);
                    break;
                case 9:
                    resultado = "IX";
                    break;
                case 10:
                    resultado = "X";
                    break;
            }
    }
    
}
