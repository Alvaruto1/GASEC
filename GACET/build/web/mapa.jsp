<%-- 
    Document   : mapa
    Created on : 31/05/2018, 04:22:29 PM
    Author     : alvar
--%>

<%@page import="Logica.Vehiculo.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery.min.js"></script>
        
        <title>Mapa</title>
    </head>
    <body>
        <div class="contPrincipal">         
            
            
            <div id="mapa" name="mapa" style="width: 100%;height: 50%">
                                                
            </div>
            
            <div><%Vehiculo vehiculo= (Vehiculo) request.getSession().getAttribute("vehiculoActual");
                out.print(vehiculo.getKmRecorrido());
                %></div>
            
            <div id="distancia" name="distancia"></div>
            
                
                           
        </div>
        
        <script id="script" name="script"></script>
        <script type="text/javascript" src="js/mapa.js"></script>
    </body>
</html>
