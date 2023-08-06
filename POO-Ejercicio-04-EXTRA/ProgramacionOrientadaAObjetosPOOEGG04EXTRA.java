
package programacion.orientada.a.objetospoo.egg.pkg04extra;

import java.util.Scanner;


public class ProgramacionOrientadaAObjetosPOOEGG04EXTRA {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Cuenta cuenta = new Cuenta(titular, saldoInicial);

        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();

        cuenta.retirarDinero(cantidad);
    }
    
}
