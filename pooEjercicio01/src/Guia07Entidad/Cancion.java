/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

/**
 *
 * @author User
 */
public class Cancion {
    
    private String Autor;
    private String Name;

    public Cancion() {
    }

    public Cancion(String Autor, String Name) {
        this.Autor = Autor;
        this.Name = Name;
    }

    public String getAutor() {
        return Autor;
    }

    public String getName() {
        return Name;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
