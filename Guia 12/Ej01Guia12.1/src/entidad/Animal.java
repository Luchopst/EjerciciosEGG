/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta. Generar una clase Main que realice lo siguiente
 *
 * @author User
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("nombre = ").append(nombre);
        sb.append(", alimento = ").append(alimento);
        sb.append(", edad = ").append(edad);
        sb.append(", raza = ").append(raza);
        sb.append('}');
        return sb.toString();
    }
//    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//    mensaje por pantalla informando de que se alimenta.  

    public void Alimento() {
        System.out.println("El Aminal Se Alimenta de: " + alimento);
    }
}
