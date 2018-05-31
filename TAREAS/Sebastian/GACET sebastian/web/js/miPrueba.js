$.post("pruebas1",{Latitud: latitud,Longitud: longitud},
                        function (data) {  
                    
                        var ob = jQuery.parseJSON(data);
                            latitud(ob.lat);                
                            longitud(ob.long);

                            alert(data);
});

