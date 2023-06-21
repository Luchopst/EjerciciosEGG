/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import java.util.Scanner;

/**Se debe crear también una subclase llamada Televisor con los siguientes atributos:
   resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
   heredados.
   Los constructores que se implementarán serán:
•  Un constructor vacío.
•  Un constructor con la resolución, sintonizador TDT y el resto de los atributos
   heredados. Recuerda que debes llamar al constructor de la clase padre.
 *
 * @author User
 */
public final class Televisor extends Electrodomestico {
private double pulgadas;
private boolean TDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean TDT, String color, char consumo, double peso) {
        super( color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Televisor{");
        sb.append("pulgadas = ").append(pulgadas);
        sb.append(", TDT = ").append(TDT);
        sb.append('}');
        return sb.toString();
    }
    
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    
    public Televisor crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese las Pulgadas");
        this.pulgadas = input.nextDouble();
        System.out.println("tiene TDT? responda TRUE/FAlSE");
        this.TDT = input.hasNextBoolean();
       return new Televisor(pulgadas,TDT, color, consumo, peso);
    }
  
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    
    public double precioFinal(){
        super.precioFinal();
        if (this.pulgadas > 40) {
            this.precio *= 1.3; 
        }
        if (TDT) {
            this.precio += 500;
        }
        return this.precio;
    }
 }
