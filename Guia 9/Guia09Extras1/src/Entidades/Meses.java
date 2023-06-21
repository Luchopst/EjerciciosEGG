/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author User
 */
public class Meses {

   String[] mesesDelAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private String mesSecreto = mesesDelAnio[6];

    public Meses() {
    }

    public String[] getMes() {
        return  mesesDelAnio;
    }

    public void setMes(String[] mes) {
        this. mesesDelAnio = mesesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
