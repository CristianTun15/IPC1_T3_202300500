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
class Triangulo extends Figura {

    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        super(3); // Un triángulo tiene siempre 3 lados
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea() para un triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
}
