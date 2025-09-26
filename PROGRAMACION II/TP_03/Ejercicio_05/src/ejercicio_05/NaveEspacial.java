/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_05;

/**
 *
 * @author Admin
 */
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;
    private static final int COMBUSTIBLE_MAXIMO = 100;
    private boolean despegada;
    
    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.despegada = false;
    }
    
    // Método para despegar
    public void despegar() {
        if (combustible > 0) {
            despegada = true;
            combustible -= 10;
        }
    }
    
    // Método para avanzar
    public void avanzar(int distancia) {
        int combustibleNecesario = distancia * 2;
        if (despegada && combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
        }
    }
    
    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
        } else {
            combustible = COMBUSTIBLE_MAXIMO;
        }
    }
    
    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
        System.out.println("Estado: " + (despegada ? "En vuelo" : "En tierra"));
    }
}
