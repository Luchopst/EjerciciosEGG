
import Entidades.Alumno;
import Service.alumnoService;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumnoService servi = new alumnoService();
        List<Alumno> cursito = servi.crarAlumnos();
        System.out.println(servi.notaFinal(cursito));
    }
    
}
