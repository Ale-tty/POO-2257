/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora.componentes;

/**
 *
 * @author Azu
 */
public class Teclado {
    private String modelo;
    private int numeroTeclas;

    public Teclado() {
    }

    public Teclado(String modelo, int numeroTeclas) {
        this.modelo = modelo;
        this.numeroTeclas = numeroTeclas;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void escribir(){
        System.out.println("Escribir");
    }
    
}
