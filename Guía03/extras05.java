/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía03;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
* todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
* los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que
* represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 * @author User
 */
public class extras05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el plan A-B-C");
       Scanner input = new Scanner(System.in);
        String plan = input.nextLine();
        double val1 = 500;
        double desc ;
        System.out.println("El Valo del tratamiento es: " + val1 );
        switch(plan.toUpperCase()){
            case "A":
                System.out.println("Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento");
               desc = val1/2;
                System.out.println(desc);
                break;
           
            case "B":
                System.out.println("Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento");
               desc = (val1*65)/100;
               System.out.println(desc);
                break;
                case "C":
                System.out.println("Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.");
               
               System.out.println(val1);
                break;
                default: System.out.println("Opcion no valida");
                
        }
    }
    
}
