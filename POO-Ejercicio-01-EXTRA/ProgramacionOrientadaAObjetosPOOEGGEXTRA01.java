
package programacion.orientada.a.objetospoo.egg.extra.pkg01;


public class ProgramacionOrientadaAObjetosPOOEGGEXTRA01 {

   
    public static void main(String[] args) {
      
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Bohemian Rhapsody");
        cancion1.setAutor("Queen");
        
        Cancion cancion2 = new Cancion("Imagine", "John Lennon"); 
        
        System.out.println("Canción 1: ");
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
        
        System.out.println("\nCanción 2:");
        System.out.println("Título: " + cancion2.getTitulo());
        System.out.println("Autor: " + cancion2.getAutor());
    }
    
}
