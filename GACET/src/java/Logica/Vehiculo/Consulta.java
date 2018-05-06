package Logica.Vehiculo;


import Logica.SOAT.SOAT;
import Logica.Ubicacion.Ubicacion;
import java.util.*;

/**
 * 
 */
public class Consulta {

    /**
     * Default constructor
     */
    public Consulta() {
    }


    /**
     * verifica si ya esta pasada o en la fecha de mantenimiento
     * @param fecha
     * @return verdadero o falso segun se encuntre antes o despues de la fecha
     * de manteniiento
     */
    public boolean recordarMantenimiento(GregorianCalendar fecha) {        
        GregorianCalendar fechaActual = new GregorianCalendar();
        return fecha.after(fechaActual);
    }

    /**
     * verifica si ya se enceuntra en hora de cambio de aceite
     * @param kmRecorridos
     * @param kmCambio
     * @return verdadero o falso si ya es hora de hacer el cambio
     */
    public boolean recordarCambioAceite(int kmRecorridos, int kmCambio) {
        return kmRecorridos >= kmCambio;
    }

    /**
     * calcula la distancia netre dos ubicaciones en km
     * @param ubicacionActual
     * @param ubicacionAnterior
     * @return distancia en km
     */
    public int calcularDistancia(Ubicacion ubicacionActual, 
            Ubicacion ubicacionAnterior) {
        int kmRecorrido=0;
        
        //falta funcion que calcula kilometros
        
        return kmRecorrido;
    }

    /**
     * muestra los kilometros faltantes o que ya se paso para el cambio de 
     * aceite
     * @param kmRecorridos
     * @param kmCambio 
     * @return entero de kilometros faltantes para cambio
     */
    public int calcularKmParaCambioAceite(int kmRecorridos, int kmCambio) {        
        return kmRecorridos-kmCambio;
    }

    /**
     * verifica si ya es hora de hacer el cambio del soat
     * @param soat
     * @return verdadero o falso si ya se encuentra en fechas de vencimiento 
     * con 10 dias antes
     */
    public boolean recordarRenovacionSOAT(SOAT soat) {        
        GregorianCalendar fechaSOATDiasAntes = soat.getFecha();
        GregorianCalendar fechaActual = new GregorianCalendar();
        fechaSOATDiasAntes.add(Calendar.DATE,-10);
        return fechaSOATDiasAntes.after(fechaActual);
    }

    /**
     * calcula cual es la fecha de pago del SOAT
     * @param soat 
     * @return fecha de pago
     */
    public GregorianCalendar calcularFechaSOAT(SOAT soat) {
        GregorianCalendar fechaPagoSOAT = soat.getFecha();
        fechaPagoSOAT.add(Calendar.YEAR, 1);
        return fechaPagoSOAT;
    }

    /**
     * calcular fecha del mantenimiento proximo
     * @param fechaMantenimiento 
     * @param numMesesMantenimiento 
     * @return fecha del proximo mantenimiento
     */
    public GregorianCalendar calcularFechaMantenimiento(GregorianCalendar fechaMantenimiento, int numMesesMantenimiento) {
        GregorianCalendar fechaProximoManten = fechaMantenimiento;
        fechaProximoManten.add(Calendar.MONTH, numMesesMantenimiento);
        return fechaProximoManten;
    }

}