package com.co.intevo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="prorroga")
public class ProrrogaModel {
    @Id
    @Column(unique = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProrroga;
    private String numeroProrroga;
    private String fechaIncioProrroga;
    private String fechaFinalizacionProrroga;
    private long valorProrroga;

    public ProrrogaModel() {
    }

    public long getIdProrroga() {
        return idProrroga;
    }

    public void setIdProrroga(long idProrroga) {
        this.idProrroga = idProrroga;
    }
    public String getnumeroProrroga() {
        return numeroProrroga;
    }

    public void setnumeroProrroga(String numeroProrroga) {
        this.numeroProrroga = numeroProrroga;
    }

    public String getfechaIncioProrroga() {
        return fechaIncioProrroga;
    }

    public void setfechaIncioProrroga(String fechaIncioProrroga) {
        this.fechaIncioProrroga = fechaIncioProrroga;
    }

    public String getfechafechaFinalizacionProrroga() {
        return fechaFinalizacionProrroga;
    }

    public void setfechaFinalizacionProrroga(String fechaFinalizacionProrroga) {
        this.fechaFinalizacionProrroga = fechaFinalizacionProrroga;
    }

    public long getvalorProrroga() {
        return valorProrroga;
    }
    
    public void setvalorProrroga(long valorProrroga) {
        this.valorProrroga = valorProrroga;
    }
    
    


    


    
}

