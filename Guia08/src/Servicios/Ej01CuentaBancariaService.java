package Servicios;


import Entidades.Ej01CuentaBancaria;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Ej01CuentaBancariaService {

    Ej01CuentaBancaria cb = new Ej01CuentaBancaria();
    Scanner input = new Scanner(System.in);

    //primer metodo
    public void CrearCuenta() {
//Método para crear cuenta pidiéndole los datos al usuario.
        System.out.println("Ingrese su Numero De Cuenta");
        cb.setNumeroCuenta(input.nextInt());
        System.out.println("INgrese su DNI");
        cb.setDniCliente((int) input.nextLong());

    }

    //segundo metodo
    public double Ingresar() {

//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
//sumará al saldo actual.
        double saldo = 0;
        System.out.println("Ingrese Saldo");
        saldo = input.nextDouble();
        System.out.println("Su Saldo Actuas ahora es: $"+cb.getSaldoActual()+saldo);
        return  cb.getSaldoActual() + saldo;
    }
//Método retirar(double): recibe una cantidad de dinero a retirar 
//y se le restara al saldo actual. Si la cuenta no tiene la 
//cantidad de dinero a retirar se retirará el máximo 
//posible hasta dejar la cuenta en 0.

    public void Retirar() {
        double monto = 0;
        System.out.println("Ingrese el Monto a Retirar");
        monto = input.nextDouble();
        monto = cb.setSaldoActual();
        if (monto > cb.setSaldoActual()||cb.getSaldoActual()==0) {
            System.out.println("No Hay Suficiente saldo En La Cuenta");
            System.out.println("El dinero disponible es: " + cb.getSaldoActual());
            System.out.println(" ");
            System.out.println("Por Favor Ingrese Dinero Para seguir Operando. Gracias");
        } else {
            monto -= cb.setSaldoActual();
            System.out.println("Se Ha Retirado: " + monto);
            System.out.println("su saldo actual es: " + cb.getSaldoActual());
        }
    }

    public double extraccionRapida() {
        //Método extraccionRapida: le permitirá sacar solo un 20% 
        //de su saldo. Validar que el usuario no saque más del 20%.
        double monto = 0;
        System.out.println("Ingrese un Monto a Retirar");
        monto = input.nextDouble();
        if (monto >(cb.getSaldoActual()*0.2)){
            System.out.println("Solo Puede Retirar El 20% De su saldo total");
            System.out.println("Su monto disponible para Extraccion RApida es: " + (monto=cb.getSaldoActual()*0.2) );
        }else{
             monto-=cb.getSaldoActual()*0.2;
             System.out.println("Su saldo a Retirar es: " + monto);
        }
        return monto;
    }
    public void ConsultaeSaldo(){
        cb.getSaldoActual();
    }
    public void ConsultarDatos(){
        System.out.println(cb.getDniCliente());
        System.out.println(cb.getNumeroCuenta());
        System.out.println(cb.getSaldoActual());
        
        
    }

}
