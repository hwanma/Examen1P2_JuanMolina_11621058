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
public class persona {
    private String nombre, poder, debilidad, heroeVillano;
    private int fuerza, habilidadMental, habilidadFisica;
    private boolean tieneEscuadron = false;

    public persona() {
    }

    public persona(String nombre, String poder, String debilidad, String heroeVillano, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroeVillano = heroeVillano;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeVillano() {
        return heroeVillano;
    }

    public void setHeroeVillano(String heroeVillano) {
        this.heroeVillano = heroeVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadMental() {
        return habilidadMental;
    }

    public void setHabilidadMental(int habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }
    
    public void finalChance(persona p1, persona p2){
        
    }

    public String toString(boolean heroeVillano) {
        if(heroeVillano){
            return " persona {" + "nombre=" + nombre + ", poder=" + poder + '}';
        } else {
            return " persona {" + "nombre=" + nombre + ", debilidad=" + debilidad + '}';
        }
    }
    
    
}
