/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora.equipo;

import computadora.componentes.Mouse;
import computadora.componentes.Procesador;
import computadora.componentes.Teclado;

/**
 *
 * @author Azu
 */
public class computadoraFinal {
    private String marca;
    private String modelo; 
    private Teclado teclado; 
    private Mouse mouse; 
    private Procesador procesador; 

    public computadoraFinal() {
    }

    public computadoraFinal(String marca, String modelo, Teclado teclado, Mouse mouse, Procesador procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.mouse = mouse;
        this.procesador = procesador;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    public void encender(){
        System.out.println("Encendiendo la computadora");
    }
    
}
