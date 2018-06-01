package baseDeDatos;

import Logica.EstacionGasolina.Combustible;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Nicolas Herrera Rubiano
 */
public class DatosCombustibleEstacion {
    
     Conexion c;

    public DatosCombustibleEstacion(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
    
    }
    
    public void ingresarCombustibleEstacion(Combustible co, int id_Estacion){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into combustiblee("
                    + " Tipo, "
                    + " Caracteristica, "
                    + " Precio, "
                    + " id_Estacion) "
                    + " values(?,?,?,?)");
            
            insertar.setString(1, co.getTipo());
            insertar.setString(2, co.getCaracteristica());
            insertar.setDouble(3, co.getPrecio());
            insertar.setInt(4, id_Estacion);
            
            
            insertar.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR");
        }
        
        
    }
    
    public ResultSet mostrarCombustibleEstacion(int id) throws SQLException {
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_CombustibleE, "
                 + " Tipo, "
                 + " Caracteristica, "
                 + " Precio, "
                 + " id_Estacion) "
                 + " FROM combustiblee "
                 + " WHERE id_CombustibleE = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    
    public void actualizarCombustibleEstacion(Combustible co, int id_Estacion) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("update combustiblee set Tipo = ?, "
                    + " Caracteristica = ?,"
                    + " Precio = ?,"
                    + " id_Estacion = ?,"
                    + " where id_CombustibleE = ?");
            
            pstm.setString(1, co.getTipo());
            pstm.setString(2, co.getCaracteristica());
            pstm.setDouble(3, co.getPrecio());
            pstm.setInt(4, id_Estacion);

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarCombustibleEstacion(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from combustiblee "
                    + " where id_CombustibleE = ?");

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
