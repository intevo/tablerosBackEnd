package com.co.intevo.models;

import javax.persistence.*;

// import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "facturas")
// @SQLDelete(sql = "DELETE ans WHERE factura = ?")
public class FacturaModel {
    @Id
    @Column(unique = true, nullable = false, name = "idFactura")
    private long idFactura;
    private String fechaRegistro;
    private String fechaEntrega;
    private long valorTotal;
    private String facturaTotal;
    private String descripcionServicios;
    private String observacionFactura;

    public FacturaModel(
            long idFactura) {
                this.idFactura = idFactura;
    }

    public FacturaModel() {
    }

    public long getidFactura() {
        return idFactura;
    }

    public void setidFactura(long idFactura) {
        this.idFactura = idFactura;
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
