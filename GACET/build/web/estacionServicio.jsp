<%-- 
    Document   : estacionServicio
    Created on : 25/05/2018, 12:20:25 PM
    Author     : alvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>Estacion</title>
    </head>
    <body>
        <div class="contPrincipal">          
                                    
            <form action="EstacionServlet" method="post">
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Estacion + 1</h1>
                    </div>
                    

                    <div class="contForm">
                        <div class="fila">Direccion</div>
                        <div class="fila">Marca: Terpel</div>
                        <div class=""fila>
                            <div>Calificacion:</div>
                            <div class="">
                                <input type="radio" name="calificacion" id="calificacion" value="1">1
                                <input type="radio" name="calificacion" id="calificacion" value="2">2
                                <input type="radio" name="calificacion" id="calificacion" value="3">3
                                <input type="radio" name="calificacion" id="calificacion" value="4">4
                                <input type="radio" name="calificacion" id="calificacion" value="5">5
                            </div>    
                        </div>
                    </div>
                    <div class="contTitulo">
                        <h1 class="titulo">Comentarios</h1>
                    </div>
                    <div class="contComentarios">

                        <!--se repite las veces coemntadas-->
                        <div class="comentario">
                            <div class="usuario">Nombre Usuario</div>
                            <div class="comentario">El comentario es</div>
                            <div class="calificacion">5</div>
                        </div>


                    </div>

                    <div class="agregarComentario">
                        <div class="titulo">Comentario</div>
                        <div>

                                <textarea id="comentario" name="comentario" required></textarea>
                                <input type="submit" id="enviar" name="enviar" value="Enviar">

                        </div>
                    </div>
                </div>
            </form>                            
        </div>
    </body>
</html>
