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
public class Puerta {
    private String material;
    private int medidas;

    public Puerta() {
    }

    public Puerta(String material, int medidas) {
        this.material = material;
        this.medidas = medidas;
    }

    public int getMedidas() {
        return medidas;
    }

    public void setMedidas(int medidas) {
        this.medidas = medidas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void cerrar(){
        System.out.println("Abrir la puerta");
    }
  
}
