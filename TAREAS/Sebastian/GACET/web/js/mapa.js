/* global google */

$(function (){
    var latitud=0;
    var longitud=0;
    var i=0;
    var x, y,x1,y1, distancia=0;
    var dist = document.getElementById("distancia");
    var scr = document.getElementById("script");
    //scr.setAttribute("src","https://maps.googleapis.com/maps/api/js?key=AIzaSyBjEwUIxrePFKSEAtTlhQ5rIUg-CLnWTIA&callback=mapa");
    var map;
    var marcador;
    var etiLatitud = $('#posX');
    var etiLongitud = $('#posY');
    var etiBtnIniciar = $('#inicio');
    var etiBtnParar = $('#detener');
    var estadoHilo = false;
    
    etiBtnIniciar.click(function (e) {
        estadoHilo = true;                    
    });
    
    etiBtnParar.click(function (e) {
        estadoHilo = false;                    
    });
    
    
///////////////////////////////////Funcion Geolocalizacion y Mapa

// funcion error geolocalizacion
function errorMapa(error) {
    switch (error.code){
        case error.TIMEOUT:
            alert("El servidor se demora al ubicarlo");
            break;
        case error.PERMISSION_DENIED:
            alert("Usuario denego la geolocalizacion");
            break;
        case error.UNKNOWN_ERROR:
            alert("Error desconocido");
            break; 
        case error.POSITION_UNAVAILABLE:
            alert("La localizacion no es posible");
            break;
    }    
}

// funcion geolocalizar
function geolocalizacion(posicion){
    i = i + 0.0001;
    latitud = posicion.coords.latitude;
    longitud = posicion.coords.longitude;
    if(latitud!=0 && longitud!=0){
        x1=latitud;
        y1=longitud;
    }
    var myLatlon = new google.maps.LatLng(latitud+i,longitud+i); 
    if(marcador != null){        
        marcador.setPosition(myLatlon);
        map.setCenter(myLatlon);
        longitud.setAttribute("value",lon+i);
        latitud.setAttribute("value",lat+i);
    }
}

//// funcion mapa
//function mapa(){  
//    
//    mapaPropiedades={
//        center: new google.maps.LatLng(latitud,longitud),
//        zoom:10
//    };
//    marcador = new google.maps.Marker({
//        position: mapaPropiedades.center,
//        animation: google.maps.Animation.BOUNCE
//    });
//    map = new google.maps.Map(document.getElementById("mapa"),mapaPropiedades);
//    marcador.setMap(map);
//}

//calculo de distacnia entre dos puntos
function calculoDistancia(){
    if(estadoHilo){
        if(latitud!=0 && longitud!=0){
            distancia+= Math.sqrt(Math.pow(latitud+i-x1,2)+Math.pow(longitud+i-y1,2));     
            x1=latitud+i;
            y1=longitud+i;  
            dist.innerHTML=distancia;
        }
        
    }
     
}

navigator.geolocation.watchPosition(geolocalizacion,errorMapa, {timeout: 20000});

// segundo hilo de ejecucion

setInterval(calculoDistancia,2000);
setInterval(pasoDatos,2000);



    
    
    
function pasoDatos (e){
    if(estadoHilo){
        $.post("MapaServlet",{lat:latitud+i,lon:longitud+i,kilometros:distancia},
            function (data) {
                etiLatitud.text(latitud+i);
                etiLongitud.text(longitud+i);

        });        
    }

 }       
                
    
        
});
        
    
        
    
 


