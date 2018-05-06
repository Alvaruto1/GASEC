package Logica.Vehiculo;

import Logica.SOAT.SOATBus;

/**
 * 
 */
public class Bus extends Vehiculo {

    /**
     * Default constructor
     */
    public Bus() {
        this.setTipoYSOAT();
    }
    
    /**
     * colocar el tipo de vehiculo y del SOAT
     */
    @Override
    public void setTipoYSOAT() {
        this.setTipo("Bus"); 
        this.setSoat(new SOATBus());
    }
    
}