package com.co.intevo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="contrato")
public class ContratoModel {
    @Id
    @Column(unique = false, nullable = false)
    private long idContrato;
    private String fechaInicio;
    private String fechaFinalizacion;
    private long valorContrato;

    public ContratoModel() {
    }

    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public long getValorContrato() {
        return valorContrato;
    }
    
    public void setValorContrato(long valorContrato) {
        this.valorContrato = valorContrato;
    }
    
    


    


    
}
