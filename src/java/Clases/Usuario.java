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

public class Usuario {
    private String IdUsuario;
    private String Usuario;
    private String Contrasenia;
    private String FechaAlta;
    private String Estado;
    private String tipousuario;

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(String FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public Usuario(String Usuario, String Contrasenia, String FechaAlta, String Estado, String tipousuario) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.FechaAlta = FechaAlta;
        this.Estado = Estado;
        this.tipousuario = tipousuario;
    }

   
    
    
      // constructor
    public Usuario(Connection p_Conexion)
    {
        conexion = p_Conexion;
    }

     public ResultSet Listar(String dni)
    {
        try
        {
            // crear un CallableStatement para la ejecución del procedimiento almacenado
            CallableStatement cst = conexion.prepareCall("CALL Login('"+dni+"' )");
             // asignar valor a los parametros del procedimiento almacenado
            
            return cst.executeQuery();
        }
        catch (SQLException ex)
        {
            setMensaje("Error: " + ex.getMessage());
            // retornar el valor de la función
            return null;
        }
    }
     
     public ResultSet Listarcandidatos(String dni)
    {
        try
        {
            // crear un CallableStatement para la ejecución del procedimiento almacenado
            CallableStatement cst = conexion.prepareCall("CALL Listar_Candidatos()");
             // asignar valor a los parametros del procedimiento almacenado
            
            return cst.executeQuery();
        }
        catch (SQLException ex)
        {
            setMensaje("Error: " + ex.getMessage());
            // retornar el valor de la función
            return null;
        }
    }
    
     public ResultSet VerificarVotacion(int idalumno)
    {
        try
        {
            // crear un CallableStatement para la ejecución del procedimiento almacenado
            CallableStatement cst = conexion.prepareCall("CALL verificarvotacion('"+idalumno+"')");
             // asignar valor a los parametros del procedimiento almacenado
            
            return cst.executeQuery();
        }
        catch (SQLException ex)
        {
            setMensaje("Error: " + ex.getMessage());
            // retornar el valor de la función
            return null;
        }
    }
    
    
    
    
    
}
