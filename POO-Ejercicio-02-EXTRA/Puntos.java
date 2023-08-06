
package programacion.orientada.a.objetospoo.egg.pkg02extra;

import java.util.Scanner;


public class Puntos {
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        x1 = scanner.nextDouble();
        System.out.print("y1: ");
        y1 = scanner.nextDouble();
        
        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        x2 = scanner.nextDouble();
        System.out.print("y2: ");
        y2 = scanner.nextDouble();
    }
    
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
    
    
}
