package Logica.SOAT;

import java.util.*;

/**
 * Clase en donde se trabajará lo relacionado con el SOAT de cada vehículo 
 */
public abstract class SOAT {

    //Atriutos
    
    /**
     * Empresa proveedora de los servicios del SOAT
     */
    private String empresa;

    /**
     * Valor en pesos del SOAT
     */
    private double precio;

    /**
     * fecha actual 
     */
    private GregorianCalendar fecha;

    /**
     * ciudad en donde se sacará el SOAT
     */
    private String ciudad;

    /**
     * tipo de servicio a que se destinó el vehículo (público, particular,
     * carga,etc)
     */
    private int tipoDeServicio;
    
    /**
     * Tipo de servicio público
     */
    public static final int PUBLICO = 0;

    /**
     * Tipo de servicio particular
     */
    public static final int PARTICULAR = 1;

    /**
     * Servicio de carga
     */
    public static final int CARGA = 2;

    /**
     * Servicio diplomático
     */
    public static final int DIPLOMATICO = 3;
    
    
    
    /**
     * Salario mínimo legal diario vigente
     */
    private double salarioMinimo = 26041.40;

    //Métodos
    
    /**
     * Método constructor
     */
    public SOAT() {
    }
    
    /**
     * Método en donde se hará el cálculo del precio a pagar por cada clase de
     * vehículo por el SOAT del mismo
     * 
     * @param tipo tipo de vehículo en uso
     * @param cilindraje cilidraje del vehículo para el cálculo del SOAT
     */
    public abstract void calcularPrecio(String tipo, int cilindraje);
        
    
    /**
     * Obtener empresa del SOAT
     * @return nombre de la empresa proveedora del SOAT
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Modificar el nombre de la empresa del SOAT
     * @param empresa 
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtener el precio del SOAT
     * @return precio SOAT
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modificar precio SOAT
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtener la fecha actual
     * @return fecha actual
     */
    public GregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * modificar la fecha
     * @param fecha 
     */
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtener el nombre de la ciudad
     * @return nombre de la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modificar el nombre de la ciudad
     * @param ciudad 
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtener el tipo de servicio del vehículo
     * @return Tipo de servicio del vehículo
     */
    public int getTipoDeServicio() {
        return tipoDeServicio;
    }

    /**
     * Modificar el tipo de servicio
     * @param tipoDeServicio 
     */
    public void setTipoDeServicio(int tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }

    /**
     * Obtener salario minimo diario
     * @return 
     */
    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    /**
     * modificar salario minimo diario
     * @param salarioMinimo 
     */
    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
    
    

}