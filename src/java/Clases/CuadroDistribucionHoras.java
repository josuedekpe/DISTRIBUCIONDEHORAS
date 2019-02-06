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
public class CuadroDistribucionHoras {
    private String IdCuadroDistribucionHoras;
    private String FechaInicio;
    private String FechaFin;
    private String TipoRegistro;
    private String Preventiva;
    private String IdPlaza;
    private String IdCargaH_Asignatura;
    private String IdDocente;

    public String getIdCuadroDistribucionHoras() {
        return IdCuadroDistribucionHoras;
    }

    public void setIdCuadroDistribucionHoras(String IdCuadroDistribucionHoras) {
        this.IdCuadroDistribucionHoras = IdCuadroDistribucionHoras;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getTipoRegistro() {
        return TipoRegistro;
    }

    public void setTipoRegistro(String TipoRegistro) {
        this.TipoRegistro = TipoRegistro;
    }

    public String getPreventiva() {
        return Preventiva;
    }

    public void setPreventiva(String Preventiva) {
        this.Preventiva = Preventiva;
    }

    public String getIdPlaza() {
        return IdPlaza;
    }

    public void setIdPlaza(String IdPlaza) {
        this.IdPlaza = IdPlaza;
    }

    public String getIdCargaH_Asignatura() {
        return IdCargaH_Asignatura;
    }

    public void setIdCargaH_Asignatura(String IdCargaH_Asignatura) {
        this.IdCargaH_Asignatura = IdCargaH_Asignatura;
    }

    public String getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(String IdDocente) {
        this.IdDocente = IdDocente;
    }

    public CuadroDistribucionHoras(String FechaInicio, String FechaFin, String TipoRegistro, String Preventiva, String IdPlaza, String IdCargaH_Asignatura, String IdDocente) {
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.TipoRegistro = TipoRegistro;
        this.Preventiva = Preventiva;
        this.IdPlaza = IdPlaza;
        this.IdCargaH_Asignatura = IdCargaH_Asignatura;
        this.IdDocente = IdDocente;
    }
    
    
}
