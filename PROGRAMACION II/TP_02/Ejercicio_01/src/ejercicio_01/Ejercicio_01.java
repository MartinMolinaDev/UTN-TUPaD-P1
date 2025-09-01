/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anio;

        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(scanner.nextLine());
        
        if (esAnioBisiesto(anio)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
    public static boolean esAnioBisiesto(int anio) {
        boolean esBisiesto = false;
        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)){
        esBisiesto = true;
    }
        return esBisiesto;
    }
}
