/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Usuario.Usuario;
import Logica.Vehiculo.Vehiculo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */


public class DatosVehiculo {
    
        Conexion c;
        public DatosVehiculo(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarVehiculo(int id_usuario, int id_soat,int id_Aceite, int id_Ubicacion ,Vehiculo v){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into Vehiculo("
                    + "id_Usuario,"
                    + "Placa,"
                    + "id_TipoVehiculo,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "Aceite,"
                    + "id_ubicacion) values(?,?,?,?,?,?,?,?,?)");
            
            insertar.setInt(1, id_usuario);
            insertar.setString(2, v.getPlaca());
            insertar.setString(3, v.getTipo());
            insertar.setInt(4, id_soat);
            insertar.setDate(5, (Date) v.getFechaUltimoMantenimiento());
            insertar.setInt(6, v.getCilindraje());
            insertar.setInt(7, id_Aceite);
            insertar.setInt(8, id_Ubicacion);
            insertar.executeUpdate();
            
            System.out.println("se logro ingresar datos a Vehiculo");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a Vehiculo");
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id, "
                    + "id_Usuario,"
                    + "Placa,"
                    + "id_TipoVehiculo,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "Aceite,"
                    + "id_Ubicacion"
                    + "FROM Vehiculo "
                    + "ORDER BY id");
            
            
            tabla = pstm.executeQuery();
            
            System.out.println("Se logro mostrar la tabla Vehiculo " );
            
        } catch (SQLException ex) {
            System.out.println("Error: Mostrar tabla Vehiculo ");
        }
        return tabla;
        
    }
    
    public void borrarVehiculo(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from Vehiculo "
                    + " where id_Vehiculo = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar el contacto de Vehiculo");
        }


    }
    
    
    
   

    
}
