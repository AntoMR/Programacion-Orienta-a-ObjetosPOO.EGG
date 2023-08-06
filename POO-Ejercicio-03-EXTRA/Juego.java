
package programacion.orientada.a.objetospoo.egg.pkg03extra;

import java.util.Scanner;


public class Juego {
    
    private int numeroAdivinar;
    private int intentosMaximos;
    private int intentos;
    private int jugador1Victorias;
    private int jugador2Victorias;

    public Juego() {
        intentosMaximos = 5;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1, elige un numero: ");
        numeroAdivinar = scanner.nextInt();

        System.out.println("Jugador 2, adivina el numero elegido por Jugador 1.");
        System.out.println("Tienes " + intentosMaximos + " intentos.");

        intentos = 0;
        int numeroAdivinado;

        while (intentos < intentosMaximos) {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa tu adivinanza: ");
            numeroAdivinado = scanner.nextInt();

            intentos++;

            if (numeroAdivinado == numeroAdivinar) {
                System.out.println("¡Adivinaste el numero!");
                jugador2Victorias++;
                break;
            } else if (numeroAdivinado < numeroAdivinar) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }
        }

        if (intentos == intentosMaximos) {
            System.out.println("¡Se acabaron los intentos! El numero era: " + numeroAdivinar);
            jugador1Victorias++;
        }

        System.out.println("Resultados:");
        System.out.println("Jugador 1 victorias: " + jugador1Victorias);
        System.out.println("Jugador 2 victorias: " + jugador2Victorias);
    }
    
}
