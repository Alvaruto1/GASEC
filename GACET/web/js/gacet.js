$(function (){
    var etiDivConfigVehiculo = $('#configuracionVehiculo');
    var etiBtnIngresarVehiculo = $('#ingresarVehiculo');
    var etiDivConsultas = $('#consultas');
    var etiBtnConsultas = $('#consultasBtn');
    var etiDivMostrarmapa = $('#mapa');
    var etiBtnMostramapa = $('#mostrarMapa');
    var etiDivImagen = $('#imagenLogo');
    etiDivConfigVehiculo.attr("class","ocultar");
    
    
    etiBtnIngresarVehiculo.click(function (e) {

        etiDivConfigVehiculo.attr("class","mostrar");
        etiDivConsultas.attr("class","ocultar");
        etiDivMostrarmapa.attr("class","ocultar"); 
        etiDivImagen.attr("class","ocultar");   

    });
    
    etiBtnConsultas.click(function (e) {
        
        etiDivConfigVehiculo.attr("class","ocultar");
        etiDivConsultas.attr("class","mostrar");
        etiDivMostrarmapa.attr("class","ocultar");
        etiDivImagen.attr("class","ocultar");  
        
    });
    
    etiBtnMostramapa.click(function (e) {
        etiDivConfigVehiculo.attr("class","ocultar");
        etiDivConsultas.attr("class","ocultar");
        etiDivMostrarmapa.attr("class","mostrar"); 
        etiDivImagen.attr("class","ocultar");  
                        
    });
    
    var etiSelectVehiculo = $('#vehiculo');
    var etiH2Combustible = $('#combustible');
    var etiH2Aceite = $('#aceite');
    var etiH2AceiteCara = $('#caracteristica');
    var etiAIngresarVehiculo = $('#ingresarVehiculo');
    var etiH2VehiculoTipo = $('#vehiculoTipo');
    etiSelectVehiculo.change(function (e) {
        e.preventDefault();

        $.post("GACETServlet",{posVehiActual:etiSelectVehiculo.val()},
            function (data) {  
                    
                var ob = jQuery.parseJSON(data);
                
                etiH2Combustible.text(ob.combustible);                
                etiH2Aceite.text(ob.aceite);
                etiH2AceiteCara.text(ob.descripcion); 
                etiAIngresarVehiculo.text(ob.placa);
                etiH2VehiculoTipo.text(ob.tipo);
         }); 
         
        
        
    });
    
    
   
    
    
    
    
});


//        $.ajax({
//            url: "GACETServlet",
//            type: "post",
//            data: {vehiculoActual:"diidf"},
//            contentType: false,
//            processData: false,
//            success: function (data) {
//                //informacion de la respuesta del servidor
//                alert(data);
//            }
//            
//        });