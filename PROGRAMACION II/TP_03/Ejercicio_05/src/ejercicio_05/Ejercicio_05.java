/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05;

/**
 *
 * @author Admin
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);
        
        // Estado inicial
        nave.mostrarEstado();
        System.out.println();
        
        // Despegar
        nave.despegar();
        
        // Intentar avanzar sin recargar (necesita mucho combustible)
        nave.avanzar(30);
        nave.mostrarEstado();
        System.out.println();
        
        // Recargar combustible
        nave.recargarCombustible(40);
        
        // Avanzar correctamente
        nave.avanzar(15);
        
        // Mostrar estado final
        nave.mostrarEstado();
    }
    
}
