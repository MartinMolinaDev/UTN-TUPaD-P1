/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_04;

/**
 *
 * @author Admin
 */
public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Constructor
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    // Método para poner huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }
    
    // Método para envejecer
    public void envejecer() {
        edad++;
    }
    
    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}
