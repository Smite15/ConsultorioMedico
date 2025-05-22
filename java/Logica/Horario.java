/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jordy
 */
@Entity
 public class Horario implements Serializable {
        
        //atributos
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_horario;
    private String horario_inicial;
    private String horario_final;
        
        /// constructores

    public Horario() {
    }

    public Horario(int id_horario, String horario_inicial, String horario_final) {
        this.id_horario = id_horario;
        this.horario_inicial = horario_inicial;
        this.horario_final = horario_final;
    }
        
    // get and set

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario_inicial() {
        return horario_inicial;
    }

    public void setHorario_inicial(String horario_inicial) {
        this.horario_inicial = horario_inicial;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }
    
}
