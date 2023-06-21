/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio04class {

    private int base;
    private int altura;

    public ejercicio04class(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public ejercicio04class() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    public void solicitarDatos(){
    Scanner input =new Scanner(System.in);
        System.out.println("Ingrese la Base del rectangulo");
        base = input.nextInt();
        
        System.out.println("Ingrese la Altura del rectangulo");
        altura = input.nextInt();
        
         
}
    public int perimetro(){
       int  perim = (base + altura)*2;
       return perim;
    }
    public int Superficie(){
        int sup = (base * altura);
        return sup;
    }
    public void rectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if((i==0 || i==altura-1)||( j==0 || j == base-1)){
                System.out.print(" * ");
                
            }else{
                  System.out.print("   ");  
                }
                
                
            }
            System.out.println(" "); 
        }
    }
}
