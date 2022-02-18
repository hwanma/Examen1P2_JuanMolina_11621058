/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmolina_11621058;

/**
 *
 * @author Hwan
 */
public class radioactivo extends persona{
    private int edadAccidente;
    private String tipoAccidente;

    public radioactivo() {
    }

    public radioactivo(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }
    
    
    public void finalChance(persona p1, persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString() + ", radioactivo{" + "edadAccidente=" + edadAccidente + ", tipoAccidente=" + tipoAccidente + '}';
    }
    
}
