/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Alquiler {

    long cantidadDeDias = 0;
    Barco barco = new Barco();
    Velero velero = new Velero();
    BarcoMotor barcoMotor = new BarcoMotor();
    Yate yate = new Yate();
    protected Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected String nombre;
    protected int dniCliente;
    protected LocalDate fechaDeAlquiler;
    protected LocalDate fechaDeDevolucion;
    protected int posicionDeAmarre;
    protected Barco barcoQueOcupara;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dniCliente, int posicionDeAmarre, Barco barcoQueOcupara) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.posicionDeAmarre = posicionDeAmarre;
        this.barcoQueOcupara = barcoQueOcupara;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosicionDeAmarre() {
        return posicionDeAmarre;
    }

    public void setPosicionDeAmarre(int posicionDeAmarre) {
        this.posicionDeAmarre = posicionDeAmarre;
    }

    public Barco getBarcoQueOcupara() {
        return barcoQueOcupara;
    }

    public void setBarcoQueOcupara(Barco barcoQueOcupara) {
        this.barcoQueOcupara = barcoQueOcupara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("input=").append(input);
        sb.append(", nombre = ").append(nombre);
        sb.append(", dniCliente = ").append(dniCliente);
        sb.append(", fechaDeAlquiler = ").append(fechaDeAlquiler);
        sb.append(", fechaDeDevolucion = ").append(fechaDeDevolucion);
        sb.append(", posicionDeAmarre = ").append(posicionDeAmarre);
        sb.append(", barcoQueOcupara = ").append(barcoQueOcupara);
        sb.append('}');
        return sb.toString();
    }
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).

    public Alquiler crearAlquiler() {
        DecimalFormat df = new DecimalFormat("###,###,###,###.00");
        boolean bandera = true;
        int opcion = 0;
        System.out.println("Ingrese el Nombre");
        nombre = input.next();
        System.out.println("Ingrese el DNI");
        dniCliente = input.nextInt();
        System.out.println("Ingrese la Fecha inicial del Alquiler");
        System.out.println("Año/Mes/Dia");
        fechaDeAlquiler = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("Ingrese la fecha de finalizacion de Alquiler");
        System.out.println("Año/Mes/Dia");
        fechaDeDevolucion = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("cantidad de dias alquilado: " + DiasDeAlquiler());
        System.out.println("Ingrese la Posicion de Amarre");
        posicionDeAmarre = input.nextInt();
        System.out.println("Ingrese el Tipo de Barco que Ocupara");
        System.out.println("------------------");
        System.out.println("1- Velero");
        System.out.println("2- Barco a Motor");
        System.out.println("3- Yate");
        System.out.println("------------------");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                velero.crearVelero();
                System.out.println("El total del Alquiler de Velero es: USD " + df.format((velero.calcularModulo() + DiasDeAlquiler())));
                break;
            case 2:
                barcoMotor.crearBarcoMotor();
                System.out.println("El total del Alquiler de Barco a Motor es: USD " + df.format(barcoMotor.calcularModulo() + DiasDeAlquiler()));
                break;
            case 3:
                yate.crearYate();
                System.out.println("El total del Alquiler de Yate es: USD " + df.format(yate.calcularModulo() + DiasDeAlquiler()));
                break;
            case 4:
                System.out.println("Selecciono salir");
                bandera = false;
                break;

        }

        return new Alquiler();
    }

    public long DiasDeAlquiler() {
        return cantidadDeDias = ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolucion);
    }
}



