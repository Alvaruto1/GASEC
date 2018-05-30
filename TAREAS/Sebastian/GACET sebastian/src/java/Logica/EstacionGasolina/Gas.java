package Logica.EstacionGasolina;


/**
 * Manejo del tipo de combustible Gas
 */
public class Gas extends Combustible {

    /**
     * Default constructor
     */
    public Gas() {
        
    }
    
    @Override
    public void precioCombustible(double precio){
        
        setPrecio(1148.13);
        
    }

    @Override
    public void tipoDefecto() {
        setTipo("Gas");
    }

}