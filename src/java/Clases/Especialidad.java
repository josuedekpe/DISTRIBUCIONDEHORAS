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
public class Especialidad {
    private String IdEspecialidad;
    private String Nombre;
    private String IdArea;

    public String getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(String IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdArea() {
        return IdArea;
    }

    public void setIdArea(String IdArea) {
        this.IdArea = IdArea;
    }

    public Especialidad(String Nombre, String IdArea) {
        this.Nombre = Nombre;
        this.IdArea = IdArea;
    }
    
    
}
