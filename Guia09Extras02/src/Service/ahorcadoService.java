/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ahorcadoService {
//  Metodo crearJuego(): le pide la palabra al usuario y cantidad de 
//  jugadas máxima. Con la palabra del usuario, pone la longitud de 
//  la palabra, como la longitud del vector. Después ingresa la 
//  palabra en el vector, letra por letra, quedando cada letra de la 
//  palabra en un índice del vector. Y también, guarda la cantidad de 
//  jugadas máximas y el valor que ingresó el usuario.  

    public static Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una Palabra Para comenzar");
        String palabra = input.next();
        System.out.println("Ingrese la Cantidad de Jugadas Maxima");
        a1.setCantJugadasMax(input.nextInt());
        a1.setCaracteres(palabra.toLowerCase().toCharArray());

        return a1;
    }

//Método longitud(): muestra la longitud de la palabra que 
//se debe encontrar. Nota: buscar como se usa el vector.length.
    public static void longitud(Ahorcado a1) {
        System.out.println("La longitud de la Palabra es " + a1.getCaracteres().length);

    }

//  Método buscar(letra):  este método recibe una letra dada por el 
//  usuario y busca si la letra ingresada es parte de la palabra o no. 
//  También informará si la letra estaba o no.
    public static boolean buscar(Ahorcado a1, char val) {
        for (int i = 0; i < a1.getCaracteres().length; i++) {
            if (val == a1.getCaracteres()[i]) {
                System.out.println("Se encontro el Caracter ");
                return true;
            }
        }
        System.out.println("No se encontro el Caracter");
        return false;
    }

//Método encontradas(letra):  que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le 
//faltan. Este método además deberá devolver true si la letra estaba y 
//false si la letra no estaba, ya que, cada vez que se busque una letra 
//que no esté, se le restará uno a sus oportunidades.
    public static boolean encontradas(Ahorcado a1, char val) {
        int val1 = String.valueOf(a1.getCaracteres()).replaceAll("(?i)[^" + val + "]", "").length();//muestra coincidencias
        a1.setLetrasEncontradas(a1.getLetrasEncontradas() + val1);
        System.out.println("Las Coincidencias son: " + val1);
        System.out.println("------------------------");
        System.out.println("Los Caracteres encontrados Hatsa el momento son: " + a1.getLetrasEncontradas());
        System.out.println("Los caracteres Faltantes son: " + (a1.getCaracteres().length - a1.getLetrasEncontradas()));
        if (val1 > 0) {

            return true;
        }
        a1.setCantJugadasMax(a1.getCantJugadasMax() - 1);
        return false;
    }

//Método intentos(): para mostrar cuántas oportunidades le queda al 
//jugador.
//Método juego(): el método juego se encargará de llamar todos los 
//métodos previamente mencionados e informará cuando el usuario 
//descubra toda la palabra o se quede sin intentos. Este método se 
//llamará en el main. 
    public static void juego(Ahorcado a1) {
        char[] aux = new char[26];
        Scanner input = new Scanner(System.in);
        crearJuego();
        do {
            System.out.println("Ingrese un Caracter a Buscar");
            char val = input.next().charAt(0);
            if (encontradas(a1,val)) {
               aux =
            }
        
        
        
        } while ((a1.getCantJugadasMax() > 0) && !(a1.getCaracteres().length == a1.getLetrasEncontradas()));
       
    }
}
//   public static boolean letraYaCargada(LetraEncontradaTotal le, char letra) {
//        boolean existe = false;
//        for (int i = 0; i < le.getLetraEncontradasTotal().length; i++) {
//            if (le.getLetraEncontradasTotal(i) == letra) {
//                existe = true;
//                break;
//            } else {
//                if (le.getLetraEncontradasTotal(i) == '1') {
//                    le.setLetraEncontradasTotal(letra, i);
//                    break;
//                }
//            }
//        }
//        return existe;     
//}

//   System.out.println("Ingrese letra");
//        char letra = leer.next().charAt(0);
//
//        boolean bandera = false;
//        
//        for (int i = 0; i < p1.getPalabra().length; i++)
//        {
//            if (p1.getPalabra()[i] == letra)
//            {bandera=true;
//                
//            }
//
//        }
//        if (bandera)
//        {System.out.println("La letra se encontro en la palabra");
//            
//        }else{
//            System.out.println("La letra no se encontro en la palabra");
//        }
//        
//    }
