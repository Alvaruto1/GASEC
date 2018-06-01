/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Ubicacion.Ubicacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebas
 */
public class DatosUbicacionMapa {
    
    private int idRegistroActual;
    Conexion c;

    public DatosUbicacionMapa(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarUbicacion(Ubicacion u){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into ubicacionmapa("
                    + "Longitud,"
                    + "Latitud,"
                    + "Direccion) values(?,?,?)");
            
            insertar.setDouble(1, u.getLatitud());
            insertar.setDouble(2, u.getLongitud());
            insertar.setString(3, u.getDireccion());
            insertar.executeUpdate();
            
            this.idRegistroActual=idUltimoRegistrosAceite();
            System.out.println("Se guardo ubicacion correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a ubicacion");
            System.out.println("ubicacion:"+e);
        }
        
        
    }
    
    /**
     * obtener ide de ubicacion por vehiculo
     * @param idVehiculo
     * @return 
     */
    public int encontrarIdUbicacionPorVehiculo(int idVehiculo){
        int id=0;
        try {
            PreparedStatement pS = c.getConexion().prepareStatement("SELECT id_UbicacionMapa FROM vehiculo where id_Vehiculo=?");
            pS.setInt(1, idVehiculo);
            ResultSet rS = pS.executeQuery();
            while(rS.next()){
                id = rS.getInt("id_UbicacionMapa");
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar buscar id soat: "+ex);
        }
        
        return id;
    }
    
    public void actualizarUbicacion(int id,Ubicacion u) {

        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("update ubicacionmapa set "
                    
                    + "Precio = ?,"
                    + "Longitud = ?,"
                    + "Latitud = ?,"
                    + "Direccion = ?"
                    + " where id_UbicacionMapa = ?");
            
            insertar.setDouble(1, u.getLatitud());
            insertar.setDouble(2, u.getLongitud());
            insertar.setString(3, u.getDireccion());
            insertar.setInt(4, id);
            insertar.executeUpdate();
            System.out.println("Se actualizo correctamente la ubicacion");
        } catch (SQLException e) {
            System.out.println("Error actuzaliar ubicacion "+e);
        }

    }
    
    public int getIdRegistroActual() {
        return idRegistroActual;
    }
    
    
    /**
     * devuelve el id del ultimo registro 
     * @return entero
     * @throws SQLException 
     */
    public int idUltimoRegistrosAceite() throws SQLException{
        int ultimo=0;
        
        PreparedStatement pstm =c.getConexion().prepareStatement("SELECT * FROM ubicacionmapa");        
        ResultSet rS = pstm.executeQuery();
        while(rS.next()){
            ultimo = rS.getInt("id_UbicacionMapa");            
        }
        
        return ultimo;
    }
    
    
    public void borrarUbicacion(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from ubicacionmapa "
                    + " where id_UbicacionMapa = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar la ubicacion");
        }


    }
    
    public Ubicacion mostrarUbicacion(int id) throws SQLException {
        Ubicacion ubicacion = new Ubicacion();
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_UbicacionMapa, "
                 + " Latitud, "
                 + " Longitud, "
                 + " Direccion "
                 + " FROM ubicacionmapa "
                 + " WHERE id_UbicacionMapa = ? ");
        pstm.setInt(1, id);

        ResultSet rS = pstm.executeQuery();
        
        while(rS.next()){
            ubicacion.setDireccion(rS.getString("Direccion"));
            ubicacion.setLatitud(rS.getInt("Latitud"));
            ubicacion.setLongitud(rS.getInt("Longitud"));
        }

        return ubicacion;
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        try {
            
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_UbicacionMapa, "
                    + "Latitud, "
                    + "Longitud, "
                    + "Direccion "
                    + "FROM ubicacionmapa "
                    + "ORDER BY id_UbicacionMapa");
            
            tabla = pstm.executeQuery();
            System.out.println("Se muestra tabla ubicacion correctamente");
            
        } catch (SQLException ex) {
            System.out.println("Error mostrar tabla ubicaciones: "+ex);
        }
        return tabla;
    }
    
    
    

}