package baseDeDatos;

import Logica.EstacionGasolina.Combustible;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Nicolas Herrera Rubiano
 */
public class DatosCombustibleVehiculo {
    
     Conexion c;

    public DatosCombustibleVehiculo(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
    
    }
    
    public void ingresarCombustibleVehiculo(Combustible co){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into combustiblev("
                    + " Tipo, "
                    + " Caracteristica) "
                    + " values(?,?)");
            
            insertar.setString(1, co.getTipo());
            insertar.setString(2, co.getCaracteristica());     
            
            
            insertar.executeUpdate();
            
            System.out.println("Se guardaro el combustibleV correctamente");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a combustibleV");
            System.out.println("combustibleV:"+e);
        }
        
        
    }
    
    public ResultSet mostrarCombustibleVehiculo(int id) throws SQLException {
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_CombustibleV, "
                 + " Tipo, "
                 + " Caracteristica) "
                 + " FROM combustiblev "
                 + " WHERE id_CombustibleV = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    
    public void actualizarCombustibleVehiculo(Combustible co) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("update combustiblev set Tipo = ?, "
                    + " Caracteristica = ?,"
                    + " where id_CombustibleV = ?");
            
            pstm.setString(1, co.getTipo());
            pstm.setString(2, co.getCaracteristica());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    /**
     * obtener ide de combustible por vehiculo
     * @param idVehiculo
     * @return 
     */
    public int encontrarIdCombustiblePorVehiculo(int idVehiculo){
        int id=0;
        try {
            PreparedStatement pS = c.getConexion().prepareStatement("SELECT id_CombustibleV FROM soat where id_vehiculo=?");
            ResultSet rS = pS.executeQuery();
            while(rS.next()){
                id = rS.getInt("id_CombustibleV");
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar buscar id soat: "+ex);
        }
        
        return id;
    }

    public void borrarCombustibleVehiculo(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from combustiblev "
                    + " where id_CombustibleV = ?");

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
