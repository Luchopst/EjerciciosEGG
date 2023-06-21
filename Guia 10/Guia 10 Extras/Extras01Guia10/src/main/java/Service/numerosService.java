package Service;

import entidad.numeros;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea una serie de valores numéricos enteros desde
 * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
 * números termina cuando se introduzca el valor -99. Este valor no se guarda en
 * el ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 *
 * @author User
 */
public class numerosService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    numeros N = new numeros();

    public void ingresarNumeros() {
        int val = 0;
        do {
            System.out.println("Ingrese los Valores");
            val = input.nextInt();
            if (val < 99) {
                N.getNum().add(val);
            } else {
                System.out.println("El Valor Ingresado es Incorrecto intentelo de Nuevo");
            }
        } while (!(val == 99));
        System.out.println("los numeros son : " + N.getNum());

    }

}

