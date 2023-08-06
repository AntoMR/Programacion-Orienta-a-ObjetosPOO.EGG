
package programacion.orientada.a.objetospoo.egg.pkg04;

import java.util.Scanner;


public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
       
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = scanner.nextDouble();
    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}
