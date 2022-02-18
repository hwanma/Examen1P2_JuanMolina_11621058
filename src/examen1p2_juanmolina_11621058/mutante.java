/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmolina_11621058;

import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class mutante extends persona{
    private ArrayList<String> factoresMutante = new ArrayList();

    public mutante() {
    }

    public mutante(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
    }

    public ArrayList<String> getFactoresMutante() {
        return factoresMutante;
    }

    public void setFactoresMutante(ArrayList<String> factoresMutante) {
        this.factoresMutante = factoresMutante;
    }
    
    public void finalChance(persona p1, persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString() + ", mutante{" + "factoresMutante=" + factoresMutante + '}';
    }
    
}
