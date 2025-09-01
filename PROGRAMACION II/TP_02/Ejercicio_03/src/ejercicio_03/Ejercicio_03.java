/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        
        String clasificacion = clasificarEdad(edad);
        
        System.out.println("Eres un " + clasificacion + ".");
    }
    
    public static String clasificarEdad(int edad) {
        if (edad < 12) {
            return "Niño";
        } else if (edad >= 12 && edad <= 17) {
            return "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }
}
