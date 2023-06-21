/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ElectroMain {

    /**
     * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
     * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
     * precio final de los dos electrodomésticos.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(35.00,  "Rojo", 'B', 60.65));
        electrodomesticos.add(new Lavadora(45.00, "Negro", 'F', 45.55));
        electrodomesticos.add(new Televisor(40,true, "Negro", 'D', 45.55));
        electrodomesticos.add(new Televisor(55,false, "Negro", 'C', 45.55));
        System.out.println("---------------");
        for (Electrodomestico electro : electrodomesticos) {
            electro.precioFinal();
            System.out.println("el Precio Final Es: "+ electro.getPrecio());
        }
        System.out.println("---------------");
        double precioGral = 0;
        for (Electrodomestico electroGral : electrodomesticos) {
            precioGral += electroGral.getPrecio();
            
        }
        System.out.println("el Precio Total es: "+ precioGral);
//        System.out.println("    Lavadora");
//        lavadora.crearLavadora();
//        System.out.println("  ------------");
//        lavadora.precioFinal();
//        System.out.println("Precio Final: " + lavadora.precioFinal());
//
//        System.out.println("    Televisor");
//        new Televisor.crearTelevisor();
//        System.out.println("  -------------");
//        televisor.precioFinal();
//        System.out.println("Precio Final: " + televisor.precioFinal());
    }
//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
}
