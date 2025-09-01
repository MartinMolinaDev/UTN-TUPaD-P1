/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();
        
        double descuento = 0;
        
        if (categoria.equals("A")) {
            descuento = 10;
        } else if (categoria.equals("B")) {
            descuento = 15;
        } else if (categoria.equals("C")) {
            descuento = 20;
        }
        
        double montoDescuento = precio * (descuento / 100);
        double precioFinal = precio - montoDescuento;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)descuento + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
}
