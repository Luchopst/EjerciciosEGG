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
public class Ejercicio06 {

    /**Realizar un programa que pida dos números enteros positivos por teclado y 
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
     * el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
     * si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
     * del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result=0;
        
        System.out.println("Ingrese el Primer Numero Positivo a Calcular");
        int num1=input.nextInt();
        System.out.println("Ingrese el segundo Numero Positivo a Calcular");
        int num2=input.nextInt();
        System.out.println("["+" MENU "+"]");
        System.out.println(" ");
        System.out.println("["+"1-SUMAR"+"]");
        System.out.println("["+"2-RESTAR"+"]");
        System.out.println("["+"3-MULTIPLICAR"+"]");
        System.out.println("["+"4-DIVIDIR"+"]");
        System.out.println("["+"5-SALIR"+"]");
 
        int menu= input.nextInt();
       String resp;
       do{
      switch(menu){
            case 1:
                System.out.println("La Suma de los Valores Ingresados es: "+ "["+(num1+num2)+"]");
                break;
            case 2:
                System.out.println("La Resta de los Valores Ingresados son: "+ "["+(num1-num2)+"]");
                break;
            case 3:
                 System.out.println("La Multiplicacion de los Valores Ingresados son: "+ "["+(num1*num2)+"]");
                break;
            case 4:
                 System.out.println("La Divicion de los Valores Ingresados son: "+ "["+(num1/num2)+"]");
                break;
            case 5:
                 System.out.println(" ¿Está seguro que desea salir del programa (S/N)");
                 Scanner val = new Scanner(System.in);
                 resp = val.nextLine();
                break;
                 
            default: System.out.println("Gracias Vuelva Pronto!!!");
                 }
        }while(menu != 5);
    
    }
}
