package Logica.Vehiculo;


import Logica.SOAT.SOATMoto;

/**
 * 
 */
public class Moto extends Vehiculo {

    /**
     * Default constructor
     */
    public Moto() {
        this.setTipoYSOAT();
    }
    
    /**
     * colocar el tipo de vehiculo y del SOAT
     */
    @Override
    public void setTipoYSOAT() {
        this.setTipo("Moto"); 
        this.setSoat(new SOATMoto());
    }
    
}