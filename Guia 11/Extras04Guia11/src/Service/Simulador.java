/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
//La clase Simulador debe tener un método que genere un listado de alumnos manera
//aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
//manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulador {

    private List<String> nombres;
    private List<String> apellidos;

    public Simulador() {
        // listas de nombres y apellidos
        nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");

        apellidos = new ArrayList<>();
        apellidos.add("Gómez");
        apellidos.add("López");
        apellidos.add("Martínez");
        apellidos.add("Rodríguez");
    }

    public List<String> generarListadoAlumnos(int cantidad, int rangoDNIInicio, int rangoDNIFin) {
        List<String> listadoAlumnos = new ArrayList<>();
        List<String> listadoDNIs = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres.get(random.nextInt(nombres.size()));
            String apellidoAleatorio = apellidos.get(random.nextInt(apellidos.size()));
            String alumno = nombreAleatorio + " " + apellidoAleatorio;
            listadoAlumnos.add(alumno);

            int dniAleatorio = random.nextInt(rangoDNIFin - rangoDNIInicio + 1) + rangoDNIInicio;
            String dni = String.format("%08d", dniAleatorio);
            listadoDNIs.add(dni);
        }

        // Asignar DNIs a los alumnos en el listado
        for (int i = 0; i < cantidad; i++) {
            String alumno = listadoAlumnos.get(i);
            String dni = listadoDNIs.get(i);
            alumno += " - DNI: " + dni;
            listadoAlumnos.set(i, alumno);
        }

        return listadoDNIs;
    }
}
//Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
//rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
//debe retornar la lista de dnis.


