/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.waste.entidades;

import java.util.List;
import mx.itson.waste.enumeradores.Usos;

/**
 *
 * @author mane0
 */
public class Office {
    
    private String nombre;
    private String descripcion;
    private List<Descarga> descarga;
    private List<Instalacion> instalacion;
    private List<Activacion> activacion;
    private List<Requisito> requisitos;
    private Empresa empresa;
    private Usos usos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Descarga> getDescarga() {
        return descarga;
    }

    public void setDescarga(List<Descarga> descarga) {
        this.descarga = descarga;
    }

    public List<Instalacion> getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(List<Instalacion> instalacion) {
        this.instalacion = instalacion;
    }

    public List<Activacion> getActivacion() {
        return activacion;
    }

    public void setActivacion(List<Activacion> activacion) {
        this.activacion = activacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

    public Usos getUsos() {
        return usos;
    }

    public void setUsos(Usos usos) {
        this.usos = usos;
    }
    
    
    
    
}
