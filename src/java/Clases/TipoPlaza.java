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
public class TipoPlaza {
    
    private String IdTipo;
    private String Nombre;

    public String getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(String IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public TipoPlaza(String Nombre) {
        this.Nombre = Nombre;
    }
}
