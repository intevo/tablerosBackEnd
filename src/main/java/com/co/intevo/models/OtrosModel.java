package com.co.intevo.models;
import javax.persistence.*;


@Entity
@Table(name ="otros")
public class OtrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    public long idOtros;
    public String descripServicios;

    public OtrosModel() {
    }

    public long getIdOtros() {
        return idOtros;
    }

    public void setIdOtros(long idOtros) {
        this.idOtros = idOtros;
    }

    public String getdescripServicios() {
        return descripServicios;
    }

    public void setdescripServicios(String descripServicios) {
        this.descripServicios = descripServicios;
    }
}
