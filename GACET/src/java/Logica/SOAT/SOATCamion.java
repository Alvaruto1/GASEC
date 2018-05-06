package Logica.SOAT;


import Logica.Vehiculo.Vehiculo;
import java.util.*;

/**
 * Clase en donde se trabajará especificamente el SOAT del Camión
 */
public class SOATCamion extends SOAT {

    /**
     * Default constructor
     */
    public SOATCamion() {
    }
    
    @Override
    /**
     * Método para calcular el precio del SOAT de los camiones
     */
    public void calcularPrecio(Vehiculo vehiculo){
        
        if(vehiculo.getTipo().equalsIgnoreCase("camion") && vehiculo.getCilindraje()<5){
            this.precio = salarioMinimo*15.21;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("camion") && 
                vehiculo.getCilindraje()>5 && vehiculo.getCilindraje()<15){
            this.precio = salarioMinimo*21.98;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("camion") && vehiculo.getCilindraje()>15){
            this.precio = salarioMinimo*27.80;
        }
        
    }

}