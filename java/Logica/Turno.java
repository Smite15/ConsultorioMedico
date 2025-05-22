 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jordy
 */
@Entity
public class Turno implements Serializable {
    
    //atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turnos;
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    private String hora_turno;
    
    //debemos de relacionar con pacientes el uno a muchos y en caso de turno seria de muchos a uno.
    //por la BIDIRECCIONALIDAD
    
    @ManyToOne
    @JoinColumn(name="id_turno2")
    private Paciente pacien;
    
       //debemos de relacionar con doctor el uno a muchos y en caso de turno seria de muchos a uno.
    //por la BIDIRECCIONALIDAD 
    
    @ManyToOne
    @JoinColumn(name="id_turno")
    private Doctor doctores;

    //constructores
    public Turno() {
    }

    public Turno(int id_turnos, Date fecha_turno, String hora_turno) {
        this.id_turnos = id_turnos;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
    }
    
    // get and set

    public int getId_turno() {
        return id_turnos;
    }

    public void setId_turno(int id_turnos) {
        this.id_turnos = id_turnos;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }
    
}
