/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.GestionDeCuotas;
import Entidad.GestionDePolizas;
import Entidad.GestionDeVehiculos;
import Entidad.GestionIntegralDeClientes;

/**
 *
 * @author User
 */
public class SeguroService {

    GestionIntegralDeClientes gic = new GestionIntegralDeClientes();
    GestionDeVehiculos gv = new GestionDeVehiculos();
    GestionDePolizas gp = new GestionDePolizas();
    GestionDeCuotas gc = new GestionDeCuotas();
}
