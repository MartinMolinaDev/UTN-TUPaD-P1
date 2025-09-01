/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_07;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        double nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Double.parseDouble(scanner.nextLine());
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
}
