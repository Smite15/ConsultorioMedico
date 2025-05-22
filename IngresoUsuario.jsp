

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
 <!DOCTYPE html>
<html lang="en">   

    <%@include file="Componentes/Header.jsp" %>    
    <%@include file="Componentes/BodyUno.jsp" %>
    
    <h1>Ingreso de USUARIOS </h1>
    
    <form class="user">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="txtidusuario"
                                            placeholder="IDUsuario">
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="txtnombreusuario"
                                            placeholder="Nombre Usuario">
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-1">
                                        <input type="password" class="form-control form-control-user" id="txtcontraseña"
                                            placeholder="Contraseña">
                                    </div>
                                </div>
    
                     <!-- Aqui se ingresa los turnos y la especialidad del medico --> 
                     
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    Ingresar USUARIO
                                </a>
                                <hr>
                            </form>
    <%@include file="Componentes/Footer.jsp" %>

    
 </html>