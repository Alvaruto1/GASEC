package Logica.SOAT;


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
    public void calcularPrecio(String tipo, int cilindraje){
        
        if(tipo.equalsIgnoreCase("camion") && cilindraje<5){
            setPrecio(getSalarioMinimo()*15.21);
        }
        else if(tipo.equalsIgnoreCase("camion") && 
               cilindraje>5 && cilindraje<15){
            setPrecio(getSalarioMinimo()*21.98);
        }
        else if(tipo.equalsIgnoreCase("camion") && cilindraje>15){
            setPrecio(getSalarioMinimo()*27.80);
        }
        
    }

}