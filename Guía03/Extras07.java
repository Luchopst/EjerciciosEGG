/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extras07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("INGRESE LA CANTIDAD DE VECES QUE SE LEERAN NÚMEROS");
       int cant = leer.nextInt();
       int i=0;
       int suma=0;
       int min;
       int max;
       max=-1;
       min =999;
 
       while(i < cant ){
            System.out.println("INGRESE UN NÚMERO ENTRE 0 Y 100:");
            int num = leer.nextInt();
            
            suma= suma+num;
            
            if(num> max){
                max= num; 
            }
            if(num <min){
                min= num;
            
            }
        i++;
       }
       double promedio= (float)(suma/cant);
        System.out.println("PROMEDIO: "+promedio);
        System.out.println("MÁXIMO: "+max);
        System.out.println("MÍNIMO: "+min);
    }

}
    
    

