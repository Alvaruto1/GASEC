<%-- 
    Document   : configuaracionVehiculo
    Created on : 26/05/2018, 10:12:52 PM
    Author     : alvar
--%>

<%@page import="Logica.Vehiculo.Vehiculo"%>
<%@page import="Logica.Usuario.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ArrayList<Vehiculo> vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <title>Configuracion vehiculos</title>
    </head>
    <body>
        <div class="contLogo">
                
            <div class="contTitulo">
                <h1 class="titulo">Configuracion vehiculo</h1>
            </div>
            
            <div class="listaVheiculos">
                <select id="vehiculo" name="vehiculo">
                    <%for(int i=0; i< vehiculos.size(); i++){
                        if(i==0){
                            out.println("<option value="+(i)+" selected=true>"+vehiculos.get(i).getPlaca()+"</option>");                            
                        }
                        else{
                            out.println("<option value="+(i)+">"+vehiculos.get(i).getPlaca()+"</option>");                            
                        }
                        
                    }
                    %>
                                        
                </select>
            </div>
                    
            <div>Caracteristicas Vehiculo:</div>
            
            <div><h2>Combustible</h2> <h2 id="combustible"><%=vehiculos.get(0).getCombustible().get(0).getTipo()%></h2></div>
            <div>
                <h2>Aceite: </h2> <h2 id="aceite"><%=vehiculos.get(0).getAceite().getMarca()%></h2>
                <h2>Caracteristica: </h2> <h2 id="caracteristica"><%=vehiculos.get(0).getAceite().getCaracteristica()%></h2>
            </div> 
            
            <div>
                <form action="ConfiguracionVehiculoServlet" method="post">
                    <input type="hidden" value="0" name="opcion">
                    <input type="hidden" value="0" name="idVehiculo" id="idVehiculo">
                    <input type="submit" value="Agregar vehiculo">
                </form>
                <form action="ConfiguracionVehiculoServlet" method="post">
                    <input type="hidden" value="1" name="opcion">
                    <input type="hidden" value="0" name="idVehiculo" id="idVehiculo">
                    <input type="submit" value="Editar vehiculo">
                </form>
                <form action="ConfiguracionVehiculoServlet" method="post">
                    <input type="hidden" value="2" name="opcion">
                    <input type="hidden" value="0" name="idVehiculo" id="idVehiculo">
                    <input type="submit" value="Eliminar vehiculo">
                </form>
            </div>
            
        </div>
            <script type="text/javascript" src="js/configuracionVehiculo.js"></script>
            
    </body>
</html>
