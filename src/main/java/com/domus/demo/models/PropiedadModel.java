package com.domus.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propiedad")
public class PropiedadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String tipo;
    private String ubicacion;
    private Boolean artefactos;
    private Integer espacios;
    private String servicios;
    private String tipoContrato;
    private Float antiguedad;
    private Boolean amueblado;
    private Boolean disponibilidad;
    private Float precio;
    private String descripcion;
    private String imagen;
    private Integer nroCliente;

    public Long getId() {
        return id;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public Integer getEspacios() {
        return espacios;
    }

    public void setEspacios(Integer espacios) {
        this.espacios = espacios;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidadl(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Boolean getAmueblado() {
        return amueblado;
    }

    public void setAmueblado(Boolean amueblado) {
        this.amueblado = amueblado;
    }

    public Float getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Float antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Boolean getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(Boolean artefactos) {
        this.artefactos = artefactos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
