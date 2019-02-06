/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC-04
 */
public class Modalidad {
    private String IdModalidad;
    private String Nombre;
    private int JornadaLboral;

    public String getIdModalidad() {
        return IdModalidad;
    }

    public void setIdModalidad(String IdModalidad) {
        this.IdModalidad = IdModalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getJornadaLboral() {
        return JornadaLboral;
    }

    public void setJornadaLboral(int JornadaLboral) {
        this.JornadaLboral = JornadaLboral;
    }

    public Modalidad(String Nombre, int JornadaLboral) {
        this.Nombre = Nombre;
        this.JornadaLboral = JornadaLboral;
    }
}
