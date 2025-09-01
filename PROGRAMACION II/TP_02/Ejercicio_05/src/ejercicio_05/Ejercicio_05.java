/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
        int numero;
        int sumaPares = 0;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
            
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }while (numero != 0);
        
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
    
}
