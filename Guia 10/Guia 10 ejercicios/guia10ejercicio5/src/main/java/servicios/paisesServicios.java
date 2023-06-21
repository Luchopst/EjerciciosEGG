
package servicios;

import entidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class paisesServicios {
    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private Set<Paises> paises = new HashSet<>();
    private TreeSet<Paises> treePaises = new TreeSet<>();

    public void CrearPais() {
        do {
            System.out.println("Ingrese el Pais");
            paises.add(new Paises(input.next()));
            treePaises = new TreeSet<>(paises);
            System.out.println("Desea Ingresar Otro Pais?? Responda S/N");
            if (input.next().equalsIgnoreCase("n")) {
                System.out.println("Hasta la Vista BABY");
                break;
            }
        } while (true);
        
    }
    
    public void MostrarHAsh() {
        for (Paises paisAux : paises) {
            System.out.println(" Los Paises en HashSet Son: " + paisAux.toString());
           
        }
      
    }
    public void MostrarTree(){
        for (Paises p1 : treePaises) {
            System.out.println("Los Paises en treeSet son: "+ p1.toString());
        }
    }
    public void BuscarYEliminar(){
         System.out.print("Ingresar el pais a buscar y eliminar: ");
        String p = input.next();
        Paises p1 = new Paises(p);
        if (paises.contains(p1)) {
            Iterator<Paises> iter = paises.iterator();
            while (iter.hasNext()) {
                if (iter.next().getPais().equals(p)) {
                    iter.remove();
                    break;
                }
            }
            System.out.println("Lista con el pais "+p+" eliminado:");
            System.out.println("--------------------------------------------------");
            MostrarHAsh();
        }else
            System.out.println("--- El pais "+p+" no se encuentra en el conjunto ---");
    }
}