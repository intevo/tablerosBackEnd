package com.co.intevo.models;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name ="facturas")
public class FacturaModel {
    @Id
    @Column(unique = false, nullable = false)
    private long idFactura;
    private String fechaRegistro;
    private String fechaEntrega;
    private double valorTotal;

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

    public double getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
