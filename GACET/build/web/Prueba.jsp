<%-- 
    Document   : Prueba
    Created on : 30-may-2018, 0:14:51
    Author     : Sebas
--%>

<%@page import="baseDeDatos.DatosUbicacionMapa"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Logica.Comentario.Comentario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="baseDeDatos.DatosComentarios"%>
<%@page import="javax.management.relation.RelationNotFoundException"%>
<%@page import="baseDeDatos.DatosEstacion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="baseDeDatos.DatosUbicacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <script src="js/jquery.min.js"></script>
  <script src="http://code.jquery.com/jquery-3.2.1.js"></script>
  <link href="css/jquery.gmaps.css" rel="stylesheet" />
  <link rel="stylesheet" href="css/comentarios.css"/>
  <script src="js/jquery.gmaps.js"></script>
  
  <style>
       
      .gmaps {
      height:500px;
      width: 100%;
      }
      </style>
  

</head>
<body>
    

    <form id="formulario" runat="server">
      
      <div data-key="AIzaSyBoDcMaMDDNmggoN7t-Y6fyr6LCGd_UPB4"
      data-control-zoom="true"
      data-control-type="true"
      data-control-scale="true"
      data-control-streetview="true"
      data-control-rotate="true"
      data-event-mousewheel="true"
 
      data-zoom="20" role="map" class="gmaps">

          
          <%   
             
              
              int idEstacion;
              DatosUbicacionMapa datosUbicacion = new DatosUbicacionMapa("gacet", "root", ""); 
              DatosEstacion datosEstacion = new DatosEstacion("gacet", "root", "");
              ResultSet rSUbicacion = datosUbicacion.MostrarTabla();
              
              
              while(rSUbicacion.next()){
                  
                  
              idEstacion= rSUbicacion.getInt("id_UbicacionMapa");
              
              ResultSet rSEstaciones = datosEstacion.sacarEstacion(idEstacion);
              
              
              
          %>
      
          
          <div
          data-id="<%= rSUbicacion.getInt("id_UbicacionMapa")%>"
          data-lat="<%= rSUbicacion.getDouble("Latitud")%>"
          data-lng="<%= rSUbicacion.getDouble("Longitud")%>"
          class="marker">
          <div class="map-card">
          <p>Address: <%= rSUbicacion.getString("Direccion")%></p>
          
          <% 
           while(rSEstaciones.next()){
          
          %>
            
<!----------------------------------------COmentario------------------------------------------------------>            
            <div class="contPrincipal">          
                                    
            <form action="EstacionServlet" method="post">
                <div class="contPanel">
                    <div class="contTitulo">
                        <h1 class="titulo">Estacion <%=idEstacion%></h1>
                        <input type="hidden" id="idEstacion" name="idEstacion" value="<%=idEstacion%>">
                    </div>
                    

                    <div class="contForm">
                        <p> Marca:<%= rSEstaciones.getString("Marca")%> </p>
                        <p> Puestos:<%= rSEstaciones.getInt("Puestos")%></p>
                        <p> Valoracion:<%= rSEstaciones.getInt("Valoracion")%></p>
                        <div class="fila">
                            <div>Calificacion:</div>
                            <div>
                                <input type="radio" name="calificacion" id="calificacion" value="1" checked="checked">1
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
                        <%  ArrayList<Comentario> comentarios;
                            DatosComentarios datosComentarios = new DatosComentarios("gacet", "root", "");
                            comentarios = datosComentarios.comentariosEstacionById(idEstacion);
                        %>
                        
                        <%
                            for(Comentario c: comentarios){
                                
                            
                        %>
                        
                       <div class="comentario">
                            <div>Id usuario: <%=c.getIdUsuario() %></div>
                            <div>Fecha:</div>
                            <%
                                Date fecha = c.getFecha();
                                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                            %>
                            <div class="fecha"><%= formato.format(fecha) %></div>
                            <div>Comentario: <%= c.getMensaje() %></div>
                            <div>Calificacion: <%= c.getCalificacion() %></div>
                        </div> 
                            
                        <%}%>


                    </div>

                    <div class="agregarComentario">
                        <div class="titulo">Comentario</div>
                        <div>

                            <input type="text" id="comentario" name="comentario" required></textarea>
                                <input type="submit" id="enviar" name="enviar" value="Enviar">

                        </div>
                    </div>
                </div>
            </form>                            
        </div>
<!--------------------------------------------------------------------------------------------------------------->
            </div>
            
            </div>
          <%
              }
            }

       
          %>
    
      </div>

    </form>
          <a href="gacet.jsp">Regresar</a>
    <script>
      $(document).ready(function () {
      $('.gmaps').gmaps();
      });
    </script>
    
    
    
    <script src="js/DatosMapa.js"></script>

  </body>
</html>
