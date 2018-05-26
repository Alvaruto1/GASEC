<%-- 
    Document   : modificarCuenta
    Created on : 25/05/2018, 12:07:20 PM
    Author     : alvar
--%>

<%@page import="Logica.Usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Usuario usuario= new Usuario();
            int id= Integer.parseInt(request.getSession().getAttribute("id").toString());
            usuario = (Usuario) request.getSession().getAttribute("usuario");
            
            
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>Cuenta</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="logoGACET">
                    <img src="img/logos/logo.png" alt="no disponible">
                </div>
            </div>
            
            
            
            <div class="contPanel">
                <div class="contTitulo">
                    <h1 class="titulo">Modificar Cuenta</h1>
                </div>
                
                <form class="contForm" action="ModificarCuentaServlet" method="post">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" required pattern="[a-zA-Z]{4,16}" title="letras de 4 a 16 caracteres" placeholder="Escriba su nombre" value="<%=usuario.getNombre()%>">                    
                    <label for="correo">Correo:</label>
                    <input type="email" id="correo" name="correo" required placeholder="Escriba su correo" value="<%=usuario.getEmail()%>">
                    <label for="contrasenia">Contraseña</label>
                    <input type="password" id="contrasenia" name="contrasenia" required placeholder="Escriba una contraseña" value="<%=usuario.getContrasenia()%>">
                    <input type="submit" id="guardar" name="guardar" value="Guardar">
                </form>
            </div>            
        </div>
    </body>
</html>
