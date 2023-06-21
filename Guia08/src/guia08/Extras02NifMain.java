/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import Entidades.Extras02NifClass;
import Servicios.ExtrasNifService;

/**
 *
 * @author User
 */
public class Extras02NifMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtrasNifService nf = new ExtrasNifService();
        Extras02NifClass nfc =new Extras02NifClass();
        nf.crearNif(nfc);
        nf.mostrar(nfc);
    }
    
}
