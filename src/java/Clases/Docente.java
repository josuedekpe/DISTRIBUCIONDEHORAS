/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PC-04
 */
public class Docente {

    private String IdDocente;
    private String ApPaterno;
    private String ApMaterno;
    private String Nombres;
    private String DNI;
    private String CodigoModular;
    private String Fecha_Nac;
    private String Fecha_Ingreso;
    private String Telefono;
    private String Correo;
    private String EscMagisterial;
    private String Cargo;
    private Connection conexion;

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(String IdDocente) {
        this.IdDocente = IdDocente;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigoModular() {
        return CodigoModular;
    }

    public void setCodigoModular(String CodigoModular) {
        this.CodigoModular = CodigoModular;
    }

    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }

    public String getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(String Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEscMagisterial() {
        return EscMagisterial;
    }

    public void setEscMagisterial(String EscMagisterial) {
        this.EscMagisterial = EscMagisterial;
    }

    public Docente(String IdDocente, String ApPaterno, String ApMaterno, String Nombres, String DNI, String CodigoModular, String Fecha_Nac, String Fecha_Ingreso, String Telefono, String Correo, String EscMagisterial, String Cargo) {
        this.IdDocente = IdDocente;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Nombres = Nombres;
        this.DNI = DNI;
        this.CodigoModular = CodigoModular;
        this.Fecha_Nac = Fecha_Nac;
        this.Fecha_Ingreso = Fecha_Ingreso;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.EscMagisterial = EscMagisterial;
        this.Cargo = Cargo;
    }

    public Docente(Connection p_Conexion) {
        conexion = p_Conexion;
    }

    public ResultSet ListarDocente() {
        try {
            // crear un CallableStatement para la ejecución del procedimiento almacenado
            CallableStatement cst = conexion.prepareCall("CALL spMostarDocente()");
            // ejecutar el procedimiento almacenado y retornar el resultado
            return cst.executeQuery();
        } catch (SQLException ex) {

            // retornar el valor de la función
            return null;
        }
    }

    // definición de los metodos de la clase

    public boolean Insertar() {
        try {
            // crear un CallableStatement para la ejecución del procedimiento almacenado
            CallableStatement cst = conexion.prepareCall("CALL spInsertarDocente('D0000001'," + ApPaterno + "','" + ApMaterno + "'," + Nombres + "," + DNI + "," + CodigoModular + "," + Telefono + "," + Correo + "," + EscMagisterial + "," + Cargo + ")");
            // asignar valor a los parametros del procedimiento almacenado
            // ejecutar el procedimiento almacenado
            cst.execute();

            return true;

        } catch (SQLException ex) {

            return false;
        }
    }
}
