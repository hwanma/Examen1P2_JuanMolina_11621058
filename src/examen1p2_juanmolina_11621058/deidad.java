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
public class deidad extends extraterrestre{
    private boolean tieneCreyentes;
    private String religionMitologia;

    public deidad() {
    }

    public deidad(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
    }

    public deidad(boolean tieneCreyentes, String religionMitologia, String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.tieneCreyentes = tieneCreyentes;
        this.religionMitologia = religionMitologia;
    }
    
    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligionMitologia() {
        return religionMitologia;
    }

    public void setReligionMitologia(String religionMitologia) {
        this.religionMitologia = religionMitologia;
    }
    
    public void finalChance(persona p1, persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString() + ", deidad{" + "tieneCreyentes=" + tieneCreyentes + ", religionMitologia=" + religionMitologia + '}';
    }
    
}
