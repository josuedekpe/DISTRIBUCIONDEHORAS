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
public class SubTipoPlaza {
    private String IdSubTipo;
    private String Nombre;
    private String IdTipo;

    public String getIdSubTipo() {
        return IdSubTipo;
    }

    public void setIdSubTipo(String IdSubTipo) {
        this.IdSubTipo = IdSubTipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(String IdTipo) {
        this.IdTipo = IdTipo;
    }

    public SubTipoPlaza(String Nombre, String IdTipo) {
        this.Nombre = Nombre;
        this.IdTipo = IdTipo;
    }
}
