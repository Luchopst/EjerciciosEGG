/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01.Ejercicio05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in);
//******ATRIBUTOS************
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
//**********METODO RETIRAR DINERO************

    public void retirarDinero() {
        boolean salir = false;
        double cantidad;

        do {
            System.out.println("Ingrese el saldo a retirar");
            cantidad = leer.nextDouble();

            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                System.out.println("Error: saldo insuficiente");
            }
            System.out.println("Su saldo actual es de: " + saldo);
            System.out.println("Desea continuar? s/n");
            String continuar = leer.next();
            if (continuar.equalsIgnoreCase("n")) {
                salir = true;
                System.out.println("que siga gastando dinero :D");
            }

        } while (!salir);
    }
}
