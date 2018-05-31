/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

  var latitud;
                        var longitud;  
        
	
                        
			
			
			//Obtenemos latitud y longitud
			function localizacion(posicion){
				latitud = posicion.coords.latitude;
				longitud = posicion.coords.longitude;
				
			}
			function error(){
				output.innerHTML = "<p>No se pudo obtener tu ubicación</p>";
			}
			navigator.geolocation.getCurrentPosition(localizacion,error);
                        
                            $.post("ServletPruebaMia",{Latitud: latitud,Longitud: longitud},
                                function (data) {  



                                    alert(data);
                        });   
                        
                        
		
         
        
      
         
         
							
	
   


