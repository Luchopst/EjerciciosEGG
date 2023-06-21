/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Main.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class ArrayService {
   
//    Método inicializarA recibe un arreglo por parámetro y lo 
//    inicializa con números aleatorios.
    public void inicializarA(double[] vectorA){
        Random rand = new Random();
        for (int i = 0; i <vectorA.length; i++) {
            vectorA[i]=rand.nextDouble();
        }
       //vector = Arrays(vector, 0.5);
       
    }

//   Método mostrar recibe un arreglo por parámetro y lo 
//   muestra por pantalla.
    public void mostrar(double[] vector){
        for (int i = 0; i <vector.length; i++) {
            System.out.println(" "+ vector[i]);
            
        }
        
    }

//   Método ordenar recibe un arreglo por parámetro y lo
//   ordena de mayor a menor.
    public void ordenar(double[] vector){
    for (int i = 0; i < vector.length - 1; i++) {
        int indiceMax = i;
        for (int j = i + 1; j < vector.length; j++) {
            if (vector[j] > vector[indiceMax]) {
                indiceMax = j;
            }
        }
        double aux = vector[i];
        vector[i] = vector[indiceMax];
        vector[indiceMax] = aux;
    }
}
//   Método inicializarB copia los primeros 10 números del 
//   arreglo A en el arreglo B. Luego llenar las últimas 10 
//   posiciones del arreglo B con 0.5.
    public void inicializarB(double[] vectorA,double[] vectorB){
        //copia los 10 primeros elementos de vectorA a VectorB.
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
        }
        //llena las 10 ultimas posiciones de vectorB con 0.5.
        for (int i = 10; i < vectorB.length; i++) {
            vectorB[i] = 0.5;
        }
    }

//
//   En el Main nuevamente: inicializar A, mostrar A, ordenar 
//   A, inicializar B, mostrar A y B.
}
