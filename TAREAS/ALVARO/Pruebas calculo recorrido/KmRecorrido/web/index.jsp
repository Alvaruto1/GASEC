<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">        
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <%
            double latitud = 25;
            double longitud = 25;
            double km = 70;
            String t = request.getParameter("latitud");
//            if(t!=""){
//                latitud = Double.parseDouble(request.getParameter("latitud"));
//                longitud = Double.parseDouble(request.getParameter("longitud"));
//                km = Double.parseDouble(request.getParameter("km"));
//            } 
        %>        
        
        
    </head>
    <body>
        <div class="contenedorFlex">
            <header class="titulo">
                <div>
                    Mapa y kilometros recorridos
                </div>
            </header>
            <section class="contenedorMapaFlex">
                <div class="mapa" id="mapa" style="width: 100%; height: 400px"></div>                    
            </section>
            <aside>
                
                
                <form action="servlet" class="contenedorLatLonFlex" method="post" id="formula">                    
                    
                    <div>
                        <input type="submit" name="aceptar" id="aceptar" value="Enviar">
                    </div>
                    <input type="hidden" id="loni" name="loni">
                    <input type="hidden" id="lati" name="lati">
                </form>
                
                <div class="contenedorDatosFlex">
                    <div>Ultima posicion enviada</div>
                    <div>Latiud <%out.println(request.getSession().getAttribute("longi"));%></div>
                    <div>Longitud <%out.println(request.getSession().getAttribute("latid"));%></div>
                    <div id="distancia"></div>
                </div>
                
                
                
                
            </aside>
        </div>
                <script id="escript"></script>
        <script src="generadorMapa.js"></script>
    </body>
    
</html>