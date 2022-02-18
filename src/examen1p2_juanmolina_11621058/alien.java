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
public class alien extends extraterrestre{
    private String planeta;

    public alien() {
    }

    public alien(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    public void finalChance(persona p1, persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString() + ", alien{" + "planeta=" + planeta + '}';
    }

    
}
