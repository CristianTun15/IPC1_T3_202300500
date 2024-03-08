/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Criss
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Figura> figuras = new ArrayList<>();

        // Crear instancias de las subclases y agregarlas a la lista
        figuras.add(new Triangulo(5, 4)); // Triángulo con base 5 y altura 4
        figuras.add(new Cuadrado(3));     // Cuadrado con lado de longitud 3
        figuras.add(new Circulo(2.5));    // Círculo con radio 2.5

        // Iterar sobre la lista y calcular el área de cada figura
        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            System.out.println("Área de " + nombreFigura + ": " + area);
        }
    }
    
}
