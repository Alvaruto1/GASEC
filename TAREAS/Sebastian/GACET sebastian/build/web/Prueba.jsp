<%-- 
    Document   : Prueba
    Created on : 30-may-2018, 0:14:51
    Author     : Sebas
--%>

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
             
              
              int id;
              DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", ""); 
              DatosEstacion datosEstacion = new DatosEstacion("gacet", "root", "");
              ResultSet rS = datosUbicacion.MostrarTabla();
              
              double lat= Double.parseDouble(request.getSession().getAttribute("Latitud").toString());
              double lon= Double.parseDouble(request.getSession().getAttribute("Longitud").toString());
              
              while(rS.next()){
                  
              id= rS.getInt("id_Ubicacion");
              
              ResultSet datos = datosEstacion.sacarEstacion(id);
              
              
              
          %>
      
          
          <div
          data-id="<%= rS.getInt("id_Ubicacion")%>"
          data-lat="<%= rS.getDouble("Latitud")%>"
          data-lng="<%= rS.getDouble("Longitud")%>"
          class="marker">
          <div class="map-card">
          <p>Address: <%= rS.getString("Direccion")%></p>
          
          <% 
           while(datos.next()){
          
          %>
            <p> Marca:<%= datos.getString("Marca")%> </p>
            <p> Puestos:<%= datos.getInt("Puestos")%></p>
            <p> Valoracion:<%= datos.getInt("Valoracion")%></p>

            </div>
            </div>
          <%
              }
            }

       
          %>
    
      </div>

    </form>

    <script>
      $(document).ready(function () {
      $('.gmaps').gmaps();
      });
    </script>
    
    
    
    <script src="js/DatosMapa.js"></script>

  </body>
</html>
