package Logica.SOAT;


import Logica.Vehiculo.Vehiculo;
import java.util.*;

/**
 * Clase en donde se trabajará especificamente el SOAT del Carro
 */
public class SOATCarro extends SOAT {

    /**
     * Default constructor
     */
    public SOATCarro() {
    }
    
    @Override
    /**
     * Método para calcular el precio del SOAT de los automóviles
     */
    public void calcularPrecio(Vehiculo vehiculo){
        
        if(vehiculo.getTipo().equalsIgnoreCase("carro") && vehiculo.getCilindraje()<1500){
            this.precio = salarioMinimo*14.945;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("carro") && 
                vehiculo.getCilindraje()>1500 && vehiculo.getCilindraje()<2500){
            this.precio = salarioMinimo*17.71;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("carro") && vehiculo.getCilindraje()>2500){
            this.precio = salarioMinimo*20.425;
        }
        
    }

}