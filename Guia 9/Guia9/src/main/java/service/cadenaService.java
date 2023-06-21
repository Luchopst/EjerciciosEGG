/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Entidades.cadena;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class cadenaService {
//Método mostrarVocales(), deberá contabilizar 
//la cantidad de vocales que tiene la frase 
//ingresada.
    public cadena mostrarVocales(){
        cadena cd = new cadena();
        char vocal;
        int val1 = String.valueOf(cd.setfra()).replaceAll("(?i)[^" + cd.getFrase() + "]", "").length();
        }
         
         int cont=0;
        for (int i = 0; i < cd.getFrase().length(); i++) {
            switch (vocal)) {
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
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
    return cd;
    }
//Método invertirFrase(), deberá invertir la 
//frase ingresada y mostrarla por pantalla. 
//Por ejemplo: Entrada: "casa blanca", Salida:
//"acnalb asac".
    public void invertirFrase(cadena cd){
        System.out.println("Entrada "+ cd.getFrase());
        for (int i = cd.getFrase().length() ; i > 0 ; i--) {
            
            System.out.println("");
            System.out.println("Salida "+ cd.getFrase() );
            
        }
    }
}



//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
