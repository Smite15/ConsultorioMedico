/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author Jordy
 */
@Entity
public class Paciente extends Persona implements Serializable{
    
    // Atributos
    //private int id_paciente;
    private String tiene_seguro;
    private String tipo_sangre;
    
    //relaciones; se relaciona paciente de uno a uno con responsable    
    @OneToOne
    private Responsable unResponsable;
    
    // y se rekacuiba de uno a muchos con turno (se relaciona con una coleccion)
    // una relacion de uno a muvhos bidireccional significa que en ambas clases deben existir las anotaciones
    // correspondiente
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurnos;
    
    
    // Constructores
    public Paciente() {
    }

    public Paciente(String tiene_seguro, String tipo_sangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String nombres, String apellidos, String cedula, String direccion, String telefono, String correo_electronico, Date fecha_nacimiento) {
        super(id, nombres, apellidos, cedula, direccion, telefono, correo_electronico, fecha_nacimiento);
        this.tiene_seguro = tiene_seguro;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    // Get y Set
////    public int getId_paciente() {
////       return id_paciente;
////    }
////
////    public void setId_paciente(int id_paciente) {
////        this.id_paciente = id_paciente;
////    } 

    public void setTiene_seguro(String tiene_seguro) {
        this.tiene_seguro = tiene_seguro;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getTiene_seguro() {
        return tiene_seguro;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }
    
    
}