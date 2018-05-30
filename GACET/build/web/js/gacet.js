$(function (){
    var etiDivConfigVehiculo = $('#configuracionVehiculo');
    var etiBtnIngresarVehiculo = $('#ingresarVehiculo');
    var etiDivConsultas = $('#consultas');
    var etiBtnConsultas = $('#consultasBtn');
    var etiDivMostrarmapa = $('#mapa');
    var etiBtnMostramapa = $('#mostrarMapa');
    etiDivConfigVehiculo.attr("class","ocultar");
    
    etiBtnIngresarVehiculo.click(function (e) {
        etiDivConfigVehiculo.attr("class","mostrar");
        etiDivConsultas.attr("class","ocultar");
        etiDivMostrarmapa.attr("class","ocultar");        
        
    });
    
    etiBtnConsultas.click(function (e) {
        etiDivConfigVehiculo.attr("class","ocultar");
        etiDivConsultas.attr("class","mostrar");
        etiDivMostrarmapa.attr("class","ocultar");        
        
    });
    
    etiBtnMostramapa.click(function (e) {
        etiDivConfigVehiculo.attr("class","ocultar");
        etiDivConsultas.attr("class","ocultar");
        etiDivMostrarmapa.attr("class","mostrar");        
        
    });
    
    var etiSelectVehiculo = $('#vehiculo');
    
    etiSelectVehiculo.change(function (e) {
        e.preventDefault();
        $.ajax({
            url: "GACETServlet",
            type: "get",
            data: {vehiculoActual:"diidf"},
            contentType: false,
            processData: false,
            success: function (data) {
                //informacion de la respuesta del servidor
                alert(data);
            }
            
        });
            
        
        
    });
    
    
    
    
    
    
    
});


