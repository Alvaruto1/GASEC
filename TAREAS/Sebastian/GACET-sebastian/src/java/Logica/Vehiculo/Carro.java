package Logica.Vehiculo;

import Logica.SOAT.SOATCarro;

/**
 * 
 */
public class Carro extends Vehiculo {

    /**
     * Default constructor
     */
    public Carro() {
        this.setTipoYSOAT();
    }
    
    /**
     * colocar el tipo de vehiculo y del SOAT
     */
    @Override
    public void setTipoYSOAT() {
        this.setTipo("Carro"); 
        this.setSoat(new SOATCarro());
    }
    
}