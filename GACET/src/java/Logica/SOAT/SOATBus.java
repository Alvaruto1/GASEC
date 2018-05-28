package Logica.SOAT;

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
    public void calcularPrecio(String tipo, int cilindraje){
        
        
        if(tipo.equalsIgnoreCase("bus") && 
                getTipoDeServicio()==PUBLICO){
            setPrecio(getSalarioMinimo()*22.72);
        }
        else if(tipo.equalsIgnoreCase("bus") &&
                getTipoDeServicio()==PARTICULAR){
            setPrecio(getSalarioMinimo()*18.28);
        }
        
    }

}