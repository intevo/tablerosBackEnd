package com.co.intevo.models;
//prueba
import javax.persistence.*;

@Entity
@Table(name ="registro")
public class RegistroModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private long idRegistro;
    private String nombres;
    private long telefono;
    private String email;
    private String proyecto;
    private String cargo;
    private String pass;
 
    public RegistroModel() {
    }


    public long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public long getTelefono() {
        return telefono;
    }   

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
