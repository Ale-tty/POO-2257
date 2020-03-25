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
public enum TipoVista {
    mar("Al mar", 350),
    golf("Al campo de golf", 200);
    
    private String descripcion; 
    private int precio; 

    private TipoVista() {
    }

    private TipoVista(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return getDescripcion();
    }
    
    
}
