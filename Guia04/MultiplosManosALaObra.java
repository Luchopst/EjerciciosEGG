/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MultiplosManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero");
        int num1 = input.nextInt();
       
        System.out.println("Ingrese el Segundo Numero");
        int num2 = input.nextInt();
        EsMultiplo(num1,num2);
    }
    

public static void EsMultiplo(int num1,int num2){
 if (num1 % num2==0){
 System.out.println("["+"Es Multiplo"+"]");
}else{
     System.out.println("["+"No es Multiplo"+"]");
 }
}
}
