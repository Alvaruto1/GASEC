package Logica.Comentario;


import Logica.Usuario.Usuario;
import java.util.*;

/**
 * 
 */
public class Comentario {

    /**
     * Default constructor
     */
    public Comentario() {
    }

    /**
     * 
     */
    public int idUsuario;

    /**
     * 
     */
    public int calificacion;

    /**
     * 
     */
    public String mensaje;


    /**
     * @param usuario 
     * @param calificacion 
     * @param mensaje 
     * @return
     */
    public void hacerComentario(Usuario usuario, int calificacion, String mensaje) {
        // TODO implement here
        return null;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    

}