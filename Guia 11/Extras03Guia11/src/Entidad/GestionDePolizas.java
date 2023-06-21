/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 * Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos
 * tanto de un vehículo, como los datos de un solo cliente. Los datos incluidos
 * en ella son: número de póliza, fecha de inicio y fin de la póliza, cantidad
 * de cuotas, forma de pago, monto total asegurado, incluye granizo, monto
 * máximo granizo, tipo de cobertura (total, contra terceros, etc.). Nota:
 * prestar atención al principio de este enunciado y pensar en las relaciones
 * entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
 * muchos a uno o de muchos a muchos.
 *
 * @author User
 */
public class GestionDePolizas {

    private long numeroDePoliza;
    private Date fechaDeInicio;
    private int finDePoliza;
    private int cantidadDeCuotas;
    private int formaDePago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo = true;
    private double montoMaximoGranizo;
    private String tipoDeCobertura;

    public GestionDePolizas() {
    }

    public GestionDePolizas(long numeroDePoliza, Date fechaDeInicio, int finDePoliza, int cantidadDeCuotas, int formaDePago, double montoTotalAsegurado, double montoMaximoGranizo, String tipoDeCobertura) {
        this.numeroDePoliza = numeroDePoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.finDePoliza = finDePoliza;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public long getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(long numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getFinDePoliza() {
        return finDePoliza;
    }

    public void setFinDePoliza(int finDePoliza) {
        this.finDePoliza = finDePoliza;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public int getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(int formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }
 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionDePolizas{");
        sb.append("numeroDePoliza = ").append(numeroDePoliza);
        sb.append(", fechaDeInicio = ").append(fechaDeInicio);
        sb.append(", finDePoliza = ").append(finDePoliza);
        sb.append(", cantidadDeCuotas = ").append(cantidadDeCuotas);
        sb.append(", formaDePago = ").append(formaDePago);
        sb.append(", montoTotalAsegurado = ").append(montoTotalAsegurado);
        sb.append(", incluyeGranizo = ").append(incluyeGranizo);
        sb.append(", montoMaximoGranizo = ").append(montoMaximoGranizo);
        sb.append(", tipoDeCobertura = ").append(tipoDeCobertura);
        sb.append('}');
        return sb.toString();
    }
    
}

