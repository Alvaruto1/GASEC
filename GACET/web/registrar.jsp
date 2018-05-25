<%-- 
    Document   : registrar
    Created on : 24/05/2018, 03:41:24 PM
    Author     : alvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>Registrar</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="tituloGACET">GACET</div>
                <div class="logoGACET">
                    <img src="img/logos/logo.png" alt="no disponible">
                </div>
            </div>
            
            
            
            <div class="contPanel">
                <div class="contTitulo">
                    <h1 class="titulo">Registro</h1>
                </div>
                
                <form class="contForm" action="RegistrarServlet" method="post">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" required pattern="[a-zA-Z]{4,16}" title="letras de 4 a 16 caracteres" placeholder="Escriba su nombre">
                    <label for="alias">Alias:</label>
                    <input type="text" id="alias" name="alias" required pattern="[a-zA-Z0-9]{4,16}" title="alfanumerico de 4 a 16 caracteres"placeholder="Escriba un usuario">
                    <label for="edad">Edad:</label>
                    <input type="number" id="edad" name="edad" required pattern="[0-9]{0,3}" placeholder="Escriba su edad">
                    <label for="correo">Correo:</label>
                    <input type="email" id="correo" name="correo" required placeholder="Escriba su correo">
                    <label for="contrasenia">Contraseña</label>
                    <input type="password" id="contrasenia" name="contrasenia" required placeholder="Escriba una contraseña">
                    <input type="submit" id="registrar" name="registrar" value="Registrar">
                </form>
            </div>            
        </div>
    </body>
</html>
