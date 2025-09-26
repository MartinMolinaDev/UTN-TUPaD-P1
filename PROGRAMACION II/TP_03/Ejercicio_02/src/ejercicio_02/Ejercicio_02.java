/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author Admin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear mascota
        Mascota mascota1 = new Mascota("Tommy", "Perro", 3);
        
        // Mostrar información inicial
        mascota1.mostrarInfo();
        
        System.out.println();
        
        // Simular paso del tiempo
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        
        // Verificar cambios
        mascota1.mostrarInfo();
    }
    
}
