package Logica.EstacionGasolina;



/**
 * Manejo del tipo de combustible ACPM
 */
public class ACPM extends Combustible {

    /**
     * Default constructor
     */
    public ACPM() {
        
    }
    
    @Override
    public void precioCombustible(double precio){
        
        setPrecio(8185.0);
        
    }

}