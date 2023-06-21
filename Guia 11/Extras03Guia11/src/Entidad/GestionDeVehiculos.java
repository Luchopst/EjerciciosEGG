/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

/**Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 *
 * @author User
 */
public class GestionDeVehiculos {
private String marca;
private String modelo;
private int anio;
private long numeroDeMotor;
private long chasis;
private String color;
private String tipó;

    public GestionDeVehiculos() {
    }

    public GestionDeVehiculos(String marca, String modelo, int anio, long numeroDeMotor, long chasis, String color, String tipó) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipó = tipó;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(long numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public long getChasis() {
        return chasis;
    }

    public void setChasis(long chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipó() {
        return tipó;
    }

    public void setTipó(String tipó) {
        this.tipó = tipó;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionDeVehiculos{");
        sb.append("marca = ").append(marca);
        sb.append(", modelo = ").append(modelo);
        sb.append(", anio = ").append(anio);
        sb.append(", numeroDeMotor = ").append(numeroDeMotor);
        sb.append(", chasis = ").append(chasis);
        sb.append(", color = ").append(color);
        sb.append(", tip\u00f3 = ").append(tipó);
        sb.append('}');
        return sb.toString();
    }


}
