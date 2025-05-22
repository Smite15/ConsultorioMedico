/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuario;

/**
 *
 * @author Jordy
 */
public class ControladoraPersistencia {
    
    //crear las instancias de las jpa controller.
    AsistenteJpaController asisJPA = new AsistenteJpaController();
    DoctorJpaController doctJPA = new DoctorJpaController();
    HorarioJpaController horaJPA = new HorarioJpaController();
    PacienteJpaController paciJPA = new PacienteJpaController();
    PersonaJpaController persJPA = new PersonaJpaController();
    ResponsableJpaController resJPA = new ResponsableJpaController();
    TurnoJpaController turnJPA = new TurnoJpaController();
    UsuarioJpaController UsuaJPA = new UsuarioJpaController();

    //crear los metodos del crud 
    
    // con la clase usuario
    
    public void CrearUsuario(Usuario usu) {
        UsuaJPA.create(usu);
       
    }
}
