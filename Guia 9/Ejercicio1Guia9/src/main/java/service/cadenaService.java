/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Cadena;
import java.util.Scanner;

//Realizar una clase llamada Cadena, en el paquete de entidades, 
//que tenga como atributos una frase (String) y su longitud. 
//Agregar constructor vacío y con atributo frase solamente. 
//Agregar getters y setters. El constructor con frase como 
//atributo debe setear la longitud de la frase de manera 
//automática. Crear una clase CadenaServicio en el paquete 
//servicios que implemente los siguientes métodos:



//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 
public class cadenaService {
    Cadena cd = new Cadena();
//Método mostrarVocales(), deberá contabilizar la cantidad 
//de vocales que tiene la frase ingresada.
    public int mostrarVocales(){
        
        int cont = 0;
        for (int i = 0; i < cd.getLongitud(); i++) {
            String letra = cd.getFrase().substring(i,i+1).toLowerCase();
            switch (letra) {
                case "a":
                    cont++;
                    break;
                case "e":
                    cont++;
                    break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;
            }
            
        }
       return cont;         
    }
//    Método invertirFrase(), deberá invertir la frase ingresada
//y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
//Salida: "acnalb asac".
    public void invertirFrase(){
        
        for (int i = cd.getLongitud(); i > 0; i--) {
            System.out.print(cd.getFrase().substring(i,i+1));
        }
    }
//Método vecesRepetido(String letra), recibirá un carácter 
//ingresado por el usuario y contabilizar cuántas veces se 
//repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se 
//repite 4 veces.
    public void vecesRepetido(String letra){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un Caracter a Buscar");
        letra=input.next();
        int cont = 0;
        switch (letra) {
            case "a":
                cont ++;
                System.out.println("cantidad de Letras A: "+ cont);
                break;
            case "e":
                cont ++;
                 System.out.println("cantidad de Letras E: "+ cont);
                break;
            case "i":
                cont ++;
                 System.out.println("cantidad de Letras I: "+ cont);
                break;
            case "o":
                cont ++;
                System.out.println("cantidad de Letras O: "+ cont);
                break;
            case "u":
                cont ++;
                System.out.println("cantidad de Letras U: "+ cont);
                break;
                
            default:
                System.out.println("");
        }
        
    }
}
