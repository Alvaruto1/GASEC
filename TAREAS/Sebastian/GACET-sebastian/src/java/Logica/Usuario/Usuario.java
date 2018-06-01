package Logica.Usuario;


import Logica.Ubicacion.Ubicacion;
import Logica.Vehiculo.Vehiculo;
import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * nombre del usuario
     */
    private String nombre;

    /**
     * alias del usuario
     */
    private String alias;

    /**
     * edad del usuario
     */
    private int edad;

    /**
     * correo del usuario
     */
    private String email;

    /**
     * contrasenia del usuario
     */
    private String contrasenia;

    /**
     * lista de vehiculos que posee el usuario
     */
    private ArrayList<Vehiculo> vehiculo = new ArrayList<>();

    /**
     * @return
     */
    public Ubicacion ubicarUsuario() {
        // TODO implement here
        return null;
    }

    /**
     * registra los datos de un usuario
     * @param nombre 
     * @param alias 
     * @param edad 
     * @param email 
     * @param contrasenia
     */
    public void registrarUsuario(String nombre, String alias, int edad,
            String email, String contrasenia) {
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.email = email;
        this.contrasenia = contrasenia; 
        
    }

    /**
     * agregar vehiculo a la lista del usuario
     * @param vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculo.add(vehiculo);
    }

    /**
     * cambiar contrasenia
     * @param contraseniaVieja
     * @param contraseniaNueva
     * @return si fue exitoso el cambio
     */
    public boolean cambiarContrasenia(String contraseniaVieja, 
            String contraseniaNueva) {
        if(this.contrasenia.contentEquals(contraseniaVieja)){
            this.contrasenia = contraseniaVieja;
            return true;
        }
        else{
            return false;            
        }        
    }

    /**
     * obtener nombre del usuario
     * @return texto del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * colocar nombre del usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtener alias del usuario
     * @return texto del alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * colocar alias del usuario
     * @param alias 
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * obtener edad del usuario
     * @return entero de la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * colocar edad del usuario
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * obtener correo del usuario
     * @return texto del correo
     */
    public String getEmail() {
        return email;
    }

    /**
     * colocar correo del usuario
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * obtener contraseña del usuario
     * @return texto de la contraseña
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * colocar contraseña del usuario
     * @param contrasenia 
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * obtener lista de vehiculos del usuario
     * @return arreglo de vehiculos
     */
    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    /**
     * colocar arreglo de vehiuclos del usuario
     * @param vehiculo 
     */
    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    

}