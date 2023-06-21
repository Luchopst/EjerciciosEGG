/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Curso;
import Service.cursoService;

/**
 *
 * @author User
 */
public class CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cursoService cs = new cursoService();
        Curso C1 = cs.crearCurso();
        System.out.println("las Ganancias Son: "+cs.calcularGananciaSemanal(C1));
    }
    
}
