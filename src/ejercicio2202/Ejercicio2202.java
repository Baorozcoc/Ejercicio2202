/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2202;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio2202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("nombre Autor");
        String nombre= teclado.next();
        
        
        
        Autor autor= new Autor(nombre, "gir", "247312");
        
        Libro libro= new Libro("titulo", 300);
        
        libro.setAutor(autor);
        String autorLibro=libro.getAutor().getNombre();
        System.out.println(autorLibro);
    }
    
}
