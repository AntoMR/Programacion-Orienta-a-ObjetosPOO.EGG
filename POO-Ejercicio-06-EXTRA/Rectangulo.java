
package programacion.orientada.a.objetospoo.egg.pkg06extra;


public class Rectangulo {
    
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return lado1 * lado2;
    }
    
}
