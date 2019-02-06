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
public class Plaza {

    private String IdPlaza;
    private String Titular;
    private String CodModular;
    private String Observaciones;
    private String Estado;
    private int Jornada_Laboral;
    private String Idsubtipo;
    private String Cargo;
    private String Situacion;

    public String getIdPlaza() {
        return IdPlaza;
    }

    public void setIdPlaza(String IdPlaza) {
        this.IdPlaza = IdPlaza;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getCodModular() {
        return CodModular;
    }

    public void setCodModular(String CodModular) {
        this.CodModular = CodModular;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getJornada_Laboral() {
        return Jornada_Laboral;
    }

    public void setJornada_Laboral(int Jornada_Laboral) {
        this.Jornada_Laboral = Jornada_Laboral;
    }

    public String getIdsubtipo() {
        return Idsubtipo;
    }

    public void setIdsubtipo(String Idsubtipo) {
        this.Idsubtipo = Idsubtipo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSituacion() {
        return Situacion;
    }

    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }

    public Plaza(String Titular, String CodModular, String Observaciones, String Estado, int Jornada_Laboral, String Idsubtipo, String Cargo, String Situacion) {
        this.Titular = Titular;
        this.CodModular = CodModular;
        this.Observaciones = Observaciones;
        this.Estado = Estado;
        this.Jornada_Laboral = Jornada_Laboral;
        this.Idsubtipo = Idsubtipo;
        this.Cargo = Cargo;
        this.Situacion = Situacion;
    }
    
    
        
}
