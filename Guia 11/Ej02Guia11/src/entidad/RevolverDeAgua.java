package entidad;

import java.util.Random;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 * @author User • llenarRevolver(): le pone los valores de posición actual y de
 * posición del agua. Los valores deben ser aleatorios.
 *
 * • mojar(): devuelve true si la posición del agua coincide con la posición
 * actual
 *
 * • siguienteChorro(): cambia a la siguiente posición del tambor
 *
 * • toString(): muestra información del revolver (posición actual y donde está
 * el agua)
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
//     llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//       deben ser aleatorios.

    public void llenarRevolver() {
        Random ram = new Random();
        posicionActual = ram.nextInt(6)+1;
        posicionAgua = ram.nextInt(6)+1;
        
    }

    public boolean mojar() {
        //mojar(): devuelve true si la posición del agua coincide con la posición actual
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        // siguienteChorro(): cambia a la siguiente posición del tambor
        if (posicionActual == 6){
             posicionActual =1;
        }else{
             posicionActual++;
        }
           
        
    }
    public void mostrar(){
       // toString(): muestra información del revolver (posición actual y donde está el agua)
         System.out.println(toString());
    }
}