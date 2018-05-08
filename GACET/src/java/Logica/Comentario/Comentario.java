package Logica.Comentario;


import java.util.*;

/**
 * Clase en donde se crearán los comentarios de los usuarios hacia la
 * estación de gasolina.
 */
public class Comentario {

    //Atributos

    /**
     * identificador del usuario activo
     */
    private int idUsuario;

    /**
     * valoración hecha por el usuario para la estación de gasolina
     */
    private int calificacion;

    /**
     * Texto para dar una opinión extendida sobre la apreciación de la 
     * estación
     */
    private String mensaje;
    
    /**
     * fecha del envío del comentario
     */
    private GregorianCalendar fecha;

    //Métodos
    
    /**
     * Método constructor
     */
    public Comentario() {
        
    }
    
    /**
     * Método en el cual se crea el comentario del usuario
     * @param idUsuario identificador del usuario
     * @param calificacion valoración hacia la estación de servicio
     * @param mensaje opinión complementaria a la valoración
     */
    public void hacerComentario(int idUsuario, int calificacion, 
            String mensaje) {
        
        this.idUsuario = idUsuario;
        this.calificacion = calificacion;
        this.mensaje = mensaje;
        this.fecha = new GregorianCalendar();
        
    }
    
    /**
     * obtención del identificador del usuaio
     * @return el id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }
    
    /**
     * modifica el id del usuario
     * @param idUsuario 
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    /**
     * muestra la calificación realizada por el usuario
     * @return valor de la calificación
     */
    public int getCalificacion() {
        return calificacion;
    }
    
    /**
     * modificador de la calificación
     * @param calificacion 
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    /**
     * obtención del mensaje 
     * @return texto de la valoración
     */
    public String getMensaje() {
        return mensaje;
    }
    
    /**
     * modificador del mensaje
     * @param mensaje 
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    /**
     * Obtener fecha actual
     * @return fecha actual
     */
    public GregorianCalendar getFecha() {
        return fecha;
    }
    
}