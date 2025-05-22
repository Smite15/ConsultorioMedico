/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Jordy
 */
@Entity
public class Asistente extends Persona {
    
    //atributos 
    private int id_asistente;
    private String lugar_trabajo;
    
    // relaciones se relaciona asistente de una a uno con usuario (se relaciona con la misma clase)
    @OneToOne
    private Usuario unUsuario;
    //constructores

    public Asistente() {
    }

    public Asistente(int id_asistente, String lugar_trabajo, Usuario unUsuario, int id, String nombres, String apellidos, String cedula, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cedula, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.id_asistente = id_asistente;
        this.lugar_trabajo = lugar_trabajo;
        this.unUsuario = unUsuario;
    }

    
    /// get and set

    public int getId_asistente() {
        return id_asistente;
    }

    public void setId_asistente(int id_asistente) {
        this.id_asistente = id_asistente;
    }

    public String getLugar_trabajo() {
        return lugar_trabajo;
    }

    public void setLugar_trabajo(String lugar_trabajo) {
        this.lugar_trabajo = lugar_trabajo;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

   
}
