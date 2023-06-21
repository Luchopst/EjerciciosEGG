package Guia10ejercicio5;

import servicios.paisesServicios;



public class PaisMain {

    public static void main(String[] args) {
       paisesServicios ps = new paisesServicios();
        ps.CrearPais();
        System.out.println("----------------");
        System.out.println("Lista Desordenada");
        ps.MostrarHAsh();
        System.out.println("-----------------");
        System.out.println("Lista Ordenada");
        ps.MostrarTree();
        System.out.println("-----------------");
        System.out.println("["+"en Cas de que desee Eliminar algun Pais..."+"]");
        ps.BuscarYEliminar(); 
    }
}