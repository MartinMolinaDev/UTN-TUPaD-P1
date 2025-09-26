/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04;

/**
 *
 * @author Admin
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2, 50);
        Gallina gallina2 = new Gallina(2, 1, 25);
        
        // Estado inicial
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        System.out.println();
        
        // Simular acciones
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        
        // Mostrar estado final
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
    }
    
}
