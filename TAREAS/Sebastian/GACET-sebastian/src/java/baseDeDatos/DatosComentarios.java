/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Comentario.Comentario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */
public class DatosComentarios {
        Conexion c;

    public DatosComentarios(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarComentario(Comentario co,int id_Estacion){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into comentario("
                    + "id_Usuario,"
                    + "id_Estacion,"
                    + "Comentario,"
                    + "Calificacion) values(?,?,?,?)");
            
            insertar.setInt(1, co.getIdUsuario());
            insertar.setInt(2, id_Estacion);
            insertar.setString(3, co.getMensaje());
            insertar.setInt(4, co.getCalificacion());
            insertar.executeUpdate();
            
            System.out.println("Conexion correcta");
            
            
        } catch (SQLException e) {
            
            System.out.println("ERROR");
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id, "
                    + "id_Usuario,"
                    + "id_Estacion,"
                    + "Comentario,"
                    + "Calificacion"
                    + " FROM Comentario "
                    + " ORDER BY id");
            
            
            tabla = pstm.executeQuery();
            
            System.out.println("Se logro mostrar la tabla comentario");
            
        } catch (SQLException ex) {
            System.out.println("Error: Mostrar tabla comentario");
        }
        return tabla;
        
    }
    
    public void borrarComentario(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from comentario "
                    + " where id_Comentario = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar el comentario");
        }


    }
    
}