/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author User
 */
public class calculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        circulo.area();
        System.out.println();
        circulo.perimetro();
        System.out.println("----------------");
        rectangulo.perimetro();
        rectangulo.area();
    }

}
