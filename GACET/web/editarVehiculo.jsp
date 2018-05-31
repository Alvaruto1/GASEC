<%-- 
    Document   : registroVehiculo
    Created on : 24/05/2018, 04:21:01 PM
    Author     : alvar
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Logica.Vehiculo.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            boolean estado;
            Vehiculo vehiculoActual = null;
            if(request.getSession().getAttribute("vehiculoActual")!=null){
                vehiculoActual = (Vehiculo)request.getSession().getAttribute("vehiculoActual");
                estado=true;
            }else{
                estado=false;
                response.sendRedirect("iniciarSesion.jsp");
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <title>Editar Vehiculo</title>
    </head>
    <body>
        <div class="contPrincipal">
            <div class="contLogo">
                <div class="tituloGACET">GACET</div>
                <div class="logoGACET">
                    <img src="img/logos/logo.png" alt="no disponible">
                </div>
            </div>
            <form action="EditarVehiculoServlet" method="post">
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Editar Vehiculo</h1>
                    </div>
                    <div class="contForm">
                        <label for="vehiculo">Tipo vehiculo:</label>
                        <select id="vehiculo" name="vehiculo">
                            <option value="1">Carro</option>
                            <option value="2">Moto</option>
                            <option value="3">Camion</option>
                            <option value="4">Bus</option>
                        </select>
                        <label for="placa">Placa:</label>
                        <input type="text" id="placa" name="placa" required pattern="[A-Z]{3}[0-9]{3}|[A-Z]{3}[0-9]{2}[A-Z]{1}" title="mayusculas ejem: LQZ94C" placeholder="Escriba la placa" 
                               value="<%if(estado){out.print(vehiculoActual.getPlaca());}%>">
                        
                        <%
                            
                            Date fecha = null;
                            SimpleDateFormat formatoFecha = null;
                            if(estado){
                                
                                
                                fecha = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                                
                                formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                            }
                            
                        %>
                        
                        <label for="fecha">Fecha ultimo mantenimiento:</label>
                        <input type="date" id="fecha" name="fecha" required value="<%if(estado){out.print(formatoFecha.format(fecha));}%>">
                        <label for="cilindraje">Cilindraje o Toneladas:</label>
                        <input type="number" id="cilindraje" name="cilindraje" value="<%if(estado){out.print(vehiculoActual.getCilindraje());}%>">                                                
                    </div>
                        
                </div>
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">SOAT</h1>
                    </div>      
                    <div class="contForm"> 
                        
                        <%
                            
                            Date fechaS = null;
                            SimpleDateFormat formatoFechaS = null;
                            if(estado){
                                
                                
                                fechaS = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                                
                                formatoFechaS = new SimpleDateFormat("yyyy-MM-dd");
                            }
                            
                        %>
                        
                        
                        
                        <label for="fecha">Fecha de SOAT:</label>
                        <input type="date" id="fechaS" name="fechaS" required value="<%if(estado){out.print(formatoFechaS.format(fechaS));}%>">
                        <label for="empresa">Empresa:</label>                        
                        <input type="text" id="empresa" name="empresa" required pattern="[A-Z]{4-16}" placeholder="Escriba la empresa de SOAT"
                               value="<%if(estado){out.print(vehiculoActual.getSoat().getEmpresa());}%>">
                        <label for="ciudad">Ciudad:</label>                        
                        <datalist id="ciudades">
                            <option value="Bogota">
                            <option value="Cali">
                            <option value="Barranquilla">
                            <option value="Medellin">
                            <option value="Ibague">
                        </datalist>
                        <input name="ciudad" id="ciudad" list="ciudades" required placeholder="Escoja la ciudad" value="<%if(estado){out.print(vehiculoActual.getSoat().getCiudad());}%>">
                        <label for="tipoServicio">Tipo servicio:</label>
                        <select id="tipoServicio" name="tipoServicio" value="<%if(estado){out.print(vehiculoActual.getSoat().getTipoDeServicio());}%>">
                            <option value="1">Particular</option>
                            <option value="0">Publico</option>
                            <option value="2">Carga</option>
                            <option value="3">Diplomatico</option>
                        </select>
                    </div>    
                </div>
                
                <div class="contPanel">
                    <div class="contForm2">
                        <div class="contTitulo">
                            <h1 class="titulo">Combustible</h1>
                        </div> 
                        <div class="contForm"> 
                            
                            <label for="tipoCombustible">Tipo combustible:</label>
                            <select id="tipoCombustible" name="tipoCombustible">">
                                <option value="1">ACPM</option>
                                <option value="2">Gasolina</option>
                                <option value="3">Gas</option>
                            </select>                            
                            
                        </div>
                        
                        <div class="contTitulo">
                            <h1 class="titulo">Aceite</h1>
                        </div> 
                        <div class="contForm"> 
                            <label for="marca">Marca aceite:</label>
                                                       
                            <label for="marca">Marca:</label>                        
                            <input type="text" id="marca" name="marca" required pattern="[A-Za-z0-9]{2-16}" placeholder="Escriba la marca" value="<%if(estado){out.print(vehiculoActual.getAceite().getMarca());}%>">
                            
                            <label for="kmMaximoAceite">Kilometraje maximo cambio aceite:</label>                        
                            <input type="number" id="kmMaximoAceite" name="kmMaximoAceite" required pattern="[0-9]{2-16}" placeholder="Escriba los kilometros" value="<%if(estado){out.print(vehiculoActual.getAceite().getKmCambioAceite());}%>">
                            
                            <label for="referenciaAceite">Referencia Aceite</label>
                            <textarea id="referenciaAceite" name="referenciaAceite" value="<%if(estado){out.print(vehiculoActual.getAceite().getCaracteristica());}%>"></textarea> 
                            
                        </div>
                        
                        
                        
                    </div>                       
                         
                </div>
                
                <input type="submit" id="actualizar" name="actualizar" value="Actualizar">
            </form>
        </div>
    </body>
</html>
