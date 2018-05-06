package Logica.SOAT;


import static Logica.SOAT.SOAT.PUBLICO;
import Logica.Vehiculo.Vehiculo;
import java.util.*;

/**
 * Clase en donde se trabajará especificamente el SOAT del Bus
 */
public class SOATBus extends SOAT {

    /**
     * Default constructor
     */
    public SOATBus() {
        
    }
    
    @Override
    /**
     * Método para calcular el precio del SOAT de los buses
     */
    public void calcularPrecio(Vehiculo vehiculo){
        
        if(vehiculo.getTipo().equalsIgnoreCase("bus") && tipoDeServicio==PUBLICO){
            this.precio = salarioMinimo*22.72;
        }
        else if(vehiculo.getTipo().equalsIgnoreCase("bus") && tipoDeServicio==PARTICULAR){
            this.precio = salarioMinimo*18.28;
        }
        
    }

}