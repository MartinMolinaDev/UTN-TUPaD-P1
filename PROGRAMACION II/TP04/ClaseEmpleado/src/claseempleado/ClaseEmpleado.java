/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseempleado;

/**
 *
 * @author Admin
 */
public class ClaseEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Empleado emp1 = new Empleado(201, "Roberto Fernández", "Arquitecto de Software", 75000.0);
        Empleado emp2 = new Empleado(202, "Sofía Rodríguez", "Directora de RRHH", 95000.0);
        Empleado emp3 = new Empleado("Diego Morales", "Contador");
        Empleado emp4 = new Empleado("Valentina Ruiz", "Marketing Manager");
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        emp1.actualizarSalario(12.0);
        emp2.actualizarSalario(8000);
        emp3.actualizarSalario(20.0);
        emp4.actualizarSalario(4500);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
