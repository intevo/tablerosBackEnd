package com.co.intevo.models;

import javax.persistence.*;

// import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "facturas")
// @SQLDelete(sql = "DELETE ans WHERE factura = ?")
public class FacturaModel {
    @Id
    @Column(unique = true, nullable = false)
    private long idFactura;
    private String fechaRegistro;
    private String fechaEntrega;
    private long valorTotal;
    private long facturaTotal;
    private long ValorDescuento;
    private long valorTotalFacturado;
    private String descripcionServicios;
    private String observacionFactura;
    private Long contrato;
    private int  prorroga;

    public FacturaModel() {
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
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

    public long getValorDescuento() {
        return ValorDescuento;
    }

    public void setValorDescuento(long ValorDescuento) {
        this.ValorDescuento = ValorDescuento;
    }

    public long getvalorTotalFacturado() {
        return valorTotalFacturado;
    }

    public void setvalorTotalFacturado(long valorTotalFacturado) {
        this.valorTotalFacturado = valorTotalFacturado;
    }

    public long getfacturaTotal() {
        return facturaTotal;
    }

    public void setfacturaTotal(long facturaTotal) {
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

    public Long getContrato() {
        return this.contrato;
    }

    public void setContrato(Long contrato) {
        this.contrato = contrato;
    }

    public int getProrroga() {
        return this.prorroga;
    }

    public void setProrroga(int prorroga) {
        this.prorroga = prorroga;
    }
    
}
