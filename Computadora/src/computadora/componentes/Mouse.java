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
public class Mouse {
    private String marca;
    private int numeroDeBotones; 

    public Mouse() {
    }

    public Mouse(String marca, int numeroDeBotones) {
        this.marca = marca;
        this.numeroDeBotones = numeroDeBotones;
    }

    public int getNumeroDeBotones() {
        return numeroDeBotones;
    }

    public void setNumeroDeBotones(int numeroDeBotones) {
        this.numeroDeBotones = numeroDeBotones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void seleccionar(){
        System.out.println("click");
    }
    
}
