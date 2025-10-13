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
       Titular titular = new Titular("Juan Pérez", "12345678");
        
        Pasaporte pasaporte = new Pasaporte("ARG123456", "2024-01-15", "foto_juan.jpg", "JPEG");
        
        pasaporte.setTitular(titular);
        
        System.out.println(pasaporte);
        System.out.println(titular);
        System.out.println("Numero de pasaporte del titular: " + titular.getPasaporte().getNumero());
    }
    
}
