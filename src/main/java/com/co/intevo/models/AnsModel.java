package com.co.intevo.models;

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
    private double valorFactura;
    private double valorDescuento;
    private double valorTotal;
 
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
    public double getvalorFactura() {
        return valorFactura;
    }
    
    public void setvalorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public double getvalorDescuento() {
        return valorDescuento;
    }

    public void setvalorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

       public double getValorTotal() {
        if(this.valorFactura > 0 && this.valorDescuento  > 0){
            valorTotal = (this.valorFactura - this.valorDescuento);    
            return valorTotal;
        }else{
            return 0;
        }
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
