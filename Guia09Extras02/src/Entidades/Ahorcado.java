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
public class Ahorcado {
    private char[] caracteres;
    private int LetrasEncontradas;
    private int CantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int LetrasEncontradas, int CantJugadasMax) {
        this.caracteres = palabra;
        this.LetrasEncontradas = LetrasEncontradas;
        this.CantJugadasMax = CantJugadasMax;
    }

    public char[] getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(char[] caracteres) {
        this.caracteres = caracteres;
    }

    public int getLetrasEncontradas() {
        return LetrasEncontradas;
    }

    public void setLetrasEncontradas(int LetrasEncontradas) {
        this.LetrasEncontradas = LetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return CantJugadasMax;
    }

    public void setCantJugadasMax(int CantJugadasMax) {
        this.CantJugadasMax = CantJugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + caracteres + ", LetrasEncontradas=" + LetrasEncontradas + ", CantJugadasMax=" + CantJugadasMax + '}';
    }


}
