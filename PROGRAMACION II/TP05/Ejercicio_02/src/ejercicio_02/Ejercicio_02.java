/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

/**
 *
 * @author Admin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BT-5000", 5000);
        
        Usuario usuario = new Usuario("María González", "87654321");
        
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21");
        
        celular.setBateria(bateria);
        celular.setUsuario(usuario);
        
        System.out.println(celular);
        System.out.println(usuario);
        System.out.println("IMEI del celular del usuario: " + usuario.getCelular().getImei());
    }
    
}
