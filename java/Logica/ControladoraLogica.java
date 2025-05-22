/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author Jordy
 */
public class ControladoraLogica {
    
    ControladoraPersistencia Ctrl_Pers = new ControladoraPersistencia();
    
    
   // crear los metodos del crud
    
   //para la clase usuario
   public void crearusuario(int id_usuario, String nombre_usuario, String contrasenia_usuario) {
       
       Usuario usu = new Usuario(id_usuario, nombre_usuario, contrasenia_usuario);
       Ctrl_Pers.CrearUsuario(usu);
   }
   
   public void actualizarusuario(){
       
   }
   
   
   public void eliminarusuario(){
       
   }
   
   public void leerusuario(){
       
   }
   
   
   // para la clase doctor
   
   public void creardoctor(){
       
      
   }
}
