/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author Admin
 */
public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // Método para mostrar información de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    // Método para cumplir años
    public void cumplirAnios() {
        edad++;
    }
}
