/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Admin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234, Buenos Aires");
        
        Libro libro = new Libro("Cien años de soledad", "978-0307474728");
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        System.out.println(libro);
        System.out.println(autor);
        System.out.println(editorial);
    }
    
}
