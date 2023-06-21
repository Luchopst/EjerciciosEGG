/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MesesService {

    public void Adivinar(Meses mes) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adivine el Mes Secreto ingresando el Mes en Minusculas");
        String Respuesta = input.nextLine();
        
    }
}
