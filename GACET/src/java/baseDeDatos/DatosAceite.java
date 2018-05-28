package baseDeDatos;

import Logica.Aceite.Aceite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Nicolas Herrera Rubiano
 */
public class DatosAceite {
    
     Conexion c;

    public DatosAceite(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword); 
    }
    
    public void ingresarAceite(Aceite ace){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into aceite("
                    + " TipoAceite, "
                    + " Marca, "
                    + " KmMaximo, "
                    + " Caracteristica) "
                    + " values(?,?,?,?)");
            
            insertar.setString(1, ace.getTipo());
            insertar.setString(2, ace.getMarca());
            insertar.setInt(3, ace.getKmCambioAceite());
            insertar.setString(4, ace.getCaracteristica());
            
            
            insertar.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR");
        }
        
        
    }
    
    public ResultSet mostrarAceite(int id) throws SQLException {
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Aceite, "
                 + " TipoAceite, "
                 + " Marca, "
                 + " KmMaximo, "
                 + " Caracteristica) "
                 + " FROM aceite "
                 + " WHERE id_Aceite = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    
    public void actualizarAceite(Aceite ace) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("update aceite set TipoAceite = ?, "
                    + " Marca = ?,"
                    + " KmMaximo = ?,"
                    + " Caracteristica = ?,"
                    + " where id_Aceite = ?");
            
            pstm.setString(1, ace.getTipo());
            pstm.setString(2, ace.getMarca());
            pstm.setInt(3, ace.getKmCambioAceite());
            pstm.setString(4, ace.getCaracteristica());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarAceite(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from aceite "
                    + " where id_Aceite = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public String getMensaje() {
        return c.getMensaje();
    }
    
}