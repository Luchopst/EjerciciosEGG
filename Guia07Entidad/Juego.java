/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Juego {

    private int numero1;
    private int numero2;
    private int aciertos;
    private int acJugador1;
    private int acJugador2;

    public Juego() {
        acJugador1=0;
        acJugador2=0;
    }

    public Juego(int numero, int aciertos) {
        this.numero1 = numero;
        this.aciertos = aciertos;
        acJugador1=0;
        acJugador2=0;
    }

    public int getNumero() {
        return numero1;
    }

    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void ingresoDeDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Jugador-A  --Elige un Numero a Adivinar");
        numero1 = input.nextInt();
        System.out.println("Ingrese la Cantidad de Intentos permitidos");
        aciertos = input.nextInt();
    }

    public void iniciarjuego() {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        for (int i = 0; i < aciertos; i++) {
            System.out.println("Jugador-B  --Adivine el numero");
            numero2 = input.nextInt();
            if (numero2 == numero1) {
                System.out.println("Felicidades Has GANADO!!!");
                acJugador2++;
               return;
            }else if (numero2>numero1){
                System.out.println("El Numero que ingresaste Es Mayor");
                
            }else{
                System.out.println("El Numero que Ingreaste Es Menor");
            }
            }
        System.out.println(" ");
        acJugador1++;
        System.out.println("["+"GAME OVER"+"]" + " ¡¡¡son of the Bitch!!!");
        
        }
    public void Puntaje(){
        System.out.println("Puntaje Jugador A: "+acJugador1);
        System.out.println("Puntaje Jugador B:"+acJugador2);
    }
}
