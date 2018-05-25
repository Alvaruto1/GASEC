<%-- 
    Document   : gacet
    Created on : 24/05/2018, 07:04:32 PM
    Author     : alvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>GACET</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="tituloGACET">GACET</div>
                <div class="logoGACET">
                    <img src="img/logos/logo.png" alt="no disponible">
                </div>
            </div>
            
            <div class="menuNavegcacion">
                    <ul>
                        <li><a href="#somos">¿Quienes somos?</a></li>                        
                        <li><a href="">PlacaVehiculo Actual</a></li>
                        <li><a href="modificarCuenta.jsp">Nombre Usuario</a></li>
                        <li><a href="">Cerrar Sesion</a></li>
                    </ul>

                </div>
            
            <div class="controlContenido">              

                <div class="contenido">

                </div>   
                
                <div class="menuContenido">
                    
                    <div>
                        <form action="GACETServlet">
                            <input type="hidden" value="0"> 
                            <input type="submit" value="Mostrar Ubicacion" class="btnContenido">
                        </form>
                        
                        <div class="texto">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>
                        
                    </div>
                    
                    <div>
                        <form action="GACETServlet">
                            <input type="hidden" value="1"> 
                            <input type="submit" value="Consultas" class="btnContenido">
                        </form>
                        
                        <div class="texto">Esta opcion muestra las fechas del SOAT, mantenimiento y el aceite</div>
                        
                    </div>
                    

                </div>
                
                <div class="recorrido">
                    
                    <div class="titulo">Recorrido</div>
                    <form action="GACETServlet">
                        <input type="hidden" value="2"> 
                        <input type="submit" value="Iniciar" class="btnContenido">
                    </form>

                    <form action="GACETServlet">
                        <input type="hidden" value="3"> 
                        <input type="submit" value="Detenerse" class="btnContenido">
                    </form>
                    
                    <form action="GACETServlet">
                        <input type="hidden" value="4"> 
                        <input type="submit" value="Reiniciar" class="btnContenido">
                    </form>
                                        
                </div>
                
                
                
            </div>
            
            
            
            
                         
        </div> 
        
        <div id="somos">Quienes Somos</div>
    </body>
</html>
