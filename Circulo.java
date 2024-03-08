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
class Circulo extends Figura {

    private double radio;
    private final double PI = Math.PI;

    // Constructor
    public Circulo(double radio) {
        super(0); // Un círculo no tiene lados
        this.radio = radio;
    }

    // Implementación del método calcularArea() para un círculo
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
    
}
