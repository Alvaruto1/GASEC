package Logica.Vehiculo;


import Logica.Aceite.Aceite;
import Logica.EstacionGasolina.Combustible;
import Logica.SOAT.SOAT;
import Logica.Ubicacion.Ubicacion;
import java.util.*;

/**
 * 
 */
public abstract class Vehiculo {   

    /**
     * identificiacion del vehiculo
     */
    private String placa;

    /**
     * tipo de vehiuclo
     */
    private String tipo;

    /**
     * soat del vehiculo
     */
    private SOAT soat;

    /**
     * fecha del ultimo mantenimiento del vehiculo
     */
    private GregorianCalendar fechaUltimoMantenimiento;

    /**
     * lista de combustibles del vehiculo
     */
    private ArrayList<Combustible> combustible = new ArrayList<>();

    /**
     * aceite del vehiculo
     */
    private Aceite aceite;

    /**
     * cilindraje del vehiculo
     */
    private int cilindraje;

    /**
     * kilometraje que ha recorrido desde ultimo cambio aceite del vehiculo
     */
    private int kmRecorrido = 0;

    /**
     * consulta informacion del vehiculo
     */
    private Consulta consulta;

    /**
     * ubicacion actual del vehiculo
     */
    private Ubicacion ubicacion;
    
    
    /**
     * obtener placa del vehiculo
     * @return texto de la placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * colocar placa del vehiculo
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * obtener tipo del vehiculo
     * @return texto del tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * colocar tipo del vehiculo y soat del vehiculo (clase)
     */
    public abstract void setTipoYSOAT();
    
    /**
     * colocar el tipo del vehiculo
     * @param tipo
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * obtener soat del vehiculo clase
     * @return soat
     */
    public SOAT getSoat() {
        return soat;
    }
    
    /**
     * colocar soat del vehiculo
     * @param soat 
     */
    public void setSoat(SOAT soat){
        this.soat = soat;        
    }

    /**
     * obtener ultima fecha de mantenimiento
     * @return un date de la fecha
     */
    public GregorianCalendar getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    /**
     * colocar ultima fecha de matenimiento
     * @param fechaUltimoMantenimiento 
     */
    public void setFechaUltimoMantenimiento(GregorianCalendar fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    /**
     * obtener lista de combustibles del vehiculo
     * @return arreglo de combustibles
     */
    public ArrayList<Combustible> getCombustible() {
        return combustible;
    }

    /**
     * colocar lista de combustibles del vehiculo
     * @param combustible 
     */
    public void setCombustible(ArrayList<Combustible> combustible) {
        this.combustible = combustible;
    }
    
    /**
     * agregar un combustible al vehiculo
     * @param combustible 
     */
    public void agregarCombustible(Combustible combustible){
        this.combustible.add(combustible);
    }

    /**
     * obtener aceite del vehiculo
     * @return aceite
     */
    public Aceite getAceite() {
        return aceite;
    }

    /**
     * colocar aceite del vehiculo
     * @param aceite 
     */
    public void setAceite(Aceite aceite) {
        this.aceite = aceite;
    }

    /**
     * obtener cilindraje del vehiculo
     * @return entero del cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * colocar cilindraje del vehiculo
     * @param cilindraje 
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * obtener km recorrido despues del utimo cambio aceite del vehiculo
     * @return entero de los kms
     */
    public int getKmRecorrido() {
        return kmRecorrido;
    }

    /**
     * colocar km recorrido despues del utimo cambio aceite del vehiculo
     * @param kmRecorrido 
     */
    public void setKmRecorrido(int kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    /**
     * obtener consulta
     * @return consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * obtener ubicacion del vehiculo
     * @return ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * colocar ubicacion del vehiculo
     * @param ubicacion 
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    

}