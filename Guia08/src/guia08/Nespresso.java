/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import Entidades.EJ02Cafetera;
import Servicios.Ej02CaferteraService;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EJ02Cafetera cf = new EJ02Cafetera();
        Ej02CaferteraService cfs =new Ej02CaferteraService();
        Scanner sc = new Scanner(System.in);
      int opcion = 0;
        while (opcion != 5) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir taza de café");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cfs.Llenarcafetera(cf);
                    System.out.println("Cafetera llenada");
                    break;
                case 2:
                    System.out.println("¿Qué tamaño tiene la taza (ml)?");
                    int taza = sc.nextInt();
                    cfs.servirTaza(cf,taza);
                    break;
                case 3:
                    cfs.vaciarCafetera(cf);
                    System.out.println("Cafetera vaciada");
                    break;
                case 4:
                    System.out.println("¿Cuánto café quieres agregar a la cafetera (ml)?");
                    int cantidad = sc.nextInt();
                    cfs.agregarCafe(cf,cantidad);
                    System.out.println("Café agregado");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor selecciona una opción válida");
                    break;
            }
        }
        sc.close();
    }
}
    
 
