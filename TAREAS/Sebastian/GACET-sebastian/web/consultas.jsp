<%-- 
    Document   : consultas
    Created on : 25/05/2018, 01:34:31 PM
    Author     : alvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>Consultas</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="tituloGACET">GACET</div>
                <div class="logoGACET">
                    <img src="img/logos/logo.png" alt="no disponible">
                </div>
            </div>
            <form action="RegistrarVehiculoServlet" method="post">
                
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">CONSULTAS</h1>
                    </div>      
                    <div class="contForm">    
                        <label for="fecha">Fecha de SOAT:</label>
                        <input type="date" id="fecha" name="fecha">
                        <label for="empresa">Empresa:</label>                        
                        <input type="text" id="empresa" name="empresa" pattern="[A-Z]{4-16}" placeholder="Escriba la empresa de SOAT">
                        <label for="ciudad">Ciudad:</label>                        
                        <datalist id="ciudades">
                            <option value="Bogota">
                            <option value="Cali">
                            <option value="Barranquilla">
                            <option value="Medellin">
                            <option value="Ibague">
                        </datalist>
                        <input name="ciudad" id="ciudad" list="ciudades" placeholder="Escoja la ciudad">
                        <label for="tipoServicio">Tipo servicio:</label>
                        <select id="tipoServicio" name="tipoServicio">
                            <option value="particular">Particular</option>
                            <option value="publico">Publico</option>
                            <option value="carga">Carga</option>
                            <option value="diplomatico">Diplomatico</option>
                        </select>
                        <div>Dias faltantes:</div>
                        <div>125</div>
                    </div>    
                </div>
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Mantenimiento</h1>
                    </div>
                    <div class="contForm">
                        <label for="fecha">Fecha ultimo mantenimiento:</label>
                        <input type="date" id="fecha" name="fecha">
                        <div>Dias faltantes:</div>
                        <div>45</div>                                                
                    </div>
                        
                </div>
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Aceite</h1>
                    </div>
                    <div class="contForm">
                        <label for="kmRecorridos">Kilometros recorridos:</label>                        
                        <input type="text" id="empresa" name="empresa" pattern="[0-9]{0-99999999}" placeholder="Escriba kilometro recorridos">
                        
                        
                    </div>
                        
                </div>                
                
                
                <input type="submit" id="registrar" name="registrar" value="Registrar">
            </form>
        </div>
    </body>
</html>
