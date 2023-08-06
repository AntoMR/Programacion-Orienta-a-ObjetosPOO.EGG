
package programacion.orientada.a.objetos.poo.egg.pkg01;

import java.util.Scanner;


public class Libro {
    
    
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        
    }
    
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public static Libro cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();
        
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        
        System.out.print("Ingrese el número de páginas del libro: ");
        int numPaginas = scanner.nextInt();
        
        return new Libro(isbn, titulo, autor, numPaginas);
    }
    
    public void informarLibro() {
        System.out.println("Información del libro:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
    
    
}
