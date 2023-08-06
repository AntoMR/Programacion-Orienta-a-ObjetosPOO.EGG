
package programacion.orientada.a.objetospoo.pkg02;


public class ProgramacionOrientadaAObjetosEGGPOO02 {

    
    public static void main(String[] args) {
        
        Circunferencia circunferencia = new Circunferencia(0);
        circunferencia.crearCircunferencia(); 
        System.out.println("Arrea de la circunferencia: " + circunferencia.area());
        System.out.println("Perametro de la circunferencia: " + circunferencia.perimetro());
       
    }
    
}
