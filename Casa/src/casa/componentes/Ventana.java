/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.componentes;

/**
 *
 * @author Azu
 */
public class Ventana {
    private int largo;
    private int ancho;

    public Ventana() {
    }

    public Ventana(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void ver(){
        System.out.println("Ver a traves de la ventana");
    }
    
}
