/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Usuario.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiantes
 */
public class DatosUsuario {
    
    Conexion c;

    public DatosUsuario(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarUsuario(Usuario u){
       
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into usuario("
                    + "Nombre,"
                    + "Alias,"
                    + "Edad,"
                    + "Email,"
                    + "Contraseña) values(?,?,?,?,?,?)");
            
            insertar.setString(1, u.getNombre());
            insertar.setString(2, u.getAlias());
            insertar.setInt(3, u.getEdad());
            insertar.setString(4, u.getEmail());
            insertar.setString(5, u.getContrasenia());
            insertar.executeUpdate();
            
            
        } catch (SQLException e) {
            
            System.out.println("ERROR");
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id, "
                    + "Nombre,"
                    + "Alias,"
                    + "Edad,"
                    + "Email,"
                    + "Contraseña"
                    + "FROM Usuario "
                    + "ORDER BY id");
            
            
            tabla = pstm.executeQuery();
            
            System.out.println("Se logro mostrar la tabla Usuario");
            
        } catch (SQLException ex) {
            System.out.println("Error: Mostrar tabla Usuario");
        }
        return tabla;
        
    }
    
    public void borrarUsuario(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from Usuario "
                    + " where id_Usuario = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar el Usuario");
        }


    }
        
}