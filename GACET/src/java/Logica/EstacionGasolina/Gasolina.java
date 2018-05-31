package Logica.EstacionGasolina;


/**
 * Manejo del tipo de combustible Gasolina
 */
public class Gasolina extends Combustible {

    /**
     * Default constructor
     */
    public Gasolina() {
        this.tipoDefecto();
    }
    
    @Override
    public void precioCombustible(double precio){
        
        setPrecio(8889.0);
        
    }

    @Override
    public void tipoDefecto() {
        setTipo("Gasolina");
    }

}