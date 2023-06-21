/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class LibroService {

    HashSet<Libro> L = new HashSet<>();
    Libro libro = new Libro();
    Iterator <Libro> it = L.iterator();

    public void prestamo() {
        System.out.println("Ingrese el nombre del Libro a Prestar");

    }
}
