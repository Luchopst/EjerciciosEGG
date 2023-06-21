/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09;

import Entidades.CadenaEj01;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CadenaEj01 cadena = new CadenaEj01();
        CadenaServicios cs = new CadenaServicios();
        System.out.println("ingrese una Frase");
        cadena.setFrase(input.nextLine());
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        System.out.println("Ingrese Letra a Contabilizar");
        cs.vecesRepetido(cadena, input.next());
        cs.compararLongitud(cadena);
        cs.unirFrases(cadena);
        System.out.println("Ingrese un Caracter a Reemplazar la Letra a");
        cs.reemplazar(cadena, input.next());
        System.out.println("Ingrese un Caracter a Buscar");
        System.out.println("¿¿¿La Letra Fue encontrada??? " + cs.contiene(cadena, input.next()));
    }

}
