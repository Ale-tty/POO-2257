package listadeempleados;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleados>  empleado= new ArrayList();
        empleado.add(new Empleados("José García Pérez", "sistemas", 670, 30, 5));
        empleado.add(new Empleados("Diana Herrera Pérez", "Recursos Humanos", 450, 25, 0));
        empleado.add(new Empleados("Jessica Juarez Díaz", "Ventas", 400, 28, 0));
        empleado.add(new Empleados("Pedro Paz Orozco", "Ventas", 410, 30, 0));
        empleado.add(new Empleados("José Marcel Pérez", "Sistemas", 680, 29, 6));
        empleado.add(new Empleados("Jesús Días García", "Recursos Humanos", 455, 30, 0));
        empleado.add(new Empleados("Pedro Xotla Ramirez", "Sistemas", 675, 27, 0));
        empleado.add(new Empleados("Javier Medina Blanco", "Ventas", 400, 30, 4));
        empleado.add(new Empleados("Elizabeth Villa Sosa", "Sistemas", 670, 30, 3));
        
        Iterator<Empleados> iter = empleado.iterator();
        int suetotal= 0;
        while (iter.hasNext()) {
            Empleados empleados = iter.next();
            System.out.println("El sueldo mensual de: " +  empleados.getNombre()
                    + " es de: $" +(empleados.getSueldoDiario() * 
                            empleados.getDiasTrabajados()));
            System.out.println("El monto de horas extra es de: $"+ 
                    (empleados.getHorasExtra()* 85));
            suetotal += (empleados.getSueldoDiario() * 
                    empleados.getDiasTrabajados()) + (empleados.getHorasExtra() * 85);
            System.out.println();  
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("El sueldo total (Inluyendo horas extra) es de: $"+ suetotal);
        
        Iterator<Empleados> iter2 = empleado.iterator();
        int menosDias = 31;
        String trabajadorMenos = "";
        while (iter2.hasNext()) {
            Empleados empleados = iter2.next();
            if (empleados.getDiasTrabajados() < menosDias) {
                menosDias = empleados.getDiasTrabajados();
                trabajadorMenos = empleados.getNombre();
            } 
        }
        
        System.out.println("*********************");
        System.out.println("La persona que menos trabajo fue: "+ trabajadorMenos);
        
        Iterator<Empleados> iter3 = empleado.iterator();
        int masHoras = 0;
        String trabajadorMas = "";
        while (iter3.hasNext()) {
            Empleados empleados = iter3.next();
            if (empleados.getHorasExtra()> masHoras) {
                masHoras = empleados.getHorasExtra();
                trabajadorMas = empleados.getNombre();       
            }      
        }
        
        System.out.println("//////////////////////");
        System.out.println("El trabajador con mas horas extra es: " + trabajadorMas);
              
    }   
}
