package Logica.Ubicacion;

/**
 * 
 */
public class Ubicacion {

    /**
     * Default constructor
     */
    public Ubicacion() {
    }

    /**
     * direccion de la ubicacion
     */
    private String direccion;

    /**
     * latiud ubicacion
     */
    private double latitud;

    /**
     * longitud ubicacion
     */
    private double longitud;

    /**
     * obtener direccion de la ubicacion
     * @return un texto con la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * colocar la direccion de la ubicacion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * obtener la latitud de la ubicacion
     * @return un decimal con la latidu
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * colocar la latitud de la ubicacion
     * @param latitud 
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * obtener la longitud de la ubicacion
     * @return un decimal con la longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * coloca la longitud de la ubicacion
     * @param longitud 
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    


}