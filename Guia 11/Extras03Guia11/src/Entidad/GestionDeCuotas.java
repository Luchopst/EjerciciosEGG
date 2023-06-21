/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import java.util.Date;

/**Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 *
 * @author User
 */
public class GestionDeCuotas {
private int numeroDeCuotas;
private double montoTotaldeCuota;
private boolean Paga= true;
private Date fechaDeVencimiento;
private String formaDePago;

    public GestionDeCuotas() {
    }

    public GestionDeCuotas(int numeroDeCuotas, double montoTotaldeCuota, Date fechaDeVencimiento, String formaDePago) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoTotaldeCuota = montoTotaldeCuota;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoTotaldeCuota() {
        return montoTotaldeCuota;
    }

    public void setMontoTotaldeCuota(double montoTotaldeCuota) {
        this.montoTotaldeCuota = montoTotaldeCuota;
    }

    public boolean isPaga() {
        return Paga;
    }

    public void setPaga(boolean Paga) {
        this.Paga = Paga;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionDeCuotas{");
        sb.append("numeroDeCuotas = ").append(numeroDeCuotas);
        sb.append(", montoTotaldeCuota = ").append(montoTotaldeCuota);
        sb.append(", Paga = ").append(Paga);
        sb.append(", fechaDeVencimiento = ").append(fechaDeVencimiento);
        sb.append(", formaDePago = ").append(formaDePago);
        sb.append('}');
        return sb.toString();
    }

}
