package com.parabank.qa.models;

import java.util.Map;

public class RegistroModel {
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codPostal;
    private String documento;
    private String usuario;
    private String password;

    public RegistroModel(String nombre, String apellido, String direccion, String ciudad, String estado, String codPostal, String documento, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codPostal = codPostal;
        this.documento = documento;
        this.usuario = usuario;
        this.password = password;
    }

    public static RegistroModel registroModel(Map<String,String> registro){
        return new RegistroModel(
                registro.get("nombre"),
                registro.get("apellido"),
                registro.get("direccion"),
                registro.get("ciudad"),
                registro.get("estado"),
                registro.get("codPostal"),
                registro.get("documento"),
                registro.get("usuario"),
                registro.get("password")
        );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
