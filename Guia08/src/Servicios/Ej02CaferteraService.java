/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.EJ02Cafetera;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej02CaferteraService {



    public EJ02Cafetera Llenarcafetera(EJ02Cafetera cf) {
        cf.setCantidadActual(cf.getCapacidadMaxima());
         System.out.println(" El cafe Restante es: " + cf.getCantidadActual());
        return cf;
    }

    public EJ02Cafetera vaciarCafetera(EJ02Cafetera cf) {
     cf.setCantidadActual(0);
      System.out.println(" El cafe Restante es: " + cf.getCantidadActual() + " ml");
        return cf;
    }

    public EJ02Cafetera agregarCafe(EJ02Cafetera cf, int cantidad) {
        int cantidadTotal = cf.getCantidadActual()+cantidad;
        if (cantidadTotal > cf.getCapacidadMaxima()){
            System.out.println("No se Puede Realizar la Carga");
            System.out.println(" El cafe Restante es: " + cf.getCantidadActual() + " ml");
        }else{
            cf.setCantidadActual(cantidadTotal);
            System.out.println("Se Ha Agregado "+ cantidad + "ml. de Cafe a La Cafetera");
        }
        System.out.println(" El cafe Restante es: " + cf.getCantidadActual()+ " ml");
        return cf;
    }

    public void servirTaza(EJ02Cafetera cf, int tam) {

        if (tam > cf.getCantidadActual()) {
            System.out.println("La cantidad de cafe no alcanza para la Cantidad Solicitada.");
            System.out.println("La taza se cargo con " + cf.getCantidadActual());
            cf.setCantidadActual(0);
        } else {
            cf.setCantidadActual(cf.getCantidadActual() - tam);
            System.out.println("La taza se lleno.");
        }
        System.out.println("");
        System.out.println("Cafe servido.");
        System.out.println(" El cafe Restante es: " + cf.getCantidadActual()+ " ml");
    }
}
