/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.EstacionGasolina.EstacionGasolina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */
public class DatosEstacion {
    
            Conexion c;

    public DatosEstacion(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarEstacion(EstacionGasolina g ,int id_Combustible ,int id_Ubicacion){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into estacion("
                    + "Marca,"
                    + "Puestos,"
                    + "Valoracion,"
                    + "id_Combustible,"
                    + "id_Ubicacion) values(?,?,?,?,?)");
            
            insertar.setString(1, g.getMarca());
            insertar.setInt(2, g.getPuestos());
            insertar.setInt(3, g.getValoracion());
            insertar.setInt(4, id_Combustible);
            insertar.setInt(5, id_Ubicacion);
            insertar.executeUpdate();
            System.out.println("Se guardaro la estacion correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a estacion");
            System.out.println("estacion:"+e);
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id, "
                    + "Marca,"
                    + "Puestos,"
                    + "Valoracion,"
                    + "id_Combustible,"
                    + "id_Ubicacion"
                    + "FROM Estacion "
                    + "ORDER BY id");
            
            
            tabla = pstm.executeQuery();
            
            System.out.println("Se logro mostrar la tabla estacion");
            
        } catch (SQLException ex) {
            System.out.println("Error: Mostrar tabla Estacion");
        }
        return tabla;
        
    }
    
    public void borrarEstacion(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from estacion "
                    + " where id_Estacion = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar la estacion");
        }


    }
    
        //Esta funcion permite sacar una estacion deoendiendo del id_Ubicacion
    public ResultSet sacarEstacion(int id){
        ResultSet rS = null;
        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Estacion, "
                    + " Marca, "
                    + " Puestos, "
                    + " Valoracion, "
                    + " id_Ubicacion "
                    + " FROM estacion "
                    + " WHERE id_Ubicacion = ? ");
            pstm.setInt(1, id);

            rS = pstm.executeQuery();
            System.out.println("se encontro vehiculo correctamente");

        } catch (SQLException ex) {
            System.out.println("Error encontrar vehiculo por id");
            System.out.println(ex+": error encontrar vehiculo");
        }
        return rS;
        
    }
}