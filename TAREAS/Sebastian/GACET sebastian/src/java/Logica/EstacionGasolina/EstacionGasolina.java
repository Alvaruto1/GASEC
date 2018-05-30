package Logica.EstacionGasolina;


import Logica.Comentario.Comentario;
import Logica.Ubicacion.Ubicacion;
import java.util.*;

/**
 * Clase en donde se realizarán las labores propias de la estación de gasolina.
 */
public class EstacionGasolina {

    //Atributos
    /**
     * Ubicación de la estación de gasolina (coordenadas)
     */
    private Ubicacion direccion;

    /**
     * Arreglo de los combustibles que maneja la estación de gasolina
     */
    private ArrayList<Combustible> combustile;

    /**
     * Marca de la estación de gasolina
     */
    private String marca;

    /**
     * Número de puestos que tiene la estación de gasolina seleccionada
     */
    private int puestos;

    /**
     * arreglo con los comentarios
     */
    private ArrayList<Comentario> comentario;

    /**
     * Valoración que tiene la estación
     */
    private int valoracion;

    /**
     * identificador del usuario activo
     */
    private int id;

    //Métodos
    /**
     * Método constructor
     */
    public EstacionGasolina() {
    }

    /**
     * Método en donde se calculará la valoración de la estación de gasolina
     */
    public void calcularValoracion() {
        
        int cont=0;
        for(int i=0;i<comentario.size();i++){
            
            comentario.get(i).getCalificacion();
            cont = i+cont;
            
        }
        this.valoracion=cont/comentario.size();
    }

    /**
     * Se agrega un comentario a la estación de gasolina
     * @param comentario comentario realizado por el usuario
     */
    public void agregarComentario(Comentario comentario) {
        this.comentario.add(comentario);
    }

    /**
     * Se edita el comentario realizado
     * @param comentario comentario realizado por el usuario
     */
    public void editarComentario(Comentario comentario) {
        this.comentario.set(id, comentario);
    }

    /**
     * Se elimina el comentario hecho
     * @param comentario comentario realizado por el usuario
     */
    public void eliminarComentario(Comentario comentario) {
        this.comentario.remove(comentario);
    }

    /**
     * Obtener la ubiación de la estación
     * @return dirección
     */
    public Ubicacion getDireccion() {
        return direccion;
    }

    /**
     * Modificar la dirección de la estación
     * @param direccion 
     */
    public void setDireccion(Ubicacion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtener arreglo de los combustibles que maneja la estación
     * @return combustible
     */
    public ArrayList<Combustible> getCombustile() {
        return combustile;
    }

    /**
     * Modificar los combustibles que maneja la estación
     * @param combustile 
     */
    public void setCombustile(ArrayList<Combustible> combustile) {
        this.combustile = combustile;
    }

    /**
     * Mostrar la marca de la estación de gasolina
     * @return marca de la estación
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Modificar la marca de la estación de gasolina
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtener los lugares de tanqueo en la estación
     * @return puestos de tanqueo
     */
    public int getPuestos() {
        return puestos;
    }

    /**
     * Modificar los lugares de tanqueo
     * @param puestos 
     */
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    /**
     * Obtener el arreglo de comentarios de la estación de gasolina
     * @return comentario
     */
    public ArrayList<Comentario> getComentario() {
        return comentario;
    }

    /**
     * Modificar arreglo de comentarios
     * @param comentario 
     */
    public void setComentario(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtener la valoración de la estación de gasolina
     * @return valoración
     */
    public int getValoracion() {
        return valoracion;
    }

    /**
     * Modificar la valoración de la estación de gasolina
     * @param valoracion 
     */
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    /**
     * Obtener el id del usuario activo
     * @return id usuario activo
     */
    public int getId() {
        return id;
    }

    /**
     * Modificar el id del usuario activo
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    

}