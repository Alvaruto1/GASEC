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

/**
 *
 * @author Sebas
 */
public class DatosUbicacion {
    
    private int idRegistroActual;
    Conexion c;

    public DatosUbicacion(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarUbicacion(Ubicacion u){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into ubicacion("
                    + "Longitud,"
                    + "Latitud) values(?,?)");
            
            insertar.setDouble(1, u.getLatitud());
            insertar.setDouble(2, u.getLongitud());
            insertar.executeUpdate();
            
            this.idRegistroActual=idUltimoRegistrosAceite();
            
        } catch (SQLException e) {
            
            System.out.println("ERROR : No se logro ingresar los datos a Ubicacion");
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
        
        PreparedStatement pstm =c.getConexion().prepareStatement("SELECT MAX(id_Aceite) FROM aceite");        
        ResultSet rS = pstm.executeQuery();
        while(rS.next()){
            ultimo = rS.getInt("id_Aceite");
        }
        
        return ultimo;
    }
    
    
    public void borrarUbicacion(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from ubicacion "
                    + " where id_Ubicacion = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar la ubicacion");
        }


    }
    
    public Ubicacion mostrarUbicacion(int id) throws SQLException {
        Ubicacion ubicacion = new Ubicacion();
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Ubicacion, "
                 + " Latitud, "
                 + " Longitud, "
                 + " Direccion) "
                 + " FROM ubicacion "
                 + " WHERE id_Ubicacion = ? ");
        pstm.setInt(1, id);

        ResultSet rS = pstm.executeQuery();
        
        while(rS.next()){
            ubicacion.setDireccion(rS.getString("Direccion"));
            ubicacion.setLatitud(rS.getInt("Latitud"));
            ubicacion.setLongitud(rS.getInt("Longitud"));
        }

        return ubicacion;
    }
    

}