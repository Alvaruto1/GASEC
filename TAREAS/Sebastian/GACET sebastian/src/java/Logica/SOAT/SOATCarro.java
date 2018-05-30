package Logica.SOAT;


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
    public void calcularPrecio(String tipo, int cilindraje){
        
        if(tipo.equalsIgnoreCase("carro") && cilindraje<1500){
            setPrecio(getSalarioMinimo()*14.945);
        }
        else if(tipo.equalsIgnoreCase("carro") && 
                cilindraje>1500 && cilindraje<2500){
            setPrecio(getSalarioMinimo()*17.71);
        }
        else if(tipo.equalsIgnoreCase("carro") && cilindraje>2500){
            setPrecio(getSalarioMinimo()*20.425);
        }
        
    }

}