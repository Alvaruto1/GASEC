/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import Logica.Comentario.Comentario;
import Logica.EstacionGasolina.ACPM;
import Logica.EstacionGasolina.Combustible;
import Logica.EstacionGasolina.Gas;
import Logica.EstacionGasolina.Gasolina;
import Logica.Vehiculo.Bus;
import Logica.Vehiculo.Camion;
import Logica.Vehiculo.Carro;
import Logica.Vehiculo.Moto;
import Logica.Vehiculo.Vehiculo;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
            
            System.out.println("Se ingresa corrctamente comentario");
            
            
        } catch (SQLException e) {
            
            System.out.println("Erro al ingresar comentario "+e);
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Comentario, "
                    + "id_Usuario,"
                    + "id_Estacion,"
                    + "Comentario,"
                    + "Calificacion"
                    + " FROM Comentario "
                    + " ORDER BY id_Comentario");
            
            
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
    
    /**
     * recupera todos los vehiculos de un usuario
     * @param idEstacion
     * @return arreglo de vehiculos
     */
    public ArrayList<Comentario> comentariosEstacionById(int idEstacion){
        ArrayList<Comentario> comentarios = new ArrayList<>();
          
        
        
        try {
            ResultSet rS = MostrarTabla();
            while(rS.next()){
                Comentario comentario = new Comentario(); 
                if(rS.getInt("id_Estacion") == idEstacion){
                    
                    comentario.setCalificacion(rS.getInt("Calificacion"));
                    comentario.setIdUsuario(rS.getInt("id_Usuario"));
                    comentario.setIdComentario(rS.getInt("id_Comentario"));
                    comentario.setMensaje(rS.getString("Comentario"));
                    
                    comentarios.add(comentario);
                    
                    
                    
                    
                }
            }
            System.out.println("se pudo encontrar comentarios sin problema");
        } catch (SQLException ex) {
            
            System.out.println("error al encontrar comentarios");
            System.out.println("Error encontrar comentarios: "+ex);

        }
        
        return comentarios;
    }
    
}