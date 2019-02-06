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
public class DetEspecialidad {
    private String IdDetEspecialidad;
    private String IdDocente;
    private String IdEspecialidad;

    public String getIdDetEspecialidad() {
        return IdDetEspecialidad;
    }

    public void setIdDetEspecialidad(String IdDetEspecialidad) {
        this.IdDetEspecialidad = IdDetEspecialidad;
    }

    public String getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(String IdDocente) {
        this.IdDocente = IdDocente;
    }

    public String getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(String IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public DetEspecialidad(String IdDocente, String IdEspecialidad) {
        this.IdDocente = IdDocente;
        this.IdEspecialidad = IdEspecialidad;
    }
    
    
    
}
