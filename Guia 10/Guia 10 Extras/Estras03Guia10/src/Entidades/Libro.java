/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Libro {
    private String tituloDeLibro;
    private String autor;
    private int numeroDeEjemplares;
    private int numerosdeEjemplaresPrestados=0;

    public Libro() {
         
    }

    public Libro(String autor, int numeroDeEjemplares, int numerosdeEjemplaresPrestados,String tituloDeLibro) {
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numerosdeEjemplaresPrestados = numerosdeEjemplaresPrestados;
        this.tituloDeLibro = tituloDeLibro;
    }

    public String getTituloDeLibro() {
        return tituloDeLibro;
    }

    public void setTituloDeLibro(String tituloDeLibro) {
        this.tituloDeLibro = tituloDeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumerosdeEjemplaresPrestados() {
        return numerosdeEjemplaresPrestados;
    }

    public void setNumerosdeEjemplaresPrestados(int numerosdeEjemplaresPrestados) {
        this.numerosdeEjemplaresPrestados = numerosdeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", numeroDeEjemplares=" + numeroDeEjemplares + ", numerosdeEjemplaresPrestados=" + numerosdeEjemplaresPrestados + '}';
    }
    
}
 