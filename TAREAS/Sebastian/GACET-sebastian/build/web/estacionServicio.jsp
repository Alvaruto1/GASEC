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
            
            
            <div class="contPanel">
                <div class="contTitulo">
                    <h1 class="titulo">Estacion</h1>
                </div>
                
                <div class="contForm">
                    <div class="fila">Estacion Fonitbon</div>
                    <div class="fila">Marca: Terpel</div>
                    <div class=""fila>
                        <div>Calificacion:</div>
                        <div class="ec-stars-wrapper">
                                <a href="#" data-value="1" title="Votar con 1 estrellas">&#9733;</a>
                                <a href="#" data-value="2" title="Votar con 2 estrellas">&#9733;</a>
                                <a href="#" data-value="3" title="Votar con 3 estrellas">&#9733;</a>
                                <a href="#" data-value="4" title="Votar con 4 estrellas">&#9733;</a>
                                <a href="#" data-value="5" title="Votar con 5 estrellas">&#9733;</a>
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
                        <div class="ec-stars-wrapper">
                                <div class="estrella">&#9733;</div>
                                <div class="estrella">&#9733;</div>
                                <div class="estrella">&#9733;</div>
                                <div class="estrella">&#9733;</div>
                                <div class="estrella">&#9733;</div>
                        </div> 
                    </div>
                    
                    
                </div>
                
                <div class="agregarComentario">
                    <div class="titulo">Comentario</div>
                    <div>
                        <form action="">
                            <textarea id="comentario" name="comentario" required></textarea>
                            <input type="submit" id="enviar" name="enviar" value="Enviar">
                        </form>
                    </div>
                </div>
            </div>            
        </div>
    </body>
</html>
