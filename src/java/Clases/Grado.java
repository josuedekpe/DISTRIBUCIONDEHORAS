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
public class Grado {
    private String IdGrado;
    private String Nombre;

    public String getIdGrado() {
        return IdGrado;
    }

    public void setIdGrado(String IdGrado) {
        this.IdGrado = IdGrado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Grado(String Nombre) {
        this.Nombre = Nombre;
    }
       
}
