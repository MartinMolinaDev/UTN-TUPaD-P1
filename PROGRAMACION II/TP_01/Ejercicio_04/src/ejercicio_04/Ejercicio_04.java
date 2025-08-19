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
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su Nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su Edad: ");
        edad = Integer.parseInt(input.nextLine() );
        
        System.out.println(nombre);
        System.out.println(edad);
        
    }
    
}
