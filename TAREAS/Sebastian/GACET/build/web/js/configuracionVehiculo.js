$(function (){
    
    $('#vehiculo').change(function (e){
        var vehiculoSeleccion = $('#vehiculo').val();
        var etiAceite = $('#aceite');
        var etiCaracte = $('#caracteristica');
        var etiCombus = $('#combustible');
        var etiInputIdVehiculo = $('#idVehiculo');
        etiAceite.text('<%=vehiculos.get('+vehiculoSeleccion+').getAceite().getMarca()%>');
        etiCaracte.text('<%=vehiculos.get('+vehiculoSeleccion+').getAceite().getCaracteristica()%>');
        etiCombus.text('<%=vehiculos.get('+vehiculoSeleccion+').getCombustible().get(0).getTipo()%>');
        etiInputIdVehiculo.val(vehiculoSeleccion);
    });
    
    
      
    
});

