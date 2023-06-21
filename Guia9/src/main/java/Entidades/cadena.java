/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class cadena {
    private String frase;
    private int longitus;

    public cadena() {
    }

    public cadena(String frase, int longitus) {
        this.frase = frase;
        this.longitus = longitus;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitus() {
        return longitus;
    }

    public void setLongitus(int longitus) {
        this.longitus = longitus;
    }

    @Override
    public String toString() {
        return "cadena{" + "frase=" + frase + ", longitus=" + longitus + '}';
    }
    
}
