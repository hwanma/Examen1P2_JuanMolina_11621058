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
public class universo {
    private String nombre;
    ArrayList<escuadron> squads;

    public universo() {
    }

    public universo(String nombre, ArrayList<escuadron> squads) {
        this.nombre = nombre;
        this.squads = squads;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<escuadron> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "universo{" + "nombre=" + nombre + ", squads=" + squads + '}';
    }
    
}
