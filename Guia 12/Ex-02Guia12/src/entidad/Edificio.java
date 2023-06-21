/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author User
 */
public class Edificio {

    protected double ancho;
    protected double alto;
    protected double largo;

//Método calcularSuperficie(): calcula la superficie del edificio.
    public void calcularSuperficie() {
        double SuperficieTotal = 2*(ancho*alto*largo);
    }
//Método calcularVolumen(): calcula el volumen del edifico.

}
