/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.carta;
import Service.CartaService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class JuegoDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        carta car = new carta();
        CartaService cs = new CartaService();
        ArrayList<carta> Mazo = cs.crearMazo();
        cs.menu(Mazo);

    }

}
