package com.co.intevo.models;

import javax.persistence.*;

@Entity
@Table(name ="ans")
public class AnsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idAns;

    @OneToOne
    private FacturaModel factura;

    @OneToOne
    private CategoriasModel categorias;
    
    private String descripcion;
    private double cantidadAns;
    private double precioUnit;
    private double cantidadEntrega;
    private double valorTotal;
    private String nombreCategoria;
 
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
        double ans = 0;
        if(this.precioUnit > 0 && this.cantidadAns > 0){
            ans = (this.precioUnit * this.cantidadAns);    
            return ans;
        }else{
            return 0;
        }
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
    
    
}
