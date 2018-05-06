package Logica.EstacionGasolina;


import Logica.Comentario.Comentario;
import Logica.Ubicacion.Ubicacion;
import java.util.*;

/**
 * 
 */
public class EstacionGasolina {

    /**
     * Default constructor
     */
    public EstacionGasolina() {
    }

    /**
     * 
     */
    public Ubicacion direccion;

    /**
     * 
     */
    public ArrayList<Combustible> combustile;

    /**
     * 
     */
    public String marca;

    /**
     * 
     */
    public int puestos;

    /**
     * 
     */
    public ArrayList<Comentario> comentario;

    /**
     * 
     */
    public int valoracion;

    /**
     * 
     */


    public Ubicacion getDireccion() {
        return direccion;
    }

    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Combustible> getCombustile() {
        return combustile;
    }

    public void setCombustile(ArrayList<Combustible> combustile) {
        this.combustile = combustile;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public ArrayList<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    





    /**
     * @return
     */
    public void calcularValoracion() {
        // TODO implement here
        return null;
    }

    /**
     * @param comentario 
     * @return
     */
    public void agregarComentario(Comentario comentario) {
        // TODO implement here
        return null;
    }

    /**
     * @param comentario 
     * @return
     */
    public void agregarComentario(Comentario comentario) {
        // TODO implement here
        return null;
    }

    /**
     * @param comentario 
     * @return
     */
    public void eliminarComentario(Comentario comentario) {
        // TODO implement here
        return null;
    }

}