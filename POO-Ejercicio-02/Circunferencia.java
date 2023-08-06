
package programacion.orientada.a.objetospoo.pkg02;

import java.util.Scanner;


public class Circunferencia {
    
     private double radio;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
    }
    
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}
