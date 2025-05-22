/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Jordy
 */
@Entity
public class Doctor extends Persona implements Serializable{
    //Atributos
   // private int id_doctor;
    private String especialidad;
    
    //relaciones; se relaciona doctor de uno a uno con horario
    @OneToOne
    private Horario unHorario;

    // s relaciona de uno a uno con usuario
    @OneToOne
    private Usuario unUsuario;
    
    //y se relaciona de uno a muchos con turno (se relaciona en una coleccion)
    // una relacion de uno a muvhos bidireccional significa que en ambas clases deben existir las anotaciones
    // correspondiente
    
    @OneToMany(mappedBy="doctores")
    private List<Turno> listaTurnos;
    
   
    // Constructores
    public Doctor() {
    }

    public Doctor(String especialidad, Horario unHorario, Usuario unUsuario, List<Turno> listaTurnos, int id, String nombres, String apellidos, String cedula, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cedula, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.especialidad = especialidad;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
        this.listaTurnos = listaTurnos;
    }


       //get y set

public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
//    public int getId_doctor() {
//        return id_doctor;
//    }

    public String getEspecialidad() {
        return especialidad;
    }

//    public void setId_doctor(int id_doctor) {
//        this.id_doctor = id_doctor;
//    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
