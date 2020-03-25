/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author Azu
 */
public enum TipoHabitacion {
    sencilla("Sencilla: Cama matrimonial", 1600),
    sencillaT("Sencilla: Cama matrimonial", 2200),
    doble("Doble: Dos camas matrimoniales", 2650),
    dobleT("Doble: Dos camas matrimoniales", 3650),
    suite("Suite: Mini bar, Jacuzzi, Cama King Size", 4890),
    suiteT("Suite: Mini bar, Jacuzzi, Cama King Size", 5950),
    king("King: Sala, Mini bar, Alberca, Cama King Size", 6250),
    kingT("King: Sala, Mini bar, Alberca, Cama King Size", 7850),
    presidencial("Presidencial: Recibidor, Sala, Bar, Alberca, Dos Camas King Size", 8100),
    presidencialT("Presidencial: Recibidor, Sala, Bar, Alberca, Dos Camas King Size", 9950);
    
    
    private final String descripcion;
    private final int precio;

    private TipoHabitacion(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  getDescripcion();
    }
}
