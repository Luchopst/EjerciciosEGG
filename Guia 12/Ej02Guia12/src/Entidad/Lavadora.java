/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre.
 *
 * @author User
 */
public final class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, String color, char consumo, double peso) {
        super(color, consumo, peso);
        this.carga = carga;
    }

    public double isCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga = " + carga + '}';
    }
//Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.

    public Lavadora crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("ingrese La Carga");
        carga = input.nextDouble();
        return new Lavadora(carga, color, consumo, peso);
    }//finaliza el metodo crearElectrodomestico()

//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    public double precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            super.precio += 500;
        }
        return this.precio;
    }
}
