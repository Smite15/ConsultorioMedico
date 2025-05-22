/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;


/**
 *
 * @author Jordy
 *
 */
@Entity
public class Responsable extends Persona implements Serializable{
    //atributos
    private int id_responsable;
    private String Tipo_responsabilidad; 
    
    //constructores

    public Responsable() {
      
    }

    public Responsable(int id_responsable, String Tipo_responsabilidad, int id, String nombres, String apellidos, String cedula, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cedula, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.id_responsable = id_responsable;
        this.Tipo_responsabilidad = Tipo_responsabilidad;
    }

    
    // get and set

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipo_responsabilidad() {
        return Tipo_responsabilidad;
    }

    public void setTipo_responsabilidad(String Tipo_responsabilidad) {
        this.Tipo_responsabilidad = Tipo_responsabilidad;
    }
    
}
