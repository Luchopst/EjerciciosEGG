/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import Entidades.Extras01Raices;
import Servicios.Extras01RaicesService;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extras01RaicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
   
        Extras01RaicesService RS = new Extras01RaicesService();
       
        Extras01Raices R = new Extras01Raices();
        RS.Ingreso(R);
        RS.calcular(R);

    }

}
