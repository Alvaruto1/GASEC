package Logica.Vehiculo;


import Logica.SOAT.SOATCamion;

/**
 * 
 */
public class Camion extends Vehiculo {

    /**
     * Default constructor
     */
    public Camion() {
        this.setTipoYSOAT();
    }
    
    /**
     * colocar el tipo de vehiculo y del SOAT
     */
    @Override
    public void setTipoYSOAT() {
        this.setTipo("Camion"); 
        this.setSoat(new SOATCamion());
    }    
}