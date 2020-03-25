/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento;

import errores.Errores;
import java.util.ArrayList;
import java.util.Scanner;
import tipos.Reservacion;
import tipos.TipoHabitacion;
import tipos.TipoVista;

/**
 *
 * @author Azu
 */
public class Hotel {
    private String nombre;
    private String ubicaion; 
    private ArrayList<Reservacion> reservaciones = Reservacion.crearListaReservaciones();

    public Hotel() {
    }

    public Hotel(String nombre, String ubicaion) {
        this.nombre = nombre;
        this.ubicaion = ubicaion;
    }

    public String getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicaion = ubicaion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(ArrayList<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
    
   public void mostrarMenu() {
      int salir = 0;
      do {
          System.out.println("Bienvenid@s a " + getNombre());
          System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
          System.out.println("¿Qué quieres hacer?");
          System.out.println("1 Reservar la habitacón");
          System.out.println("2 Mostrar la reservacóin");
          System.out.println("3 Cambiar información");
          System.out.println("4 Terminar la estancia");
          System.out.println("0 Nada, salir del menú");
          
          int respuesta = Errores.respuesta(0, 4);
          
          switch (respuesta) {
              case 0: 
                  salir = 0;
                  break; 
              case 1: 
                  reservarHabitacion();
                    break;
                case 2:
                    mostrarReservaciones();
                    break;
                case 3:
                    actualizarInformacion();
                    break;
                case 4:
                    finalizarEstancia();
                    break;
                default:
                    System.out.println();
                    System.out.println("De favor llena los datos");
                    System.out.println();
                    salir = 1;
                    break;
            }
        }while(salir != 0);
    }
    
    public void reservarHabitacion() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println("Llena los datos");
            Scanner teclado = new Scanner(System.in);
            System.out.print("¿Cuál es su nombre? ");
            String nombre = teclado.nextLine();
            System.out.println("Selecciona tu opcion");
            System.out.println("¿Deseas incluir todos los servicios? ");
            System.out.println("1. Si");
            System.out.println("2. No");
            int respuesta = Errores.respuesta(1, 2);
            boolean todoIncluido = false;
            switch (respuesta) {
                case 1:
                    todoIncluido = true;
                    break;
                case 2:
                    todoIncluido = false;
                    break;
            }
            TipoHabitacion habitacion = TipoHabitacion.sencilla;
            System.out.println("¿Qué habitación deseas?");
            if (todoIncluido) {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Errores.respuesta(1, 5);
                
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencillaT;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.dobleT;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suiteT;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.kingT;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencialT;
                        break;
                }
            } else {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Errores.respuesta(1, 5);
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencilla;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.doble;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suite;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.king;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencial;
                        break;
                }
            }
            
            System.out.println("¿Que tipo de vista prefiere?");
            System.out.println("1. Al mar");
            System.out.println("2. Al campo de golf");
            respuesta = Errores.respuesta(1, 2);
            TipoVista vista = TipoVista.mar;
            switch (respuesta) {
                case 1:
                    vista = TipoVista.mar;
                    break;
                case 2:
                    vista = TipoVista.golf;
                    break;
            }
            
            System.out.println("Ingrese el número de su hora de entrada (entre"
                    + " 3 pm y 12 pm): ");
            respuesta = Errores.respuesta(3, 12);
            int horaEntrada = respuesta;
            System.out.println("Ingrese el número de su hora de salida (entre"
                    + " 3 pm y 12 pm): ");
            respuesta = Errores.respuesta(3, 12);
            int horaSalida = respuesta;
            
            reservaciones.add(new Reservacion(nombre, todoIncluido, habitacion,
                    vista, horaEntrada, horaSalida));
            
            System.out.println();
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("La habitación ha quedado reservada.");
            System.out.println("Esperemos que disfrute su estadia aqui :3");
            System.out.println();
            
            respuesta = 0;
            
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
    
    public void mostrarReservaciones() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println("~*Reservaciones*~");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Volver al menú");
            System.out.println();
            
            int respuesta = Errores.respuesta(0, reservaciones.size());
            
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
            if (respuesta > 0) {
                Reservacion reservacionSeleccionada = 
                        reservaciones.get(respuesta-1);
                System.out.println();
                System.out.println(reservacionSeleccionada);
            }
        }while(salir !=0);
    }
    
    public void actualizarInformacion() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println("~*Modificar los datos*~");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Volver al menú");
            System.out.println();
            
            int respuesta = Errores.respuesta(0, reservaciones.size());
            Reservacion reservacionSeleccionada = reservaciones.get(respuesta-1);
            System.out.println();
            
            Scanner teclado = new Scanner(System.in);
            System.out.print("¿Cuál es su nombre? ");
            String nombre = teclado.nextLine();
            reservacionSeleccionada.setHuesped(nombre);
            
            System.out.println("De favor seleccione su opción");
            System.out.println("¿Desea incluir todos los servicios? ");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuesta = Errores.respuesta(1, 2);
            boolean todoIncluido = false;
            switch (respuesta) {
                case 1:
                    todoIncluido = true;
                    break;
                case 2:
                    todoIncluido = false;
                    break;
            }
            reservacionSeleccionada.setTodoIncluido(todoIncluido);
            
            TipoHabitacion habitacion = TipoHabitacion.sencilla;
            System.out.println("Escoge tu habitación ");
            if (todoIncluido) {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Errores.respuesta(1, 5);
                
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencillaT;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.dobleT;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suiteT;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.kingT;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencialT;
                        break;
                }
            } else {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Errores.respuesta(1, 5);
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencilla;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.doble;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suite;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.king;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencial;
                        break;
                }
            }
            reservacionSeleccionada.setTipoDeHabitacion(habitacion);
            
            System.out.println("¿Que tipo de vista desea? ");
            System.out.println("1. Al mar");
            System.out.println("2. Al campo de golf");
            respuesta = Errores.respuesta(1, 2);
            TipoVista vista = TipoVista.mar;
            switch (respuesta) {
                case 1:
                    vista = TipoVista.mar;
                    break;
                case 2:
                    vista = TipoVista.golf;
                    break;
            }
            reservacionSeleccionada.setTipoDeVista(vista);
            
            System.out.println("Ingrese el número de su hora de entrada "
                    + "entre 3 pm y 12 pm: ");
            respuesta = Errores.respuesta(3, 12);
            reservacionSeleccionada.setHoraDeEntrada(respuesta);
            
            System.out.println("Ingrese el número de su hora de salida "
                    + "entre 3 pm y 12 pm: ");
            respuesta = Errores.respuesta(3, 12);
            reservacionSeleccionada.setHoraDeSalida(respuesta);
            
            System.out.println();
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("La reservación ha sido modificada");
            System.out.println();
            
            respuesta = 0;
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
    
    public void finalizarEstancia() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println("~*Salida~*");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Regresar al Menú");
            System.out.println();
            
            //Leer Respuesta usuario
            int respuesta = Errores.respuesta(0, reservaciones.size());
            Reservacion reservacionSeleccionada = 
                    reservaciones.get(respuesta-1);
            reservaciones.remove(reservacionSeleccionada);
            System.out.println();
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + 
                        reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("Gracias por su estadia, vuelva pronto <3");
            System.out.println();
            
            respuesta = 0;
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
       
}
