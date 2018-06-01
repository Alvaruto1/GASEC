package baseDeDatos;

import Logica.SOAT.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Nicolas Herrera Rubiano
 */
public class DatosSoat {

    Conexion c;
    
    private int idRegistroActual;

    public DatosSoat(String nombreBase, String login, String pasword) {
        c = new Conexion(nombreBase, login, pasword);

    }

    public void ingresarSOAT(SOAT so) {

        try {
            
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into soat("
                    + " TipoSoat, "
                    + " Empresa, "
                    + " Ciudad, "
                    + " Fecha, "
                    + " id_TipoServicio, "
                    + " Precio) "
                    + " values(?,?,?,?,?,?)");
            
            // con vertir formato fecha
            Date fecha = so.getFecha().getTime();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            
            insertar.setString(1, so.getClass().toString());
            insertar.setString(2, so.getEmpresa());
            insertar.setString(3, so.getCiudad());
            insertar.setString(4, formatoFecha.format(fecha));
            insertar.setInt(5, so.getTipoDeServicio());
            insertar.setDouble(6, so.getPrecio());
            insertar.executeUpdate();
            this.idRegistroActual = idUltimoRegistrosSOAT();
            System.out.println("Se guardo soat correctamente");

        } catch (SQLException e) {

            System.out.println("ERROR:Ingresar datos a soat");
            System.out.println("soat:"+e);
        }

    }

    public int getIdRegistroActual() {
        return idRegistroActual;
    }

    public void setIdRegistroActual(int idRegistroActual) {
        this.idRegistroActual = idRegistroActual;
    }
    
    

    /**
     * devuelve el id del ultimo registro 
     * @return entero
     * @throws SQLException 
     */
    public int idUltimoRegistrosSOAT() throws SQLException{
        int ultimo=0;
        
        PreparedStatement pstm =c.getConexion().prepareStatement("SELECT * FROM soat");        
        ResultSet rS = pstm.executeQuery();
        while(rS.next()){
            ultimo = rS.getInt("id_Soat");
        }
        
        return ultimo;
        
    }
    
    /**
     * obtener ide de soat por vehiculo
     * @param idVehiculo
     * @return 
     */
    public int encontrarIdSoatPorVehiculo(int idVehiculo){
        int id=0;
        try {
            PreparedStatement pS = c.getConexion().prepareStatement("SELECT id_Soat FROM vehiculo where id_Vehiculo = ?");
            pS.setInt(1, idVehiculo);
            ResultSet rS = pS.executeQuery();
            
            
            while(rS.next()){
                id = rS.getInt("id_Soat");
                
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar buscar id soat: "+ex);
        }
        
        return id;
    }
    
    public SOAT mostrarSOAT(int id) {
        SOAT soat = null;
        try {
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Soat, "
                    + " TipoSoat, "
                    + " Empresa, "
                    + " Ciudad, "
                    + " Fecha, "
                    + " id_TipoServicio, "
                    + " Precio "
                    + " FROM soat "
                    + " WHERE id_Soat = ? ");
            pstm.setInt(1, id);  
            
            ResultSet rS = pstm.executeQuery();
            
            while(rS.next()){
                switch(rS.getString("TipoSoat")){
                    case "SOATMoto":
                        soat = new SOATMoto();
                        break;
                    case "SOATCarro":
                        soat = new SOATCarro();
                        break;
                    case "SOATBus":
                        soat = new SOATBus();
                        break;
                    case "SOATCamion":
                        soat = new SOATCamion();
                        break;
                    default:
                        soat = new SOATCamion();
                        break;
                }
                
                soat.setCiudad(rS.getString("Ciudad"));
                soat.setEmpresa("Empresa");
                soat.setFecha(desglosarFecha(rS.getString("Fecha")));
                
                
                soat.setPrecio(rS.getDouble("Precio"));
                soat.setTipoDeServicio(rS.getInt("id_TipoServicio"));
                
                
            }
            
            System.out.println("Se mostro soat correctamente");
            
            
        } catch (SQLException ex) {
            System.out.println("ERROR:Mostrar soat");
            System.out.println("soat:"+ex);
        }
        return soat;
    }

    public void actualizarSOAT(int id,SOAT so) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("update soat set TipoSoat = ?, "
                    + " Empresa = ?,"
                    + " Ciudad = ?,"
                    + " Fecha = ?,"
                    + " id_TipoServicio = ?,"
                    + " Precio = ? "
                    + " where id_Soat = ?");
            Date fecha = so.getFecha().getTime();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            pstm.setString(1, so.getClass().toString());
            pstm.setString(2, so.getEmpresa());
            pstm.setString(3, so.getCiudad());
            pstm.setString(4, formatoFecha.format(fecha));
            pstm.setInt(5, so.getTipoDeServicio());
            pstm.setDouble(6, so.getPrecio());
            pstm.setInt(7, id);
            pstm.executeUpdate();
            System.out.println("Se actualizo correctamente el soat");
        } catch (SQLException e) {
            System.out.println("Error actuzaliar soat"+e);
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
    
    
    public GregorianCalendar desglosarFecha(String fecha){
        
        int anio = Integer.parseInt(fecha.substring(6));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int dia = Integer.parseInt(fecha.substring(0,2));
        
        GregorianCalendar fechaMante = new GregorianCalendar(anio, mes, dia);
        
        return fechaMante;
    }

}
