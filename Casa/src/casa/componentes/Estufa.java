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
public class Estufa {
    private String marca;
    private int medidas;

    public Estufa() {
    }

    public Estufa(String marca, int medidas) {
        this.marca = marca;
        this.medidas = medidas;
    }

    public int getMedidas() {
        return medidas;
    }

    public void setMedidas(int medidas) {
        this.medidas = medidas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void encender(){
        System.out.println("Encendiendo la estufa");
    }
    
}
