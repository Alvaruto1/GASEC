var lat = 0;
var lon = 0;
var map;
var marcador;

var longitud = document.getElementById("loni");
var latitud = document.getElementById("lati");
var x, y,x1,y1, distancia=0;

var dist = document.getElementById("distancia");

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
//var scr = document.createElement("script");
//scr.setAttribute("src","https://maps.googleapis.com/maps/api/js?key=AIzaSyCkWhUkMcgBavmHsDsm9_aCseh0Y8LSdWw&callback=miMapa");
//document.body.appendChild(scr);
var scr = document.getElementById("escript");
scr.setAttribute("src","https://maps.googleapis.com/maps/api/js?key=AIzaSyCkWhUkMcgBavmHsDsm9_aCseh0Y8LSdWw&callback=mapa");
var i=0;

function geolocalizacion(posicion){
    i = i + 0.0001;
    lat = posicion.coords.latitude;
    lon = posicion.coords.longitude;
    
    if(lat!=0 && lon!=0){
        x1=lat;
        y1=lon;
    }
    
    
    var myLatlon = new google.maps.LatLng(lat+i,lon+i); 
    if(marcador != null){        
        marcador.setPosition(myLatlon);
        map.setCenter(myLatlon);
        longitud.setAttribute("value",lon+i);
        latitud.setAttribute("value",lat+i);
    }
    
    
    
}

if(navigator.geolocation){
    navigator.geolocation.watchPosition(geolocalizacion,errorMapa, {timeout: 20000});  
    
}
else{
    alert("algo anda mala");
}

function mapa(){  
    
    mapaPropiedades={
        center: new google.maps.LatLng(lat,lon),
        zoom:10
    };
    marcador = new google.maps.Marker({
        position: mapaPropiedades.center,
        animation: google.maps.Animation.BOUNCE
    });
    map = new google.maps.Map(document.getElementById("mapa"),mapaPropiedades);
    marcador.setMap(map);
                    
                    
                
};

//calculo de distacnia entre dos puntos
function calculoDistancia(){
    
    if(lat!=0 && lon!=0){
        distancia+= Math.sqrt(Math.pow(lat+i-x1,2)+Math.pow(lon+i-y1,2));     
        x1=lat+i;
        y1=lon+i;  
        dist.innerHTML="Distancia "+distancia;
    }
                
    
                
        
    
    
       
}

// segundo hilo de ejecucion
setInterval(calculoDistancia,2000);    

// ajax enviar datos al servidor sin tener que re3carga pagina
$("#aceptar").click(function(e){
    e.preventDefault();
    
    var data = new FormData($("#formula")[0]);
    
    $.ajax({
        url: "servlet",
        type: 'post',
        data: data,
        contentType: false,
        processData: false
        
    });
    
});


