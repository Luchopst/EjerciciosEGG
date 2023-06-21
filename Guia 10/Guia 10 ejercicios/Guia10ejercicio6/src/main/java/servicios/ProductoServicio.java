package Servicios;

import Entidades.Productos;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class ProductoServicio {

    private HashMap<String, Double> productos;

    public ProductoServicio() {
        productos = new HashMap<>();

    }

    public void Menu() {
        Scanner input = new Scanner(System.in);
        Productos pr = new Productos();
   while(true){
        System.out.println("\n----- Menú -----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Modificar precio de producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Salir");
        System.out.println(" ");

        System.out.print("Ingrese una opción: ");

        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del producto ");
                pr.setNombre(input.nextLine());
                System.out.println("Ingrese el precio del producto");
                pr.setPrecio(input.nextDouble());
                agregarProducto(pr.getNombre(), pr.getPrecio());
                break;

            case 2:
                System.out.print("Ingrese el nombre del producto a modificar: ");
                String nombreModificar = input.nextLine();
                System.out.print("Ingrese el nuevo precio del producto: ");
                double precioModificar = input.nextDouble();
                modificarPrecio(nombreModificar, precioModificar);
                break;

            case 3:
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String nombreEliminar = input.nextLine();
                eliminarProducto(nombreEliminar);
                break;

            case 4:
                mostrarProductos();
                break;

            case 5:
                return;
            default:
                System.out.println("Opcion invalida.");
        }

    }
    }
    public void agregarProducto(String nombre, double Precio) {

        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya ha sido ingresado ");
        } else {
            productos.put(nombre, Precio);
            System.out.println("Producto agregado correctamente");
        }
    }

    public void modificarPrecio(String nombre, double Precio) {

        if (productos.containsKey(nombre)) {
            productos.put(nombre, Precio);
            System.out.println("El precio del producto modificado correctamente");

        } else {
            System.out.println("El producto no se encuentra registrado");
        }
    }

    public void eliminarProducto(String nombre) {

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente");

        } else {
            System.out.println("El producto no se encontro");
        }

    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");

        } else {
            System.out.println("Productos registrados :");
            for (String nombre : productos.keySet()) {
                double precios = productos.get(nombre);
                System.out.println(nombre + " $ " +" "+"["+ precios+"]");

            }
        }
    }

}