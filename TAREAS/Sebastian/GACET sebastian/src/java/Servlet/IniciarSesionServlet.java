/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Usuario.Usuario;
import Logica.Vehiculo.Vehiculo;
import baseDeDatos.DatosUsuario;
import baseDeDatos.DatosVehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvar
 */
public class IniciarSesionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String usuarioAlias = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        DatosUsuario datosUsuario = new DatosUsuario("gacet","root","Hola12345"); 
        DatosVehiculo datosVehiculo = new DatosVehiculo("gacet","root","Hola12345");
        ResultSet rS = datosUsuario.MostrarTabla();
        String mensaje="";
        String url="";
        Usuario usuario = new Usuario();
        
        
        
        int id=0;
        
        // obtener tabla de usuarios
        try {
            while(rS.next()){
                //comparar usaurio con base de datos
                if(rS.getString("Alias").equals(usuarioAlias)){ 
                    // comparar contraseña con base de datos
                    if(rS.getString("Contrasenia").equals(contrasenia)){                       
                        id=rS.getInt("id_Usuario");
                        mensaje = "Usuario logueado correctamente";
                        url="gacet.jsp";                        
                        usuario.setAlias(rS.getString("Alias"));
                        usuario.setNombre(rS.getString("Nombre"));
                        usuario.setEdad(rS.getInt("Edad"));
                        usuario.setEmail(rS.getString("Email"));
                        usuario.setContrasenia(rS.getString("Contrasenia"));
                        if(datosVehiculo.vehiculosUsuarioById(id)!=null){
                            usuario.setVehiculo(datosVehiculo.vehiculosUsuarioById(id));  
                            for(Vehiculo v: usuario.getVehiculo()){
                                v.getPlaca();
                            }
                            System.out.println("entra si ono");
                        }                        
                        request.getSession().setAttribute("usuario", usuario);
                        request.getSession().setAttribute("id",id);
                        
                        break;
                    }
                    else{
                        mensaje = "Contraseña incorrecta";  
                        url="iniciarSesion.jsp";
                    }                                        
                }
                else{
                    mensaje = "Usuario incorrecto";
                    url="iniciarSesion.jsp";
                } 
                
            }
        } catch (SQLException ex) {
            mensaje= "error en el ingreso";
            url="iniciarSesion.jps";
        }
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Iniciar Sesion</title>");   
            //tiempo de demorar en la pagina
            out.println("<meta http-equiv=\"Refresh\" content=\"2;url="+url+"\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+mensaje+"</h1>");
            out.println("</body>");
            out.println("</html>");          
            
        }
        
        
    }
    
    void obtenerVehiculos(){
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
