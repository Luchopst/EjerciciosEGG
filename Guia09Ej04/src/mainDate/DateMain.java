/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainDate;

import Entidades.Date;
import Service.FechaService;

/**
 *
 * @author User
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FechaService fs = new FechaService();
       Date fecha1 = fs.fechaNacimiento();
       Date fecha2 = new Date(11,01,2023);
       
        System.out.println("La Diferencia es: "+fs.diferencia(fecha1, fecha2));  
    }

}
