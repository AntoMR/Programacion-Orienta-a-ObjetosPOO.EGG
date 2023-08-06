
package programacion.orientada.a.objetospoo.egg.pkg04;


public class ProgramacionOrientadaAObjetosPOOEGG04 {

  
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();

        double superficie = rectangulo.calcularSuperficie();
        double perimetro = rectangulo.calcularPerimetro();

        System.out.println("Superficie del rectangulo: " + superficie);
        System.out.println("Pera­metro del rectangulo: " + perimetro);

        System.out.println("Dibujo del rectangulo:");
        rectangulo.dibujarRectangulo();
    }
}

 



    
    

