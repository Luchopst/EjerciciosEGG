/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

/**Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 *
 * @author User
 */
public class GestionIntegralDeClientes {
private String nombre;
private String apellido;
private int dni;
private String mail;
private String domicilio;
private int telefono;

    public GestionIntegralDeClientes() {
    }

    public GestionIntegralDeClientes(String nombre, String apellido, int dni, String mail, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GestionIntegralDeClientes{");
        sb.append("nombre = ").append(nombre);
        sb.append(", apellido = ").append(apellido);
        sb.append(", dni = ").append(dni);
        sb.append(", mail = ").append(mail);
        sb.append(", domicilio = ").append(domicilio);
        sb.append(", telefono = ").append(telefono);
        sb.append('}');
        return sb.toString();
    }

}
