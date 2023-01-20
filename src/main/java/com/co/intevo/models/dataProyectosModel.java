package com.co.intevo.models;

import javax.persistence.*;

@Entity
@Table(name ="dataProyectos")
public class dataProyectosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    public long idProyectos;
    public String descripcionProyectos;

    public dataProyectosModel() {
    }

    public long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getDescripcionProyectos() {
        return descripcionProyectos;
    }

    public void setDescripcionProyectos(String descripcionProyectos) {
        this.descripcionProyectos = descripcionProyectos;
    }
}
