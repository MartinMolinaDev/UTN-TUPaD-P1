/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Admin
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear libro
        Libro libro1 = new Libro("La Comunidad del Anillo", "J.R.R. Tolkien", 1954);
        
        // Mostrar información inicial
        libro1.mostrarInfo();
        System.out.println();
        
        // Intentar modificar con valor inválido
        libro1.setAñoPublicacion(-500);
        libro1.mostrarInfo();
        System.out.println();
        
        // Modificar con valor válido
        libro1.setAñoPublicacion(1854);
        
        // Mostrar información final
        libro1.mostrarInfo();
    }
    
}
