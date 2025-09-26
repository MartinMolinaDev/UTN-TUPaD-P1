/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Admin
 */
public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    // Getters para todos los atributos
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    // Setter con validación para añoPublicacion
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2024) {
            this.añoPublicacion = añoPublicacion;
        }
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
}
