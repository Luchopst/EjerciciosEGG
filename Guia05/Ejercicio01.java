/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

/**
 *
 * @author User
 */
public class Ejercicio01 {

    /**Realizar un algoritmo que llene un vector con los 100 
     * primeros números enteros y los muestre por pantalla 
     * en orden descendente.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Vector=new int [100];
        int cont=0;
        for(int i=0;i<100;i++){
           Vector[i]=i+1;
            System.out.print(" "+ "["+ Vector[i] +"]");
            
        }System.out.println(" ");
         for(int i=99;i>0;i--){
            System.out.print(" "+ "["+ Vector[i] +"]");
        }
    }
    
}
