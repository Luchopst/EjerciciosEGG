/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.ArrayClass;

/**
 *
 * @author User
 */
public class ArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayClass ac = new ArrayClass();
        try {
            ac.llenar();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fuera de Rango");
            try{
               ac.llenar2(); 
            }catch(ArrayIndexOutOfBoundsException r){
                System.out.println("mensaje");
                try{
               ac.llenar2(); 
            }catch(ArrayIndexOutOfBoundsException u){
                System.out.println("mensaje 2");
            }
            }
            
        }

    }

}
