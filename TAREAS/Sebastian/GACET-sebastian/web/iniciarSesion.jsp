<%-- 
    Document   : iniciarSesion
    Created on : 24/05/2018, 02:31:14 PM
    Author     : alvar
--%>

<%@page import="org.omg.CORBA.UnionMemberHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String nombre;
            if(request.getSession().getAttribute("nombre")!=null){
                 nombre= request.getSession().getAttribute("nombre").toString();                
            }else{
                nombre ="";
            }
            
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <title>Inicio Sesion</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="tituloGACET">GACET</div>
                <div class="logoGACET">
                    <img src="img/Logo.jpeg" alt="no disponible">
                </div>
            </div>
            
            
            <div class="contImagen">
                <img src="img/Usuario.jpg" alt="no disponible">
            </div>
            
            <div class="contInicioSesion">
                <form action="IniciarSesionServlet" method="post">
                    <label for="usuario">Usuario</label>
                    <input type="text" id="usuario" name="usuario" required placeholder="Escriba su usuario o alias" value="<%=nombre%>">
                    <label for="contrasenia">Contraseña</label>
                    <input type="password" id="contrasenia" name="contrasenia" required placeholder="Escriba su contraseña">
                    <input type="submit" id="iniciar" name="iniciar" value="Iniciar">
                    
                </form>
            </div>
            
            <a href="registrar.jsp">Registrarse</a>
            
        </div>
    </body>
</html>
