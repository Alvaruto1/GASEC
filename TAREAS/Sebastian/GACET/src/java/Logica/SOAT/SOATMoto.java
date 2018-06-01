package Logica.SOAT;

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
    public void calcularPrecio(String tipo, int cilindraje){
        
        if(tipo.equalsIgnoreCase("moto") && cilindraje<100){
            setPrecio(getSalarioMinimo()*8.60);
        }
        else if(tipo.equalsIgnoreCase("moto") && 
                cilindraje>100 && cilindraje<200){
            setPrecio(getSalarioMinimo()*11.55);
        }
        else if(tipo.equalsIgnoreCase("moto") && cilindraje>200){
            setPrecio(getSalarioMinimo()*13.03);
        }
        
    }

}