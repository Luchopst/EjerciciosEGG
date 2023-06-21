package Entidades;

/**
 *
 * @author Carolina
 */
public class Productos {
   String nombre;
   double Precio;

    public Productos() {
    }

    public Productos(String nombre, double Precio) {
        this.nombre = nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

   
     
}