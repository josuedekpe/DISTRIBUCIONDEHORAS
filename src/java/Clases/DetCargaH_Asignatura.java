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
public class DetCargaH_Asignatura {
    private String IdCargaH_Asignatura;
    private String IdCargaHoraria;
    private String IdAsignatura;
    private int Horas;

    public String getIdCargaH_Asignatura() {
        return IdCargaH_Asignatura;
    }

    public void setIdCargaH_Asignatura(String IdCargaH_Asignatura) {
        this.IdCargaH_Asignatura = IdCargaH_Asignatura;
    }

    public String getIdCargaHoraria() {
        return IdCargaHoraria;
    }

    public void setIdCargaHoraria(String IdCargaHoraria) {
        this.IdCargaHoraria = IdCargaHoraria;
    }

    public String getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(String IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public DetCargaH_Asignatura(String IdAsignatura, int Horas) {
        this.IdAsignatura = IdAsignatura;
        this.Horas = Horas;
    }
}
