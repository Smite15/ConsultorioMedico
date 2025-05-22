/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jordy
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuario;
    private String nombre_usuario;
    private String contrasenia_usuario;

    
    //Relaciones se relaciona paciente de uno a uno con responsable
    //y se relaciona de uno a muchos con turno 
    
    private Responsable unResponsable;
    private List<Turno> ListaTurnos;
    
    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String contrasenia_usuario, Responsable unResponsable, List<Turno> ListaTurnos) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.unResponsable = unResponsable;
        this.ListaTurnos = ListaTurnos;
    }

    public Usuario(int id_usuario, String nombre_usuario, String contrasenia_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
    }

    

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return ListaTurnos;
    }

    public void setListaTurnos(List<Turno> ListaTurnos) {
        this.ListaTurnos = ListaTurnos;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }
    
    
    
}