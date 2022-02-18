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
public class extraterrestre extends persona{

    public extraterrestre() {
    }

    public extraterrestre(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroeVillano, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
    }

    @Override
    public String toString() {
        return ", extraterrestre";
    }
    
}
