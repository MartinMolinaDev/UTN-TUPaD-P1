/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

/**
 *
 * @author Admin
 */
public class Ejercicio_13 {
    
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        
        System.out.println("Precio: $" + precios[indice]);
        
        mostrarPreciosRecursivo(precios, indice + 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    
}
