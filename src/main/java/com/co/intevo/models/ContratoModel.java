package com.co.intevo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="contrato")
public class ContratoModel {
    @Id
    @Column(unique = true, nullable = false, name = "idContrato")
    private long idContrato;
    private String nombreContrato;
    private String fechaIncioContrato;
    private String fechaFinalizacionContrato;
    private long valorContrato;
    private int valorNetoContrato;
    private int prorroga;
    

    public ContratoModel() {
    }

    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaIncioContrato() {
        return fechaIncioContrato;
    }

    public void setFechaIncioContrato(String fechaIncioContrato) {
        this.fechaIncioContrato = fechaIncioContrato;
    }

    public String getFechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    public void setFechaFinalizacionContrato(String fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    public long getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(long valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getNombreContrato() {
        return nombreContrato;
    }

    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
    }

    public int getProrroga() {
        return prorroga;
    }

    public void setProrroga(int prorroga) {
        this.prorroga = prorroga;
    }

    public int getValorNetoContrato() {
        return valorNetoContrato;
    }

    public void setValorNetoContrato(int valorNetoContrato) {
        this.valorNetoContrato = valorNetoContrato;
    }

    
    
}
