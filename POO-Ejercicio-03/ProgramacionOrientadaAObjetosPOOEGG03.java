
package programacion.orientada.a.objetospoo.egg.pkg03;


public class ProgramacionOrientadaAObjetosPOOEGG03 {

   
    public static void main(String[] args) {
      
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
    }
    
}
