/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero3;

/**
 *
 * @author Criss
 */
abstract class Figura {
    protected int numLados;

    // Constructor
    public Figura(int numLados) {
        this.numLados = numLados;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}
