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
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <link rel="stylesheet" type="text/css" href="css/flexboxgrid.min.css">

        <title>Registrar</title>
    </head>
    <body>
        <div class="container">

            <header class="row">
            <div class="col-xs-12">
                <div class="logoGACET">
                    <img src="img/Logo.jpeg" alt="no disponible">
                </div>
            </div>
            </header>


            
            <div class="row">

                <div class="col-xs-12">
                    <h1 class="titulo"> Registro </h1>
                </div>

            </div>    
            <form class="contForm" action="RegistrarServlet" method="post">

                    <div class="row">

                        <div class="col-xs-4">
                        <label for="nombre">Nombre:</label>
                        </div>

                        <div class="col-xs-8">
                        <input type="text" id="nombre" name="nombre" required pattern="[a-zA-Z]{4,16}" title="letras de 4 a 16 caracteres" placeholder="Escriba su nombre">
                        </div>
                    </div>
                    
                     <div class="row">

                        <div class="col-xs-4">
                        <label for="alias">Alias:</label>
                        </div>

                        <div class="col-xs-8">
                        <input type="text" id="alias" name="alias" required pattern="[a-zA-Z0-9]{4,16}" title="alfanumerico de 4 a 16 caracteres"placeholder="Escriba un usuario">
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-xs-4">
                        <label for="edad">Edad:</label>
                        </div>

                        <div class="col-xs-8">
                        <input type="number" id="edad" name="edad" required pattern="[0-9]{0,3}" placeholder="Escriba su edad">
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-xs-4">
                        <label for="correo">Correo:</label>
                        </div>

                        <div class="col-xs-8">
                        <input type="email" id="correo" name="correo" required placeholder="Escriba su correo">
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-xs-4">
                        <label for="contrasenia">Contraseña</label>
                        </div>

                        <div class="col-xs-8">
                        <input type="password" id="contrasenia" name="contrasenia" required placeholder="Escriba una contraseña">
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-xs-12">
                        <input type="submit" id="registrar" name="registrar" value="Registrar">
                        </div>

                    </div>

                </form>

    </body>
</html>
