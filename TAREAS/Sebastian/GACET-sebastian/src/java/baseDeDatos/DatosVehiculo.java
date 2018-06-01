/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;


import Logica.EstacionGasolina.ACPM;
import Logica.EstacionGasolina.Combustible;
import Logica.EstacionGasolina.Gas;
import Logica.EstacionGasolina.Gasolina;
import Logica.Usuario.Usuario;
import Logica.Vehiculo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                    + "id_CombustibleV,"
                    + "id_TipoVehiculo) values(?,?,?,?,?,?,?,?,?)");
            
            // con vertir formato fecha
            Date fecha = v.getFechaUltimoMantenimiento().getTime();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            
            insertar.setInt(1, id_usuario);
            insertar.setString(2, v.getPlaca());
            insertar.setInt(3, id_soat);
            insertar.setString(4,formatoFecha.format(fecha));
            insertar.setInt(5, v.getCilindraje());
            insertar.setInt(6, id_Aceite);
            insertar.setInt(7, id_Ubicacion);
            insertar.setInt(8, id_CombustibleV);
            int idTipoVehiculo=0;
            switch(v.getTipo()){
                case "Moto":
                    idTipoVehiculo=2;
                    break;
                case "Carro":
                    idTipoVehiculo=1;
                    break;
                case "Camion":
                    idTipoVehiculo=3;
                    break;
                case "Bus":
                    idTipoVehiculo=4;
                    break;                
            }
            insertar.setInt(9,idTipoVehiculo);
            insertar.executeUpdate();
            
            System.out.println("se logro ingresar datos a vehiculo");
            
        } catch (SQLException e) {
            
            System.out.println("ERROR:Ingresar datos a vehiculo");
            System.out.println("vehiculo:"+e);
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
                    + "id_CombustibleV,"
                    + "id_TipoVehiculo "
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
        DatosSoat datosSoat = new DatosSoat("gacet", "root", "");
        DatosAceite datosAceite = new DatosAceite("gacet", "root", "");
        DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", "");
        
        try {
            ResultSet rS = MostrarTabla();
            while(rS.next()){
                if(rS.getInt("id_Usuario") == idUsuario){
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
                    while(rSVehiculo.next()){
                        vehiculo.setSoat(datosSoat.mostrarSOAT(rSVehiculo.getInt("id_Soat")));                    
                        vehiculo.setAceite(datosAceite.mostrarAceite(rSVehiculo.getInt("id_Aceite")));
                        vehiculo.setUbicacion(datosUbicacion.mostrarUbicacion(rSVehiculo.getInt("id_Ubicacion")));   
                        Combustible combustible;
                        switch(rSVehiculo.getInt("id_CombustibleV")){
                            case 1:
                                combustible = new ACPM();                                
                                break;
                            case 2:
                                combustible = new Gasolina();
                                break;
                            case 3:
                                combustible = new Gas();
                                break;

                            default:
                                combustible = new Gas();
                                break;
                        }
                        vehiculo.agregarCombustible(combustible);
                                    
                    }
                    
                    vehiculos.add(vehiculo);
                    
                }
            }
            System.out.println("se pudo encontrar vehiculos sin problema");
        } catch (SQLException ex) {
            
            System.out.println("error al encontrar vehiculos");
            System.out.println("Error encontrar vehiculos: "+ex);

        }
        
        return vehiculos;
    }
    
    /**
     * encuentra un vehiuclo por el id
     * @param id
     * @return un resulset del carro
     */
    public ResultSet encontrarVehiculo(int id) {
        ResultSet rS = null;
        try {
            PreparedStatement pstm = c.getConexion().prepareStatement("SELECT id_Vehiculo, "
                    + " id_Usuario, "
                    + " Placa, "
                    + " id_Soat, "
                    + " Mantenimiento, "
                    + " Cilindraje, "
                    + " id_Aceite, "
                    + " id_CombustibleV,"
                    + " id_Ubicacion "
                    + " FROM vehiculo "
                    + " WHERE id_Vehiculo = ? ");
            pstm.setInt(1, id);

            rS = pstm.executeQuery();
            System.out.println("se encontro vehiculo correctamente");

        } catch (SQLException ex) {
            System.out.println("Error encontrar vehiculo por id");
            System.out.println(ex+": error encontrar vehiculo");
        }
        return rS;
    }
    
    /**
     * actualizarVehiculo
     * @param id
     * @param v
     * @param id_usuario
     * @param id_soat
     * @param id_Aceite
     * @param id_Ubicacion
     * @param id_CombustibleV 
     */
    public void actualizarVehiculo(int id, int id_usuario, int id_soat,int id_Aceite, int id_Ubicacion , int id_CombustibleV,Vehiculo v) {
        
        
        try {            
            PreparedStatement insertar = c.getConexion().prepareStatement("update vehiculo set "
                    + "id_Usuario = ?,"
                    + "Placa = ?,"
                    + "id_Soat = ?,"
                    + "Mantenimiento = ?,"
                    + "Cilindraje = ?,"
                    + "id_Aceite = ?,"
                    + "id_Ubicacion = ?,"                    
                    + "id_CombustibleV = ?,"
                    + "id_TipoVehiculo=? "                    
                    + "where id_Vehiculo = ?");
            
            
            // con vertir formato fecha
            Date fecha = v.getFechaUltimoMantenimiento().getTime();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            
            insertar.setInt(1, id_usuario);
            insertar.setString(2, v.getPlaca());
            insertar.setInt(3, id_soat);
            insertar.setString(4,formatoFecha.format(fecha));
            insertar.setInt(5, v.getCilindraje());
            insertar.setInt(6, id_Aceite);
            insertar.setInt(7, id_Ubicacion);
            insertar.setInt(8, id_CombustibleV);
            int idTipoVehiculo=0;
            switch(v.getTipo()){
                case "Moto":
                    idTipoVehiculo=2;
                    break;
                case "Carro":
                    idTipoVehiculo=1;
                    break;
                case "Camion":
                    idTipoVehiculo=3;
                    break;
                case "Bus":
                    idTipoVehiculo=4;
                    break;                
            }
            insertar.setInt(9,idTipoVehiculo);
            insertar.setInt(10, id);
            insertar.executeUpdate();
            System.out.println("Actualizacion correcta vehiculo9");

        } catch (SQLException e) {
            System.out.println("error actualizar vehiuclo: "+e);
        }

    }
    
    public GregorianCalendar desglosarFecha(String fecha){
        
        int anio = Integer.parseInt(fecha.substring(6));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int dia = Integer.parseInt(fecha.substring(0,2));
        
        GregorianCalendar fechaMante = new GregorianCalendar(anio, mes, dia);
        
        return fechaMante;
    }
    

}