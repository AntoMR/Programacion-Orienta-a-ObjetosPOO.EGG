
package programacion.orientada.a.objetospoo.egg.pkg02extra;


public class ProgramacionOrientadaAObjetosPOOEGG02Extra {

   
    public static void main(String[] args) {
       
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    
}
