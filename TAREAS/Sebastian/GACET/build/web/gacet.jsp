<%-- 
    Document   : gacet
    Created on : 24/05/2018, 07:04:32 PM
    Author     : alvar
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.GregorianCalendar"%>
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
            boolean estadoV =true;
            int id= 0;
            // verificar id de usuario no null
            if(request.getSession().getAttribute("id")!=null){
                id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                
            }
            
            // verificar usuario no null
            if(request.getSession().getAttribute("usuario")!=null){
                usuario = (Usuario) request.getSession().getAttribute("usuario");  
                    //verificar vehiculos usuario no vacio
                if(((Usuario) request.getSession().getAttribute("usuario")).getVehiculo().size()>0){
                    vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
                    // verificar vehiculo actual no null
                    if(request.getSession().getAttribute("vehiculoActual")!=null){
                        vehiculoActual = (Vehiculo) request.getSession().getAttribute("vehiculoActual");
                        estado=true;
                        estadoV=true;
                    }
                    else{
                        estadoV =false;
                        estado = false;
                        //response.sendRedirect("iniciarSesion.jsp");
                    }
                }
                else{   
                    estado=false;  
                    estadoV=false;
                }

                
            }
            else{
                estado=false;
                estadoV=false;
                response.sendRedirect("iniciarSesion.jsp");
                
            }
            
            System.out.println(vehiculoActual+"-"+estadoV);
            
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


        <header class="logo-menu">
            <div class="container">
                <div class="row middle-xs between-xs">

                        <div class="logo"><h2>Gacet</h2></div>
                        <nav class="menu">
                            <a href="#somos" >¿Quienes somos?</a>
                                    
                                    <a href="<%
                                                if(usuario.getVehiculo().size()>0){
                                                    out.println("#");
                                                }
                                                else{
                                                    out.println("registroVehiculo.jsp");
                                                }
                                        
                                        
                                            %>
                                       " id="ingresarVehiculo">
                                       <%
                                           if(estadoV){
                                               if(usuario.getVehiculo().size()>0){
                                                    out.println(vehiculoActual.getPlaca());
                                                }
                                                else{
                                                    out.println("Ingresar Vehiculo");
                                                }                                                
                                           }
                                           else{
                                               out.println("Ingresar Vehiculo");
                                           }
                                                                                               
                                        %>                               
                                        
                                    </a>
                            <a href="modificarCuenta.jsp"> <%=usuario.getAlias()%> </a>
                            
                            <a>
                                <form action="GACETServlet" method="post">
                                    <input type="hidden" value="0" id="caso" name="caso">
                                    <input type="submit" value="Cerrar Sesion" class="quitar">
                                </form>
                            </a>
                        </nav>
                </div>
            </div>
        </header>
        </br>
        </br>




        <div class="row">

            <div class="col-xs-1"></div>

            <div class="col-xs-7">

            <div class="contenido"> 
                    
 <!--Configuracion vehiculo_________________________________________________________________________________________________-->                   

 <div id="configuracionVehiculo" name="configuracionVehiculo" class="ocultar">
     <div class="contLogo">
         
            <div class="contTitulo">
                <h1 class="titulo">Configuracion vehiculo</h1>
            </div>
         
            <div class="">
            <div> Elija el vehiculo que quiera usar : </div>
            
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
            
            <div><h2>Tipo Vehiculo</h2> <h2 id="vehiculoTipo"><%if(estado){
                out.print(vehiculos.get(0).getTipo());}%></h2></div>
            
            
            <div><h2>Combustible</h2> <h2 id="combustible"><%if(estado){
                out.print(vehiculos.get(0).getCombustible().get(0).getTipo());}%></h2></div>
            <div>
                <h2>Aceite: </h2> <h2 id="aceite"><%if(estado){out.print(vehiculos.get(0).getAceite().getMarca());}%></h2>
                <h2>Caracteristica: </h2> <h2 id="caracteristica"><%if(estado){out.println(vehiculos.get(0).getAceite().getCaracteristica());}%></h2>
            </div> 
            
            <div class="row">

                                <div class="col-xs-8"></div>    
                                <div class="col-xs-1">


                                    <form action="ConfiguracionVehiculoServlet" method="post">
                                        <input type="hidden" value="0" name="opcion">
                                        <input type="hidden" value="0" name="idVehiculo" id="idVehiculo">
                                        <input type="submit" value="Agregar vehiculo">
                                    </form>

                                    
                                </div>
                                <div class="col-xs-1"></div>

                                <div class="col-xs-1">


                                    <form action="ConfiguracionVehiculoServlet" method="post">
                                        <input type="hidden" value="1" name="opcion">
                                        <input type="hidden" value="0" name="idVehiculo" id="idVehiculo">
                                        <input type="submit" value="Editar vehiculo">
                                    </form>  
                                    
                                    
                                </div>
                                </div>
            
        </div>
 </div>    

<!--Consultas_________________________________________________________________________________________________-->                   
<div id="consultas" name="consultas" class="ocultar">          
       <div class="contPrincipal">
            
            <form action="ActualizarDatosServlet" method="post">
                
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">CONSULTAS</h1>
                    </div>
                    
                    
                    <div class="contForm"> 
                        
                        <div class="row">
                        <div class="col-xs-1"></div>
                        <label class="col-xs-3" for="tipoVehiculo">Tipo Vehiculo:</label>                        
                        <input class="col-xs-1" type="text" disabled id="tipoVehiculo" name="tipoVehiculo" pattern="[0-9]{0-99999999}" placeholder="Escriba kilometro recorridos" 
                               value="<%
                                   if(estadoV){
                                       out.print(vehiculoActual.getTipo());
                                   }
                               %>">
                        </div>
                        
                        
                        
                        <div class="row">
                        <div class="col-xs-1"></div>
                        <label class="col-xs-3" for="fecha">Fecha de SOAT:</label>
                        <%
                            
                            Date fecha = null;
                            SimpleDateFormat formatoFecha = null;
                            if(estadoV){
                                
                                System.out.println((vehiculoActual.getSoat().getFecha()==null)+"------------------");
                                fecha = vehiculoActual.getSoat().getFecha().getTime();
                                
                                formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                            }
                            
                        %>
                        <input class="col-xs-1" type="date" disabled id="fecha" name="fecha" value="<%if(estadoV){out.print(formatoFecha.format(fecha));}%>">
                        </div>
                        
                        
                        <div class="row">
                                <div class="col-xs-1"></div>    

                               <label class="col-xs-3" for="empresa">Empresa:</label>                        
                               <input class="col-xs-1" type="text" disabled id="empresa" name="empresa" pattern="[A-Z]{4-16}" placeholder="Escriba la empresa de SOAT" 
                               value="<%if(estadoV){out.print(vehiculoActual.getSoat().getEmpresa());}%>">

                       </div>
                        
                        
                        
                        <div class="row">
                         <div class="col-xs-1"></div>    

                        <label class="col-xs-3" for="ciudad">Ciudad:</label>                        
                       <datalist id="ciudades">
                        <option value="Bogota">
                        <option value="Cali">
                         <option value="Barranquilla">
                          <option value="Medellin">
                        <option value="Ibague">
                     </datalist>
                     <input class="col-xs-1" name="ciudad" disabled id="ciudad" list="ciudades" placeholder="Escoja la ciudad " 
                                                   value="<%if(estadoV){out.print(vehiculoActual.getSoat().getCiudad());}%>">

                        </div>
                                                   
                                                   
                        
                        
                        
                        <div class="row">
                                            <div class="col-xs-1"></div>    

                                            <label class="col-xs-3" for="tipoServicio">Tipo servicio:</label>
                                            <select class="col-xs-1" disabled id="tipoServicio" name="tipoServicio" value="<%if(estadoV){out.print(vehiculoActual.getSoat().getTipoDeServicio());}%>">
                                                <option value="1">Particular</option>
                                                <option value="0">Publico</option>
                                                <option value="2">Carga</option>
                                                <option value="3">Diplomatico</option>
                                            </select>

                       </div>
                            
                            
                        <div class="row">
                        <div class="col-xs-1"></div>      
                        <div class="col-xs-3">Dias faltantes:</div>
                        <div class="col-xs-1">
                            <%
                            if(estado){
                                Date fechaActual = new Date();
                                Date fechaMante = vehiculoActual.getSoat().getFecha().getTime();
                                long segundosActual = fechaActual.getTime();
                                long segundosMante = fechaMante.getTime();
                                long totalSegundos = segundosActual-segundosMante;
                                
                                long dias = 365-(((totalSegundos/1000)/60)/60)/24;
                                out.print(dias);
                            }
                            %>
                        </div>
                        </div>
                        
                        
                    </div>    
                </div>
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Mantenimiento</h1>
                    </div>
                    
                    
                    <%
                        Date fechaM = null;
                        SimpleDateFormat formatoFechaM = null;
                            if(estadoV){
                            fechaM = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                            formatoFechaM = new SimpleDateFormat("yyyy-MM-dd");
                            }
                        %>
                        
                        <div class="contForm">
                            
                        <div class="row">   
                            <div class="col-xs-1"></div>
                        
                            <label class="col-xs-3" for="fecha">Fecha ultimo mantenimiento:</label>
                            <input class="col-xs-1" disabled type="date" id="fecha" name="fecha" 
                               value="<%if(estadoV){out.print(formatoFechaM.format(fechaM));}%>">
                        
                        </div>
                               
                        <div class="row">   
                        <div class="col-xs-1"></div>
                        
                        <div class="col-xs-3">Dias faltantes:</div>
                        <div class="col-xs-1"><%
                            if(estado){
                                Date fechaActual = new Date();
                                Date fechaMante = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                                long segundosActual = fechaActual.getTime();
                                long segundosMante = fechaMante.getTime();
                                long totalSegundos = segundosActual-segundosMante;
                                
                                long dias = 365-(((totalSegundos/1000)/60)/60)/24;
                                out.print(dias);
                            }
                            %>
                        </div>     
                        
                        </div>       
                        
                        
                                                                     
                    </div>
                        
                </div>
                    
                
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Aceite</h1>
                    </div>
                    <div class="contForm">
                        
                        <div class="row"> 
                        <div class="col-xs-1"></div>    
                        <label class="col-xs-3" for="kmRecorridos">Kilometros recorridos:</label>                        
                        <input class="col-xs-1" type="text" disabled id="empresa" name="empresa" pattern="[0-9]{0-99999999}" placeholder="Escriba kilometro recorridos" 
                               value="<%
                                   if(estadoV){
                                       out.print(vehiculoActual.getKmRecorrido());
                                   }
                               %>">
                        </div>
                        
                        
                    </div>
                        
                </div>                
                
                
                
            </form>
        </div>             
                  
</div>
<!--Mostrar mapa_________________________________________________________________________________________________-->
                  
<div id="mapa" name="mapa" class="ocultar">          
    <div class="contPrincipal">         
        <div id="mapa" name="mapa"> 
            <div>
                <a href="Prueba.jsp">Ir al mapa</a>                
            </div>
        </div>
    </div>
    <script id="script" name="script"></script>
    <script type="text/javascript" src="js/mapa.js"></script>                     
                 
</div>
<!--Mostrar mapa final_________________________________________________________________________________________________-->                   



</div> 
</div> 

            <div class="col-xs-3">
                <div class="menuContenido">
                    <div>
                    </br>

                    <center>
                        <a href="#" id="mostrarMapa" class="personalizar">Mostrar Ubicacion</a>

                    </center>
                    
                    
                    </br>   
                    </br>   
                    
                        
                    <div class="texto">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>
                        
                    </div>
                    </br>
                    
                    <div>
                        <center>
                            
                          <a href="#" id="consultasBtn" class="personalizar">Consultas</a>  
                        </center>
                        
                    </br>       
                    </br>    

                    <div class="texto">Esta opcion muestra las fechas del SOAT, mantenimiento y el aceite</div>
                        
                    </div>
                    </br>
                </div>
                <br>
                <br>
                <div class="ubicacion">
                    <center>
                    <div class="row">
                          
                        <h2>Latitud: </h2>
                        <div id="posX" name="posX">0.0</div>
                    </div>

                    <div class="row">
                       
                        <h2>Longitud: </h2>
                        <div id="posY" name="posY">0.0</div>  
                    </div>

                    <div class="row">
                           
                        <h2>Distancia: </h2>
                        <div id="distancia" name="distancia">0.0</div>
                    </div>
                    


                    


                    </center>                   
                </div> 
            </div>

        </div> 
        
           

        <hr color="#21618C" size="10">

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
                    <input type="button" value="Iniciar" class="btnContenido" id="inicio">
                </form>
            </div>
            <div class="col-xs-1">
                
            </div>
            <div class="col-xs">
                <form action="GACETServlet">
                    <input type="hidden" value="3" id="caso" name="caso"> 
                    <input type="button" value="Detenerse" class="btnContenido" id="detener">
                </form>
            </div>
            <div class="col-xs-1">
                
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
                      
    </body>
</html>
