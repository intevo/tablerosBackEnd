package com.co.intevo.models;
//prueba
import javax.persistence.*;

@Entity
@Table(name ="ans")
public class AnsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private long idAns;
    private String descripcion;
    private double porcentaje;
    private long valorFactura;
    private long valorDescuento;
    private long valorTotal;
    private long Factura;
    private String observacionAns;
    private int notaCredito;
    private long valorNotacredito;
 
    public AnsModel() {
    }


    public long getIdAns() {
        return idAns;
    }

    public void setIdAns(long idAns) {
        this.idAns = idAns;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }   

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public long getvalorFactura() {
        return valorFactura;
    }
    
    public void setvalorFactura(long valorFactura) {
        this.valorFactura = valorFactura;
    }

    public long getvalorDescuento() {
        return valorDescuento;
    }

    public void setvalorDescuento(long valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public long getValorTotal() {
        if(this.valorFactura > 0 && this.valorDescuento  > 0){
            valorTotal = (this.valorFactura - this.valorDescuento);    
            return valorTotal;
        }else{
            return 0;
        }
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getFactura() {
        return Factura;
    }

    public void setFactura(long Factura) {
        this.Factura = Factura;
    }

    public String getobservacionAns() {
        return observacionAns;
    }

    public void setobservacionAns(String observacionAns) {
        this.observacionAns = observacionAns;
    }

    public int getnotaCredito() {
        return notaCredito;
    }

    public void setnotaCredito(int notaCredito) {
        this.notaCredito = notaCredito;
    }

    public long getvalorNotacredito() {
        return valorNotacredito;
    }

    public void setvalorNotacredito(long valorNotacredito) {
        this.valorNotacredito = valorNotacredito;
    }
}
