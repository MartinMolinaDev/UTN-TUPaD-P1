/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04;

/**
 *
 * @author Admin
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos Rodríguez", "34567890");
        
        Banco banco = new Banco("Banco Galicia", "30-50000000-4");
        
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("5425-2334-3010-9903", "12/2027");
        
        tarjeta.setCliente(cliente);
        tarjeta.setBanco(banco);
        
        System.out.println(tarjeta);
        System.out.println(cliente);
        System.out.println(banco);
        System.out.println("Numero de tarjeta del cliente: " + cliente.getTarjeta().getNumero());
    }
    
}
