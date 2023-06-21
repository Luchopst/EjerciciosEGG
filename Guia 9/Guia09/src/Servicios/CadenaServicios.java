/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CadenaEj01;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CadenaServicios {
    
// Método mostrarVocales(), deberá contabilizar la cantidad de
// vocales que tiene la frase ingresada.

    Scanner input = new Scanner(System.in);
/**
 * es f1.
 * @param f1 
 */
    public void mostrarVocales(CadenaEj01 f1) {
        int cont = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            switch (f1.getFrase().toLowerCase().charAt(i)) {
                case 'a':
                    cont++;
                    break;
                case 'e':
                    cont++;
                    break;
                case 'i':
                    cont++;
                    break;
                case 'o':
                    cont++;
                    break;
                case 'u':
                    cont++;

            }

        }
   
//        System.out.println(cont); se utilizo para comprovar el funcionamiento del Metodo
    }
//    Método invertirFrase(), deberá invertir la frase ingresada y
//    mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", 
//    Salida: "acnalb asac".

    public void invertirFrase(CadenaEj01 f1) {

        for (int i = f1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(f1.getFrase().substring(i, i + 1));
        }
        System.out.println("");

    }
//Método vecesRepetido(String letra), recibirá un carácter 
//ingresado por el usuario y contabilizar cuántas veces se
//repite el carácter en la frase, por ejemplo:

    public void vecesRepetido(CadenaEj01 f1, String caracter) {
        int var2 = f1.getFrase().replaceAll(caracter, "").length();
        System.out.println("El Caracter " + caracter + " se Repite " + (f1.getLongitud() - var2) + " Veces: ");
    }
//Método compararLongitud(String frase), deberá
//comparar la longitud de la frase que compone la
//clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(CadenaEj01 f1) {
        System.out.println("Ingrese Frase a Comparar");
        String fr = input.nextLine();

        if (f1.getLongitud() == fr.length()) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("No son Iguales");
        }
    }
//    Método unirFrases(String frase), deberá unir la 
//    frase contenida en la clase Cadena con una 
//    nueva frase ingresada por el usuario y mostrar 
//    la frase resultante.

    public void unirFrases(CadenaEj01 f1) {
        System.out.println("Ingrese una Nueva Palabra a Concatenar");
        String var3 = input.nextLine();
        System.out.println(f1.getFrase().concat(var3));
    }
//    Método reemplazar(String letra), deberá 
//    reemplazar todas las letras “a” que se 
//    encuentren en la frase, por algún otro 
//    carácter seleccionado por el usuario y 
//    mostrar la frase resultante.

    public void reemplazar(CadenaEj01 f1,String car) {
       
        System.out.println((f1.getFrase().replace("a", car)));
    }
//  Método contiene(String letra), deberá 
//  comprobar si la frase contiene una letra 
//  que ingresa el usuario y devuelve verdadero 
//  si la contiene y falso si no.
    public boolean contiene(CadenaEj01 f1,String car){
    
     return f1.getFrase().contains(car);
    }
}
