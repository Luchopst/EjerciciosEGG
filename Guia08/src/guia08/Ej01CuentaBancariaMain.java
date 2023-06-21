/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import Servicios.Ej01CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej01CuentaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej01CuentaBancariaService bank = new Ej01CuentaBancariaService();
        Scanner input = new Scanner(System.in);
        boolean salir = true;
        int opcion = 0;
        do {
            System.out.println("["+"Ingrese La Opcion Deseada"+"]");
            System.out.println("1-Crear Cuenta");
            System.out.println("2-Ingresar Dinero");
            System.out.println("3-Extraccion Rapida");
            System.out.println("4-Retirar");
            System.out.println("5-Consultar Saldo");
            System.out.println("6-Consultar Datos");
            System.out.println("7-Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    bank.CrearCuenta();
                    System.out.println("[" + "Cuenta Creada Correctamente" + "]");
                    System.out.println("[" + "Muchas Gracias por Su Visita" + "]");
                    break;
                case 2:
                    bank.Ingresar();
                    break;
                case 3:
                    bank.extraccionRapida();
                    System.out.println("["+"Muchas Gracias por Su Visita"+"]");
                    break;
                case 4:
                    bank.Retirar();
                    break;
                
                case 5:
                    bank.ConsultaeSaldo();
                    System.out.println("["+"Muchas Gracias por Su Visita"+"]");
                    break;
                case 6:
                    bank.ConsultarDatos();
                   System.out.println("["+"Muchas Gracias por Su Visita"+"]");
                    break;
                default:
                    System.out.println("["+"Opcion Incorrecta"+"]");
                    System.out.println("["+"Intente Nuevamente"+"]");
            }
        } while (!salir);

    }

}
