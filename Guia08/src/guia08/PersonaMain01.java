/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

/**
 *
 * @author User
 */
public class PersonaMain01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio P2 = new PersonaServicio();
        Persona P3 = P2.CrearPersonas();
        P2.Mostrar(P3);
    }
    
}
