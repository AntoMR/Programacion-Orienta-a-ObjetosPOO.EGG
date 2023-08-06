
package programacion.orientada.a.objetospoo.egg.pkg04extra;



public class Cuenta {
    
     private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("No es posible realizar el retiro. Saldo insuficiente.");
        }
    }
    
}
