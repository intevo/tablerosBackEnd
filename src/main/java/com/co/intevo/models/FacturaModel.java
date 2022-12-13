package com.co.intevo.models;

import javax.persistence.*;

@Entity
@Table(name = "facturas")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "idFac")
    private long idFac;
    private long numFactura;
    private String fechaRegistro;
    private String fechaEntrega;
    private long valorTotal;
    private String facturaTotal;
    private String descripcionServicios;
    private String observacionFactura;

    public FacturaModel(
            long idFac) {
                this.idFac = idFac;
    }

    public FacturaModel() {
    }

    public long getIdFac() {
        return idFac;
    }

    public void setIdFac(long idFac) {
        this.idFac = idFac;
    }

    public long getnumFactura() {
        return numFactura;
    }

    public void setnumFactura(long numFactura) {
        this.numFactura = numFactura;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getfacturaTotal() {
        return facturaTotal;
    }

    public void setfacturaTotal(String facturaTotal) {
        this.facturaTotal = facturaTotal;
    }

    public String getdescripcionServicios() {
        return descripcionServicios;
    }

    public void setdescripcionServicios(String descripcionServicios) {
        this.descripcionServicios = descripcionServicios;
    }

    public String getobservacionFactura() {
        return observacionFactura;
    }

    public void setobservacionFactura(String observacionFactura) {
        this.observacionFactura = observacionFactura;
    }
    
}
