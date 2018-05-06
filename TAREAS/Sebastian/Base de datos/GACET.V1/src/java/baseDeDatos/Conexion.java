/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import java.sql.*;

/**
 *
 * @author Estudiantes
 */
public class Conexion {
    
    String nombreBase;
    String login;
    String pasword;
    String URL;
    String mensaje;
    Connection conexion = null;
    
    Conexion(String nombreBase , String login , String pasword){
        
        this.nombreBase = nombreBase;
        this.login = login;
        this.pasword = pasword;
        URL = "jdbc:mysql://localhost/"+nombreBase;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,login,pasword);
            if (conexion != null) {
                System.out.println("Conexion establecida");
            }
            
        } catch (SQLException |ClassNotFoundException e) {
            
            mensaje = e.getMessage();
           
        }
        
        
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
    
}
