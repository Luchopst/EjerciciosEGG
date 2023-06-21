/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "cine{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<pelicula> OrdenarPorDuracion = new Comparator<pelicula>() {

        @Override
        public int compare(pelicula p1, pelicula p2) {

            return p1.getDuracion().compareTo(p2.getDuracion());
        }

    };
      public static Comparator<pelicula> OrdenarPorTitulo = new Comparator<pelicula>() {

        @Override
        public int compare(pelicula p1, pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };
      public static Comparator<pelicula> OrdenarPorDirector = new Comparator<pelicula>() {

        @Override
        public int compare(pelicula p1, pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());
        }

    };
}
