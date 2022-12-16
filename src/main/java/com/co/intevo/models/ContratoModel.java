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
    private String fechaIncioContrato;
    private String fechaFinalizacionContrato;
    private long valorContrato;
    private int prorroga;

    public ContratoModel() {
    }

    public long getidContrato() {
        return idContrato;
    }

    public void setidContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public String getfechaIncioContrato() {
        return fechaIncioContrato;
    }

    public void setfechaIncioContrato(String fechaIncioContrato) {
        this.fechaIncioContrato = fechaIncioContrato;
    }

    public String getfechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    public void setfechaFinalizacionContrato(String fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    public long getValorContrato() {
        return valorContrato;
    }
    
    public void setValorContrato(long valorContrato) {
        this.valorContrato = valorContrato;
    }
    
    public int getProrroga() {
        return prorroga;
    }
    
    public void setProrroga(int prorroga) {
        this.prorroga = prorroga;
    }
}
