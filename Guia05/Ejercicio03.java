/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio03 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el tamaño del Vector");

        int tamanio = input.nextInt();
        String convertir;
        int contaUnDig = 0, contaDosDig = 0, contaTresDig = 0, contaCuatroDig = 0, contaCincoDig = 0;
        int[] vector = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese un numero: ");
            vector[i] = input.nextInt();
            convertir = String.valueOf(vector[i]);
            switch (convertir.length()) {
                case 1:
                    contaUnDig++;
                    break;
                case 2:
                    contaDosDig++;
                    break;
                case 3:
                    contaTresDig++;
                    break;
                case 4:
                    contaCuatroDig++;
                    break;
                case 5:
                    contaCincoDig++;
                    break;
                default:
                    System.out.println("El numero es mayor a 5 digitos " + vector[i]);
            }
        }
        System.out.println("un digito:" + contaUnDig);
        System.out.println("dos digito:" + contaDosDig);
        System.out.println("tres digito:" + contaTresDig);
        System.out.println("Cuatro digito:" + contaCuatroDig);
        System.out.println("Cinco digito:" + contaCincoDig);

    }

}

