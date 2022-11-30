package com.co.intevo.models;

import javax.persistence.*;

// @Entity
// @Table(name = "facturas")
// public class FacturaModel {
// @Id
// @Column(unique = true, nullable = false, name = "id_factura")
public class idFacturaModel {
    @Id
    @Column(unique = true, nullable = false, name = "id_factura")
    private long idFactura;
    private long valorTotal;

    public idFacturaModel() {
    }

    public idFacturaModel(long idFactura, long valorTotal) {
        this.idFactura = idFactura;
        this.valorTotal = valorTotal;
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

}


