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
public class Receta {
    private String nombre;
    private String[] ingresientes;
    private int[] cantidades;

    public Receta() {
    }

    public Receta(String nombre, String[] ingresientes, int[] cantidades) {
        this.nombre = nombre;
        this.ingresientes = ingresientes;
        this.cantidades = cantidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngresientes() {
        return ingresientes;
    }

    public void setIngresientes(String[] ingresientes) {
        this.ingresientes = ingresientes;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(int[] cantidades) {
        this.cantidades = cantidades;
    }
    
}
