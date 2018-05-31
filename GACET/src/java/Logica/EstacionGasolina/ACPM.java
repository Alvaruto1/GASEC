package Logica.EstacionGasolina;



/**
 * Manejo del tipo de combustible ACPM
 */
public class ACPM extends Combustible {

    /**
     * Default constructor
     */
    public ACPM() {
        this.tipoDefecto();
        
    }
    
    @Override
    public void precioCombustible(double precio){
        
        setPrecio(8185.0);
        
    }

    @Override
    public void tipoDefecto() {
        setTipo("ACPM");
    }


}