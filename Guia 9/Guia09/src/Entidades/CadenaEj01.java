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
public class CadenaEj01 {
    private String frase;
    private int longitud;

    public CadenaEj01() {
    }

    public CadenaEj01(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.longitud = frase.length();
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

          
}
