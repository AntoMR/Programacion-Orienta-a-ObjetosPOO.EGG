
package programacion.orienta.a.objetospoo.egg.pkg05extra;


public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void calcularAumento() {
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.05;
        }

        double nuevoSalario = salario + aumento;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario actual: " + salario);
        System.out.println("Aumento salarial: " + aumento);
        System.out.println("Nuevo salario: " + nuevoSalario);
    }

    
}
