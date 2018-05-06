package Logica.EstacionGasolina;


import java.util.*;

/**
 * Clase en donde se manejará el combustible correspondiente a cada vehículo
 */
public class Combustible {

    //Atributos
    /**
     * tipo de combustible que utiliza el vehículo
     */
    public String tipo;

    /**
     * Precio del combustible por galón y en pesos.
     */
    public Double precio;

    /**
     * Detalles del combustible como su composición y rendimiento
     */
    public String caracteristica;
    
    //Métodos
    /**
     * Metodo constructor del combustible
     */
    public Combustible() {
        
    }
    
    /**
     * obtiene el tipo de combustible
     * @return tipo de combustible
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * modifica el tipo de combustible
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Muestra el precio por galón del combustible
     * @return precio
     */
    public Double getPrecio() {
        return precio;
    }
    
    /**
     * modifica el precio del combustible
     * @param precio 
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    /**
     * muestra la descripción del combustible
     * @return caracteristica
     */
    public String getCaracteristica() {
        return caracteristica;
    }
    
    /**
     * modifica las caracteristicas del combustible
     * @param caracteristica 
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
}