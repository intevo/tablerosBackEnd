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
    private String nombreCategoria;
    private double cantidadAns;
    private double precioUnit;
    private double cantidadEntrega;
    private double valorTotal;
    private String idFactura;
 
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

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public double getcantidadAns() {
        return cantidadAns;
    }   

    public void setcantidadAns(double cantidadAns) {
        this.cantidadAns = cantidadAns;
    }
    public double getPrecioUnit() {
        return precioUnit;
    }
    
    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getcantidadEntrega() {
        return cantidadEntrega;
    }

    public void setcantidadEntrega(double cantidadEntrega) {
        this.cantidadEntrega = cantidadEntrega;
    }

    public double getValorTotal() {
        if(this.precioUnit > 0 && this.cantidadAns > 0){
            valorTotal = (this.precioUnit * this.cantidadAns);    
            return valorTotal;
        }else{
            return 0;
        }
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFactura() {
        return idFactura;
    }

    public void setFactura(String idFactura) {
        this.idFactura = idFactura;
    }
}
