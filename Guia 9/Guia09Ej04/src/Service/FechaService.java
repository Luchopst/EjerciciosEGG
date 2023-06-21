/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FechaService {
//Método fechaNacimiento que pregunte al usuario día, mes y año 
//de su nacimiento. Luego los pase por parámetro a un nuevo objeto 
//Date. El método debe retornar el objeto Date. Ejemplo fecha: Date
//fecha = new Date(anio, mes, dia);


    public Date fechaNacimiento() {
        Scanner input = new Scanner(System.in);
        System.out.println("[" + "A continuacion debera Ingresar su Fecha de Nacimiento" + "]");
        System.out.println("Ingrese Dia en Numeros");
        int dia = input.nextInt();
        System.out.println("Ingrese el Mes en Numeros");
        int mes = input.nextInt();
        System.out.println("Ingrese el Año en Numeros");
        int age = input.nextInt();
        return new Date(dia,mes,age);
    }
//Método fechaActual que cree un objeto fecha con el día actual. 
//Para esto usaremos el constructor vacío de la clase Date. 
//Ejemplo: Date fechaActual = new  Date(); 
//El método debe retornar el objeto Date.    

    public Date fechaActual() {
        Date fecha = new Date();
        return fecha;
    }
//Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).

    public int diferencia(Date fecha1, Date fecha2) {
     int age1 = fecha1.getAge();
     int age2 = fecha2.getAge();
     int resto = age1-age2;
        return resto ;
    }
}
