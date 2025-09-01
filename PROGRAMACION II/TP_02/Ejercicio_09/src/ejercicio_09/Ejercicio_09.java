/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_09;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_09 {
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.toUpperCase().equals("NACIONAL")) {
            return peso * 5.0;
        } else {
            return peso * 10.0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
}
