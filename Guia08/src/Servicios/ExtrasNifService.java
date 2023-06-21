/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Extras02NifClass;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExtrasNifService {
// Método crearNif(): le pide al usuario el DNI y con ese DNI
//calcula la letra que le corresponderá. Una vez 
//calculado, le asigna la letra que le corresponde según 

    public void crearNif(Extras02NifClass nif) {
        char [] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int varAux;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su DNI: ");
        nif.setDni(input.nextLong());
        varAux = (int) nif.getDni()%23;
        nif.setLetra(vector[varAux]);
    }
//Método mostrar(): que nos permita mostrar el NIF (ocho 
//dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
 public void mostrar(Extras02NifClass nif){
     System.out.println("La Letra Correspondiente al Dni Es: " + nif.getLetra());
 }
 //agrego para ver git a
// La letra correspondiente al dígito verificador se calculará a 
// traves de un método que funciona de la siguiente manera: Para 
// calcular la letra se toma el resto de dividir el número de DNI 
// por 23 (el resultado debe ser un número entre 0 y 22). El método
// debe buscar en un array (vector) de caracteres la posición que 
// corresponda al resto de la división para obtener la letra 
// correspondiente. La tabla de caracteres es la siguiente:
}
