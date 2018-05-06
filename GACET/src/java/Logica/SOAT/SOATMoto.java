package Logica.SOAT;


import Logica.Vehiculo.Vehiculo;
import java.util.*;

/**
 * Clase en donde se trabajará especificamente el SOAT de la Moto
 */
public class SOATMoto extends SOAT {

    /**
     * Default constructor
     */
    public SOATMoto() {
        
    }
    
    @Override
    /**
     * Método para calcular el precio del SOAT de las motos
     */
    public void calcularPrecio(Vehiculo vehiculo){
        
        if(vehiculo.getTipo().equalsIgnoreCase("moto") && vehiculo.getCilindraje()<100){
            this.precio = salarioMinimo*8.60;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("moto") && 
                vehiculo.getCilindraje()>100 && vehiculo.getCilindraje()<200){
            this.precio = salarioMinimo*11.55;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("moto") && vehiculo.getCilindraje()>200){
            this.precio = salarioMinimo*13.03;
        }
        
    }

}