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
public class CargaHoraria {
    private String IdCargaHoraia;
    private String IdAnioAcademico;
    private String IdGrado;
    private int NroAlumnos;
    private int NroSecciones                                                                            ;
    private int CantHoras;
    private int CargaDocente;
    private String IdModalidad;

    public String getIdCargaHoraia() {
        return IdCargaHoraia;
    }

    public void setIdCargaHoraia(String IdCargaHoraia) {
        this.IdCargaHoraia = IdCargaHoraia;
    }

    public String getIdAnioAcademico() {
        return IdAnioAcademico;
    }

    public void setIdAnioAcademico(String IdAnioAcademico) {
        this.IdAnioAcademico = IdAnioAcademico;
    }

    public String getIdGrado() {
        return IdGrado;
    }

    public void setIdGrado(String IdGrado) {
        this.IdGrado = IdGrado;
    }

    public int getNroAlumnos() {
        return NroAlumnos;
    }

    public void setNroAlumnos(int NroAlumnos) {
        this.NroAlumnos = NroAlumnos;
    }

    public int getNroSecciones() {
        return NroSecciones;
    }

    public void setNroSecciones(int NroSecciones) {
        this.NroSecciones = NroSecciones;
    }

    public int getCantHoras() {
        return CantHoras;
    }

    public void setCantHoras(int CantHoras) {
        this.CantHoras = CantHoras;
    }

    public int getCargaDocente() {
        return CargaDocente;
    }

    public void setCargaDocente(int CargaDocente) {
        this.CargaDocente = CargaDocente;
    }

    public String getIdModalidad() {
        return IdModalidad;
    }

    public void setIdModalidad(String IdModalidad) {
        this.IdModalidad = IdModalidad;
    }

    public CargaHoraria(String IdAnioAcademico, String IdGrado, int NroAlumnos, int NroSecciones, int CantHoras, int CargaDocente, String IdModalidad) {
        this.IdAnioAcademico = IdAnioAcademico;
        this.IdGrado = IdGrado;
        this.NroAlumnos = NroAlumnos;
        this.NroSecciones = NroSecciones;
        this.CantHoras = CantHoras;
        this.CargaDocente = CargaDocente;
        this.IdModalidad = IdModalidad;
    }
}
