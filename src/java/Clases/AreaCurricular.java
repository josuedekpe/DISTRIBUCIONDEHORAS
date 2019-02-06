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
public class AreaCurricular {
    private String IdArea;
    private String Nombre;

    public String getIdArea() {
        return IdArea;
    }

    public void setIdArea(String IdArea) {
        this.IdArea = IdArea;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public AreaCurricular(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
