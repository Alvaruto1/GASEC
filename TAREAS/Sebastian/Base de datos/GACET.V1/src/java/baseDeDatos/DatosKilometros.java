/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */
public class DatosKilometros {
    
       Conexion c;

    public DatosKilometros(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarUbicacion(int id_Vehiculo){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into Kilometros("
                    + "id_Vehiculo) values(?)");
           
            insertar.setDouble(1, id_Vehiculo);
            insertar.executeUpdate();
            
            
        } catch (SQLException e) {
            
            System.out.println("ERROR : No se logro ingresar los datos a Kilometros");
        }
        
        
    }
    
    
    public void borrarKilometros(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from Kilometros "
                    + " where id_Kilometros = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar los Kilometros");
        }


    }
}
