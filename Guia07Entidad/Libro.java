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
public class Libro {
      public long ISBN;
    public int numeroDePaginas;
    public String titulo,autor;
   
    public Libro (long ISBN,int numeroDePaginas,String titulo,String autor){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.numeroDePaginas=numeroDePaginas;
        this.autor=autor;
        
        
    }
    
    public Libro(){
        
    }        
    public static Libro crearlibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("escribe el ISBN");
        long isbn=leer.nextLong();
        
        System.out.println("escribe el titulo");
        String titulo=leer.next();
        System.out.println("escribe el autor");
        String autor=leer.next();
        System.out.println("escribe el numero de paginas");
        int numDePag=leer.nextInt();
        
        Libro libro1=new Libro(isbn, numDePag,titulo,autor);
        
      return libro1;  
    }       
    public void mostrarlibro(){
        System.out.println("el ISBN del libro es: "+this.ISBN);
        System.out.println("el autor del libro es: "+this.autor);
        System.out.println("el titulo del libro es: "+this.titulo);
        System.out.println("y tiene "+this.numeroDePaginas+" paginas");
    }
    
}
