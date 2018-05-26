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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebas
 */


public class DatosVehiculo {
    
        Conexion c;
        public DatosVehiculo(String nombreBase , String login , String pasword) {
        c = new Conexion(nombreBase, login, pasword);
        
    }
    public void IngresarVehiculo(int id_usuario, int id_soat,int id_Aceite, int id_Ubicacion ,Vehiculo v){
        
        try {
            PreparedStatement insertar = c.getConexion().prepareStatement("insert into vehiculo("
                    + "id_Usuario,"
                    + "Placa,"
                    + "id_TipoVehiculo,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "Aceite,"
                    + "id_ubicacion) values(?,?,?,?,?,?,?,?,?)");
            
            insertar.setInt(1, id_usuario);
            insertar.setString(2, v.getPlaca());
            insertar.setString(3, v.getTipo());
            insertar.setInt(4, id_soat);
            insertar.setString(5, String.valueOf(v.getFechaUltimoMantenimiento()));
            insertar.setInt(6, v.getCilindraje());
            insertar.setInt(7, id_Aceite);
            insertar.setInt(8, id_Ubicacion);
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
                    + "id_TipoVehiculo,"
                    + "id_Soat,"
                    + "Mantenimiento,"
                    + "Cilindraje,"
                    + "Aceite,"
                    + "id_Ubicacion "
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
    
    public ArrayList<Vehiculo> vehiculosUsuarioById(int idUsuario){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        try {
            ResultSet rS = MostrarTabla();
            while(rS.next()){
                if(rS.getInt("id_Usario") == idUsuario){
                    switch(rS.getInt("id_TipoVehiculo")){
                        case 1:
                            Carro carro = new Carro();
                            vehiculos.add(carro);
                            break;
                        case 2:
                            Moto moto = new Moto();
                            vehiculos.add(moto);
                            break;
                        case 3:
                            Camion camion = new Camion();
                            vehiculos.add(camion);
                            break;
                        case 4:
                            Bus bus = new Bus();
                            vehiculos.add(bus);
                            break;              
                    }
                }
            }
        } catch (SQLException ex) {

        }
        
        return vehiculos;
    }

}