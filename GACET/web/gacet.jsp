<%-- 
    Document   : gacet
    Created on : 24/05/2018, 07:04:32 PM
    Author     : alvar
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Logica.Vehiculo.Vehiculo"%>
<%@page import="Logica.Usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Usuario usuario= new Usuario();
            ArrayList<Vehiculo> vehiculos = null;
            Vehiculo vehiculoActual = null;
            boolean estado = true;
            int id= 0;
            if(request.getSession().getAttribute("id")!=null){
                id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                
            }
            if(request.getSession().getAttribute("usuario")!=null){
                usuario = (Usuario) request.getSession().getAttribute("usuario");  
                vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
                vehiculoActual = (Vehiculo) request.getSession().getAttribute("vehiculoActual");
            }
            else{
                response.sendRedirect("iniciarSesion.jsp");
                estado=false;
            }
            
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/flexboxgrid.min.css">
        <link rel="stylesheet" type="text/css" href="css/cssGacet.css">
        <link rel="stylesheet" href="css/gacetOcultar.css"/>
        <script src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/gacet.js"></script> 
        <title>GACET</title>
    </head>
    <body>

        <div class="contPrincipal">
        <header class="logo-menu">
            <div class="container">
                <div class="row middle-xs between-xs">

                        <div class="logo"><h2>Gacet</h2></div>
                        <nav class="menu">
                            <a href="#somos" >¿Quienes somos?</a>                      
                                    <a href="#" id="ingresarVehiculo">
                                       <%
                                                if(usuario.getVehiculo().size()>0){
                                                    out.println(usuario.getVehiculo().get(0).getPlaca());
                                                }
                                                else{
                                                    out.println("Ingresar Vehiculo");
                                                }                                                
                                        %>                               
                                        
                                    </a>
                            <a href="modificarCuenta.jsp"> <%=usuario.getAlias()%> </a>
                            <a href="#">Cerrar Sesion</a>
                        </nav>
                </div>
            </div>
        </header>
        </br>
        </br>




        <div class="row">

            <div class="col-xs-1">

                <div class="contenid"></div>  

            </div>

            <div class="col-xs">

                <div class="contenido"> 
                    
 <!--Configuracion vehiculo_________________________________________________________________________________________________-->                   

 <div id="configuracionVehiculo" name="configuracionVehiculo" class="ocultar">
     <div class="contLogo">
         
            <div class="contTitulo">
                <h1 class="titulo">Configuracion vehiculo</h1>
            </div>
            
            <div class="listaVheiculos">
                <select id="vehiculo" name="vehiculo">
                    <%
                        if(estado){
                            for(int i=0; i< vehiculos.size(); i++){
                                if(i==0){
                                    out.println("<option value="+(i)+" selected=true>"+vehiculos.get(i).getPlaca()+"</option>");                            
                                }
                                else{
                                    out.println("<option value="+(i)+">"+vehiculos.get(i).getPlaca()+"</option>");                            
                                }

                            }
                            
                        }
                        
                    %>
                                        
                </select>
            </div>
                    
            <div>Caracteristicas Vehiculo:</div>
            
            <div><h2>Combustible</h2> <h2 id="combustible"><%if(estado){
                out.println(vehiculos.get(0).getCombustible().get(0).getTipo());}%></h2></div>
            <div>
                <h2>Aceite: </h2> <h2 id="aceite"><%if(estado){out.println(vehiculos.get(0).getAceite().getMarca());}%></h2>
                <h2>Caracteristica: </h2> <h2 id="caracteristica"><%if(estado){out.println(vehiculos.get(0).getAceite().getCaracteristica());}%></h2>
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
 </div>    

<!--Consultas_________________________________________________________________________________________________-->                   
<div id="consultas" name="consultas" class="ocultar">          
       <div class="contPrincipal">
            
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
                  
</div>
<!--Mostrar mapa_________________________________________________________________________________________________-->                   
<div id="mapa" name="mapa" class="ocultar">          
                    
       mapa           
</div>

            <div class="col-xs">
                <div class="menuContenido">
                    <div>
                    </br>
                    <a href="#" id="mostrarMapa">Mostrar Ubicacion</a>
                        
                    <div class="texto">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>
                        
                    </div>
                    </br>
                    
                    <div>
                        <a href="#" id="consultasBtn">Consultas</a>
                    </br>    

                    <div class="texto">Esta opcion muestra las fechas del SOAT, mantenimiento y el aceite</div>
                        
                    </div>
                    </br>
                </div>
            </div>
            <div class="col-xs-1">
            </div>

        </div> 
        </br>
        </br>    

        <hr color="#21618C" size=7>

        <div class="row">



            <div class="col-xs-1">
            </div>    


            <div class="col-xs">

                
                <div class="titulo">Recorrido</div>
                
            </div> 
            
            <div class="col-xs-1">
                
            </div> 
            <div class="col-xs">
                <form action="GACETServlet">
                    <input type="hidden" value="2" id="caso" name="caso"> 
                    <input type="submit" value="Iniciar" class="btnContenido">
                </form>
            </div>
            <div class="col-xs-1">
                
            </div>
            <div class="col-xs">
                <form action="GACETServlet">
                    <input type="hidden" value="3" id="caso" name="caso"> 
                    <input type="submit" value="Detenerse" class="btnContenido">
                </form>
            </div>
            <div class="col-xs-1">
                
            </div>
            <div class="col-xs" >
                <form action="GACETServlet">
                    <input type="hidden" value="4" id="caso" name="caso"> 
                    <input type="submit" value="Reiniciar" class="btnContenido">
                </form>
            </div>
            <div class="col-xs-3">
                
            </div>

        </div>

        
        

        <div class="row">  
            <div class="col-xs">
             

            


           

            </div>  
        </div> 
       </div>
            
    </div>
        </div>
        </div>
            
            
    </body>
</html>
