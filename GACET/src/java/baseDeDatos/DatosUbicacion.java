/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Ubicacion.Ubicacion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */
public class DatosUbicacion {
    
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
            
            
        } catch (SQLException e) {
            
            System.out.println("ERROR : No se logro ingresar los datos a Ubicacion");
        }
        
        
    }
    
    
    public void borrarUbicacion(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from Ubicacion "
                    + " where id_Ubicacion = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar la ubicacion");
        }


    }
    

}