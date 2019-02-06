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
public class InstitucionEducativa {
    private String IdInstitucioneducativa;
    private String DREC;
    private String UGEL;
    private String Nombre;
    private String Provincia;
    private String Distrito;
    private String Departamento;
    private String Codigo_Modular;
    private String Correo_Instotucional;
    private String NroTelefono;
    private String Direccion;
    private String NivelEducativo;
    private String TipoIE;
    private String Gestion;
    private String Zona;
    private String Clave;

    public String getIdInstitucioneducativa() {
        return IdInstitucioneducativa;
    }

    public void setIdInstitucioneducativa(String IdInstitucioneducativa) {
        this.IdInstitucioneducativa = IdInstitucioneducativa;
    }

    public String getDREC() {
        return DREC;
    }

    public void setDREC(String DREC) {
        this.DREC = DREC;
    }

    public String getUGEL() {
        return UGEL;
    }

    public void setUGEL(String UGEL) {
        this.UGEL = UGEL;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCodigo_Modular() {
        return Codigo_Modular;
    }

    public void setCodigo_Modular(String Codigo_Modular) {
        this.Codigo_Modular = Codigo_Modular;
    }

    public String getCorreo_Instotucional() {
        return Correo_Instotucional;
    }

    public void setCorreo_Instotucional(String Correo_Instotucional) {
        this.Correo_Instotucional = Correo_Instotucional;
    }

    public String getNroTelefono() {
        return NroTelefono;
    }

    public void setNroTelefono(String NroTelefono) {
        this.NroTelefono = NroTelefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public String getTipoIE() {
        return TipoIE;
    }

    public void setTipoIE(String TipoIE) {
        this.TipoIE = TipoIE;
    }

    public String getGestion() {
        return Gestion;
    }

    public void setGestion(String Gestion) {
        this.Gestion = Gestion;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public InstitucionEducativa(String DREC, String UGEL, String Nombre, String Provincia, String Distrito, String Departamento, String Codigo_Modular, String Correo_Instotucional, String NroTelefono, String Direccion, String NivelEducativo, String TipoIE, String Gestion, String Zona, String Clave) {
        this.DREC = DREC;
        this.UGEL = UGEL;
        this.Nombre = Nombre;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.Departamento = Departamento;
        this.Codigo_Modular = Codigo_Modular;
        this.Correo_Instotucional = Correo_Instotucional;
        this.NroTelefono = NroTelefono;
        this.Direccion = Direccion;
        this.NivelEducativo = NivelEducativo;
        this.TipoIE = TipoIE;
        this.Gestion = Gestion;
        this.Zona = Zona;
        this.Clave = Clave;
    }
    
    
}
