<%-- 
    Document   : Prueba
    Created on : 30-may-2018, 0:14:51
    Author     : Sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
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
 
      data-zoom="14" role="map" class="gmaps">

 
      <!-- items de ubicaciones -->

          <div
          data-id="1"
          data-lat="-20.363"
          data-lng="111.044"
          class="marker">
          <div class="map-card">
          <h1>This is my title 1</h1>
          <p>Address: Fake street, #445, Stgo.</p>
          <p>Phone: +56753223344</p>
          <p>e-Mail: fake1@email.com</p>
          </div>
          </div>
           
          
 
      </div>

    </form>

    <script>
      $(document).ready(function () {
      $('.gmaps').gmaps();
      });
    </script>
    https://www.youtube.com/watch?v=fG-6QaQJ8vs

    
    

  </body>
</html>
