/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;


import Logica.Vehiculo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Sebas
 */


public class DatosVehiculo {
    
        Conexion c;
        public DatosVehiculo(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarVehiculo(int id_usuario, int id_soat,int id_Aceite, int id_Ubicacion , int id_CombustibleV,Vehiculo v){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into vehiculo("
                    + "id_Usuario,"
                    + "Placa,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "id_Aceite,"
                    + "id_Ubicacion,"                    
                    + "id_CombustibleV) values(?,?,?,?,?,?,?,?)");
            
            insertar.setInt(1, id_usuario);
            insertar.setString(2, v.getPlaca());
            insertar.setInt(3, id_soat);
            insertar.setString(4, v.getFechaUltimoMantenimiento().toString());
            insertar.setInt(5, v.getCilindraje());
            insertar.setInt(6, id_Aceite);
            insertar.setInt(7, id_Ubicacion);
            insertar.setInt(8, id_CombustibleV);
            insertar.executeUpdate();
            
            System.out.println("se logro ingresar datos a vehiculo");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a vehiculo");
        }
        
        
    }
    
    public ResultSet MostrarTabla(){
        ResultSet tabla = null;
        
        try {
            
            
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Vehiculo, "
                    + "id_Usuario,"
                    + "Placa,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "id_Aceite,"
                    + "id_Ubicacion,"                    
                    + "id_CombustibleV "
                    + "FROM Vehiculo "
                    + "ORDER BY id_Vehiculo");
            
            
            tabla = pstm.executeQuery();
            
            System.out.println("Se logro mostrar la tabla vehiculo " );
            
        } catch (SQLException ex) {
            System.out.println("Error: Mostrar tabla vehiculo ");
        }
        return tabla;
        
    }
    
    public void borrarVehiculo(int id) {

        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("delete from vehiculo "
                    + " where id_Vehiculo = ?");

            pstm.setInt(1, id);

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se ha logrado borrar el contacto de Vehiculo");
        }


    }  
    
    /**
     * recupera todos los vehiculos de un usuario
     * @param idUsuario
     * @return arreglo de vehiculos
     */
    public ArrayList<Vehiculo> vehiculosUsuarioById(int idUsuario){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo vehiculo;
        //conexiones tablas
        DatosSoat datosSoat = new DatosSoat("gacet", "root", "root");
        DatosAceite datosAceite = new DatosAceite("gacet", "root", "root");
        DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", "root");
        
        try {
            ResultSet rS = MostrarTabla();
            while(rS.next()){
                if(rS.getInt("id_Usario") == idUsuario){
                    switch(rS.getInt("id_TipoVehiculo")){
                        case 1:
                            vehiculo = new Carro();
                            break;
                        case 2:
                            vehiculo = new Moto();
                            break;
                        case 3:
                            vehiculo = new Camion();                            
                            break;
                        case 4:
                            vehiculo = new Bus();                            
                            break;  
                        default:
                            vehiculo = new Bus(); 
                            break;
                    }
                    
                    // adicionar atributos del vehiculo
                    vehiculo.setId(rS.getInt("id_Vehiculo"));
                    vehiculo.setFechaUltimoMantenimiento(desglosarFecha(rS.getString("Mantenimiento")));
                    vehiculo.setPlaca(rS.getString("Placa"));
                    vehiculo.setCilindraje(rS.getInt("Cilindraje"));                    
                    
                    
                    // conexion tipo de vehiculo                    
                    ResultSet rSVehiculo = encontrarVehiculo(rS.getInt("id_Vehiculo"));
                    vehiculo.setSoat(datosSoat.mostrarSOAT(rSVehiculo.getInt("id_Soat")));                    
                    vehiculo.setAceite(datosAceite.mostrarAceite(rSVehiculo.getInt("id_Aceite")));
                    vehiculo.setUbicacion(datosUbicacion.mostrarUbicacion(rSVehiculo.getInt("id_Ubicacion")));
                    
                    vehiculos.add(vehiculo);
                    
                }
            }
        } catch (SQLException ex) {

        }
        
        return vehiculos;
    }
    
    /**
     * encuentra un vehiuclo por el id
     * @param id
     * @return un resulset del carro
     * @throws SQLException 
     */
    public ResultSet encontrarVehiculo(int id) throws SQLException {
        
        PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Vehiculo, "
                + " id_Usuario, "
                + " Placa, "
                + " id_Soat, "
                + " Mantenimiento, "
                + " Cilindraje, "
                + " id_Aceite, "
                + " id_Ubicacion)"
                + " FROM vehiculo "
                + " WHERE id_Vehiculo = ? ");
        pstm.setInt(1, id);

        ResultSet rS = pstm.executeQuery();
        return rS;
    }
    
    public GregorianCalendar desglosarFecha(String fecha){
        
        int anio = Integer.parseInt(fecha.substring(0,4));
        int mes = Integer.parseInt(fecha.substring(5,7));
        int dia = Integer.parseInt(fecha.substring(8));
        
        GregorianCalendar fechaMante = new GregorianCalendar(anio, mes, dia);
        
        return fechaMante;
    }
    

}