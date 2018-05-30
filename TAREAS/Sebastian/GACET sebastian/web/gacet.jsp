<%-- 
    Document   : gacet
    Created on : 24/05/2018, 07:04:32 PM
    Author     : alvar
--%>

<%@page import="Logica.Usuario.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Usuario usuario= new Usuario();
           
            int id= 0;
            if(request.getSession().getAttribute("id")!=null){
                id=Integer.parseInt(request.getSession().getAttribute("id").toString());
            }
            if(request.getSession().getAttribute("usuario")!=null){
                usuario = (Usuario) request.getSession().getAttribute("usuario");  
                
            }
            else{
                response.sendRedirect("iniciarSesion.jsp");
            }
            
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/flexboxgrid.min.css">
        <link rel="stylesheet" type="text/css" href="css/cssGacet.css">
        <title>GACET</title>
    </head>
    <body>

        <div class="contPrincipal">
        <header class="logo-menu">
            <div class="container">
                <div class="row middle-xs between-xs">

                        <div class="logo"><h2>Gacet</h2></div>
                        <nav class="menu">
                            <a href="#somos">¿Quienes somos?</a>                      
                                    <a href="#">
                                        <form action="GACETServlet" method="post">
                                            <input type="hidden" value="5" id="caso" name="caso">
                                            <input type="submit" value="<%
                                                if(usuario.getVehiculo().size()>0){
                                                    out.println(usuario.getVehiculo().get(0).getPlaca());
                                                }
                                                else{
                                                    out.println("Ingresar Vehiculo");
                                                }                                                
                                            %>">                                
                                        </form>
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
                    <%
                        if(request.getSession().getAttribute("contenido")!=null){
                            out.print(request.getSession().getAttribute("contenido"));
                        }
                        else{
                            out.print("<img src='mapa.jpg'>");
                        }
                        
                        
                    %> 
                </div>  

            </div>

           

            <div class="col-xs">
                <div class="menuContenido">
                    <div>
                    </br>
                        <form action="GACETServlet">
                            <input type="hidden" value="0" id="caso" name="caso"> 
                            <input type="submit" value="Mostrar Ubicacion" class="btnContenido">
                        </form>
                    </br>    
                        
                    <div class="texto">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>
                        
                    </div>
                    </br>
                    
                    <div>
                        <form action="GACETServlet">
                            <input type="hidden" value="1" id="caso" name="caso"> 
                            <input type="submit" value="Consultas" class="btnContenido">
                        </form>
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
      <script type="text/javascript" src="js/configuracionVehiculo.js"></script>  
    </body>
</html>
