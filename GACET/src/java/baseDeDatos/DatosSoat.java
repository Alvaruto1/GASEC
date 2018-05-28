package baseDeDatos;

import Logica.SOAT.SOAT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Nicolas Herrera Rubiano
 */
public class DatosSoat {
    
     Conexion c;

    public DatosSoat(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
 
    }
    
    public void ingresarSOAT(SOAT so, int id_TipoServicio){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into soat("
                    + " TipoSoat, "
                    + " Empresa, "
                    + " Ciudad, "
                    + " Fecha, "
                    + " id_TipoServicio, "
                    + " Precio, "
                    + " values(?,?,?,?,?,?)");
            
            insertar.setString(1, so.getClass().toString());
            insertar.setString(2, so.getEmpresa());
            insertar.setString(3, so.getCiudad());
            insertar.setString(4, so.getFecha().toString());
            insertar.setInt(5, id_TipoServicio);
            insertar.setDouble(6, so.getPrecio());
            
            
            
            insertar.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR");
        }
        
    }
        
        public ResultSet mostrarSOAT(int id) throws SQLException {
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Soat, "
                 + " TipoSoat, "
                 + " Empresa, "
                 + " Ciudad, "
                 + " Fecha, "
                 + " id_TipoServicio, "
                 + " Precio) "
                 + " FROM soat "
                 + " WHERE id_Soat = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    
    public void actualizarSOAT(SOAT so, int id_TipoServicio) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("update soat set TipoSoat = ?, "
                    + " Empresa = ?,"
                    + " Ciudad = ?,"
                    + " Fecha = ?,"
                    + " id_TipoServicio = ?,"
                    + " Precio = ?,"
                    + " where id_Soat = ?");
            
            pstm.setString(1, so.getClass().toString());
            pstm.setString(2, so.getEmpresa());
            pstm.setString(3, so.getCiudad());
            pstm.setString(4, so.getFecha().toString());
            pstm.setInt(5, id_TipoServicio);
            pstm.setDouble(6, so.getPrecio());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarSOAT(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from soat "
                    + " where id_Soat = ?");

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
