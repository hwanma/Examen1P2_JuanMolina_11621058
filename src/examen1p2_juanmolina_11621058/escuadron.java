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
public class escuadron {
    private String nombre, lugarBase;
    private persona lider;
    private boolean heroeVillano;
    private ArrayList<persona> miembros = new ArrayList();

    public escuadron() {
    }

    public escuadron(String nombre, String lugarBase, persona lider, boolean heroeVillano, ArrayList<persona> miembros) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.lider = lider;
        this.heroeVillano = heroeVillano;
        this.miembros = miembros;
    }
    
    public escuadron(String nombre, String lugarBase, boolean heroeVillano) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.heroeVillano = heroeVillano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public persona getLider() {
        return lider;
    }

    public void setLider(persona lider) {
        this.lider = lider;
    }

    public boolean isHeroeVillano() {
        return heroeVillano;
    }

    public void setHeroeVillano(boolean heroeVillano) {
        this.heroeVillano = heroeVillano;
    }

    public ArrayList<persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return ", escuadron{" + "nombre=" + nombre + '}';
    }
    
    
}
