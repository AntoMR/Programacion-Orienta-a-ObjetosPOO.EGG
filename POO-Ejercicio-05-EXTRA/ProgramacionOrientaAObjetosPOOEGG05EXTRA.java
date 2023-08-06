
package programacion.orienta.a.objetospoo.egg.pkg05extra;

import java.util.Scanner;


public class ProgramacionOrientaAObjetosPOOEGG05EXTRA {

  
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, edad, salario);
        empleado.calcularAumento();
    }
    
}
