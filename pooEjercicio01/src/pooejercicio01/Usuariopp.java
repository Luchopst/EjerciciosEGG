/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author User
 */
public class Usuariopp {
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;
    
    public Usuariopp(){
        
    }

    public Usuariopp(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
        
    
}
