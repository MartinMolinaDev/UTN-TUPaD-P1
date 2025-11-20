/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

/**
 *
 * @author Admin
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Juan", 150000),
            new EmpleadoTemporal("Ana", 120, 1500)
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("-> Es empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("-> Es empleado temporal.");
            }
        }
    }
    
}
