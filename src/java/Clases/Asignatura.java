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
public class Asignatura {
    private String IdAsignatura;
    private String Nombre; 

    public String getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(String IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Asignatura(String Nombre) {
        this.Nombre = Nombre;
    }  

   
}
