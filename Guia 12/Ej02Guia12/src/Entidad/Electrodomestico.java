/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso.
 *
 * @author User
 */
public class Electrodomestico {

    protected Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected double precio = 1000;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico( String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
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
        sb.append("Electrodomestico{");
        sb.append(", color =").append(color);
        sb.append(", consumo =").append(consumo);
        sb.append(", peso =").append(peso);
        sb.append('}');
        return sb.toString();
    }

    public char ComprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if ((letra >= 'A') && (letra <= 'F')) {
            this.consumo = letra;
        } else {
            this.consumo = 'F';
        }
        return this.consumo;
    }//finaliza el metodo ComprobarConsumoEnergetico
    //--------------------------------------------------

    public String ComprobarColor(String colorA) {
//Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.

        if (colorA.equalsIgnoreCase("Blanco") || colorA.equalsIgnoreCase("Negro") || colorA.equalsIgnoreCase("Rojo") || colorA.equalsIgnoreCase("Azul") || colorA.equalsIgnoreCase("Gris")) {
            this.color = colorA;
        } else {
            this.color = "Blanco";
        }
        return this.color;
    }//finaliza el metodo ComprobarClor
//----------------------------------------------------------------
//Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.

    public Electrodomestico crearElectrodomestico() {
        System.out.println("Ingrese el Color");
        color = ComprobarColor(input.next());
        System.out.println("ingrese el Consumo");
        consumo = ComprobarConsumoEnergetico(input.next().charAt(0));
        System.out.println("ingrese el Peso");
        peso = input.nextDouble();
        
        return new Electrodomestico(color, consumo, peso);
    }//finaliza el metodo crearElectrodomestico()
    //--------------------------------------------------------------

//Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:LETRA PRECIO
//A $1000                    PESO PRECIO
//B $800                 Entre 1 y 19 kg $100
//C $600                 Entre 20 y 49 kg $500
//D $500                 Entre 50 y 79 kg $800
//E $300                 Mayor que 80 kg $1000
//F $100                 
    public double precioFinal() {
        switch (consumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            this.precio = 100;
        } else {

        }
        if (peso >= 20 && peso <= 49) {
            this.precio += 500;
        }

        if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        }

        if (peso > 80) {
            this.precio += 1000;
        }
        
        return this.precio;
    }
}
