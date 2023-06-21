/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
 * terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
 * cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
 * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
           a e i o u
           @ # $ % *
  Realice un subprograma que reciba una secuencia de caracteres y retorne la 
* codificación correspondiente. Utilice la estructura “según” para la transformación. 
  Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
  La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 * @author User
 */
public class CodificarManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese un Secuencia de Caracteres");
        String caracter= input.nextLine();
        
        
        caracter=caracter.substring(0,caracter.length()-1);
        
        String codificado = cambiarVocales(caracter);
        System.out.println("La Palabra Modificada es:" );
        System.out.println(codificado);      
    }
  

   public static String cambiarVocales(String caracter){
      caracter=caracter.toLowerCase();
       StringBuilder sb = new StringBuilder();
   for (int i=0; i<caracter.length(); i++){
 char opcion = caracter.charAt(i);
       switch (opcion) {
           case 'a':
               sb.append('@');
               break;
           case 'e':
               sb.append('#');
               break;
           case 'i':
               sb.append('$');
               break;
           case 'o':
               sb.append('%');
               break;
           case 'u':
               sb.append('*');
               break;
           default: sb.append(opcion);
           break;

       }
   }
   return sb.toString();
 }
}

