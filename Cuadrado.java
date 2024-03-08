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
class Cuadrado extends Figura {

    private double lado;

    // Ctr
    public Cuadrado(double lado) {
        super(4); // Un cuadrado tiene siempre 4 lados
        this.lado = lado;
    }

    // calcular area
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
