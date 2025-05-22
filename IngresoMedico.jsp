<%-- 
    Document   : IngresoMedico
    Created on : 25/07/2024, 10:20:01
    Author     : Jordy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
 <!DOCTYPE html>
<html lang="en">   

    <%@include file="Componentes/Header.jsp" %>    
    <%@include file="Componentes/BodyUno.jsp" %>
    
    <h1>Ingreso del Medico</h1>
    
    <form class="user">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="Ingresarcedula"
                                            placeholder="Cedula Ciudadania">
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="Ingresarmombres"
                                            placeholder="Nombres">
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-1">
                                        <input type="text" class="form-control form-control-user" id="Ingresarapellidos"
                                            placeholder="Apellidos">
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-1">
                                        <input type="text" class="form-control form-control-user" id="Ingresartelefono"
                                            placeholder="Telefono">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control form-control-user" id="Ingresarcorreo"
                                        placeholder="Correo Electronico">
                                </div>
                                <div class="form-group">
                                    <input type="Direccion" class="form-control form-control-user" id="IngresarDireccion"
                                        placeholder="Direccion">
                                </div>
                                <div class="form-group">
                                    <input type="fecha" class="form-control form-control-user" id="IngresarFecha"
                                        placeholder="Fecha Nacimiento">
                                </div>
        
        <!-- Aqui se ingresa los turnos y la especialidad del medico --> 
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    Ingresar Medico
                                </a>
                                <hr>
                            </form>
    <%@include file="Componentes/Footer.jsp" %>

    
 </html>