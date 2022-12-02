package com.co.intevo.models;

import javax.persistence.*;

@Entity
@Table(name ="categorias")
public class CategoriasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    public long idCategoria;
    public String nombreCategoria;
    public String descripServicios;

    public CategoriasModel() {
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getdescripServicios() {
        return descripServicios;
    }

    public void setdescripServicios(String descripServicios) {
        this.descripServicios = descripServicios;
    }

    
}
