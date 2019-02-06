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
public class AnioAcademico {
    private String IdAnioAcademico;
    private String Nombre;
    private String Anio;
    private String IdDocente;
    private String IdInstitucionEducativa;  

    public String getIdAnioAcademico() {
        return IdAnioAcademico;
    }

    public void setIdAnioAcademico(String IdAnioAcademico) {
        this.IdAnioAcademico = IdAnioAcademico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(String IdDocente) {
        this.IdDocente = IdDocente;
    }

    public String getIdInstitucionEducativa() {
        return IdInstitucionEducativa;
    }

    public void setIdInstitucionEducativa(String IdInstitucionEducativa) {
        this.IdInstitucionEducativa = IdInstitucionEducativa;
    }

    public AnioAcademico(String Nombre, String Anio, String IdDocente, String IdInstitucionEducativa) {
        this.Nombre = Nombre;
        this.Anio = Anio;
        this.IdDocente = IdDocente;
        this.IdInstitucionEducativa = IdInstitucionEducativa;
    }
    
    
}
