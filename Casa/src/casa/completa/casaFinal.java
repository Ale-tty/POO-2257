/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.completa;

import casa.componentes.Estufa;
import casa.componentes.Puerta;
import casa.componentes.Ventana;

/**
 *
 * @author Azu
 */
public class casaFinal {
    private int medidas;
    private String material; 
    private Estufa estufa;
    private Puerta puerta;
    private Ventana ventana; 

    public casaFinal() {
    }

    public casaFinal(int medidas, String material, Estufa estufa, Puerta puerta, Ventana ventana) {
        this.medidas = medidas;
        this.material = material;
        this.estufa = estufa;
        this.puerta = puerta;
        this.ventana = ventana;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
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

    public Estufa getEstufa() {
        return estufa;
    }

    public void setEstufa(Estufa estufa) {
        this.estufa = estufa;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }
    public void vivienda(){
        System.out.println("La casa completa");
    }

    @Override
    public String toString() {
        System.out.println("Estufa:"+this.estufa);
        System.out.println("Ventana:"+this.ventana);
        System.out.println("Puerta:"+this.puerta);
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
