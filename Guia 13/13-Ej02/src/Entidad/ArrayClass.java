/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author User
 */
public class ArrayClass {

    private int[] vector = new int[6];
    Random rand = new Random();
   
    public void llenar() {
        for (int i = 0; i < 10; i++) {
            vector[i] = rand.nextInt(10);
        }
    }
    public void llenar2() {
        for (int i = 0; i < 8; i++) {
            vector[i] = rand.nextInt(10);
            System.out.println(vector[i]);
        }
        System.out.println("Llenado Correcto");
    }
    

}
