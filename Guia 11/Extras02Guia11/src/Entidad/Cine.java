/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

/**Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 *
 * @author User
 */
public class Cine {
private Pelicula Peliculareproduciendo;
private Sala sala;
private double PrecioEntrada;

    public Cine() {
    }

    public Cine(Pelicula Peliculareproduciendo, Sala sala, double PrecioEntrada) {
        this.Peliculareproduciendo = Peliculareproduciendo;
        this.sala = sala;
        this.PrecioEntrada = PrecioEntrada;
    }

    public Pelicula getPeliculareproduciendo() {
        return Peliculareproduciendo;
    }

    public void setPeliculareproduciendo(Pelicula Peliculareproduciendo) {
        this.Peliculareproduciendo = Peliculareproduciendo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return PrecioEntrada;
    }

    public void setPrecioEntrada(double PrecioEntrada) {
        this.PrecioEntrada = PrecioEntrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cine{");
        sb.append("Peliculareproduciendo = ").append(Peliculareproduciendo);
        sb.append(", sala = ").append(sala);
        sb.append(", PrecioEntrada = ").append(PrecioEntrada);
        sb.append('}');
        return sb.toString();
    }

}
