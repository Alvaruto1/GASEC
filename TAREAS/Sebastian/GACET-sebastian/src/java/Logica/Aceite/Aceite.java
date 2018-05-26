package Logica.Aceite;


/**
 * 
 */
public class Aceite {

    /**
     * Default constructor
     */
    public Aceite() {
    }

    /**
     * tipo de aceite
     */
    private String tipo;

    /**
     * marca del aceite
     */
    private String marca;

    /**
     * informacion sobre el aceite
     */
    private String caracteristica;
    
    /**
     * kilometros para cambio de aceite
     */
    private int kmCambioAceite;

    /**
     * obtener tipo de aceite
     * @return texto del tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * colocar tipo de aceite
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * obtener marca del aceite
     * @return texto de la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * colocar marca del aceite
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * obtner informacion sobre el aceite
     * @return texto de la informacion
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * colocar informacion sobre el aceite
     * @param caracteristica 
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    /**
     * obtener kilometros para hacer el cambio de aceite
     * @return kilometros para cambio
     */
    public int getKmCambioAceite() {
        return kmCambioAceite;
    }

    /**
     * colocar km cambio de aceite
     * @param kmCambioAceite 
     */
    public void setKmCambioAceite(int kmCambioAceite) {
        this.kmCambioAceite = kmCambioAceite;
    }
    
    
    
    


}