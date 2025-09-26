/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;

/**
 *
 * @author Admin
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancias de estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación", 85.0);
        Estudiante estudiante2 = new Estudiante("María", "González", "Matemáticas", 92.5);
        
        // Mostrar información
        estudiante1.mostrarInfo();
        System.out.println();
        estudiante2.mostrarInfo();
        
        // Modificar calificaciones
        estudiante1.subirCalificacion(5.0);
        estudiante2.bajarCalificacion(2.5);
        
        System.out.println();
        estudiante1.mostrarInfo();
        System.out.println();
        estudiante2.mostrarInfo();
    }
    
}
