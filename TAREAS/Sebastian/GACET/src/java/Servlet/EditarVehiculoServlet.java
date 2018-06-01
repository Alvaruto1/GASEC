/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Aceite.Aceite;
import Logica.EstacionGasolina.ACPM;
import Logica.EstacionGasolina.Combustible;
import Logica.EstacionGasolina.Gas;
import Logica.EstacionGasolina.Gasolina;
import Logica.SOAT.SOAT;
import Logica.SOAT.SOATBus;
import Logica.SOAT.SOATCamion;
import Logica.SOAT.SOATCarro;
import Logica.SOAT.SOATMoto;
import Logica.Ubicacion.Ubicacion;
import Logica.Usuario.Usuario;
import Logica.Vehiculo.Bus;
import Logica.Vehiculo.Camion;
import Logica.Vehiculo.Carro;
import Logica.Vehiculo.Moto;
import Logica.Vehiculo.Vehiculo;
import baseDeDatos.DatosAceite;
import baseDeDatos.DatosSoat;
import baseDeDatos.DatosUbicacion;
import baseDeDatos.DatosVehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvar
 */
public class EditarVehiculoServlet extends HttpServlet {

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
        
        Usuario usuario = null;
        DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", "root");
        DatosVehiculo datosVehiculo = new DatosVehiculo("gacet", "root", "root"); 
        DatosAceite datosAceite = new DatosAceite("gacet", "root", "root"); 
        DatosSoat datosSoat = new DatosSoat("gacet", "root", "root");
        Vehiculo vehiculo = null;
        SOAT soat = null;
        Aceite aceite = new Aceite();
        Combustible combustible = null;
        int idVehiculo=0;
        int idUsuario=0;
        if(request.getSession().getAttribute("usuario")!=null){
            usuario = (Usuario) request.getSession().getAttribute("usuario"); 
            idUsuario= Integer.parseInt(request.getSession().getAttribute("id").toString());
            if(request.getSession().getAttribute("vehiculoActual") !=null){
                idVehiculo = ((Vehiculo)request.getSession().getAttribute("vehiculoActual")).getId();                
            }
        }
        
        else{
            response.sendRedirect("iniciarSesion.jps");
        }
                
        switch(Integer.parseInt(request.getParameter("vehiculo"))){
                case 1:
                    vehiculo = new Carro();   
                    soat= new SOATCarro();

                    break;
                case 2:
                    vehiculo = new Moto();
                    soat= new SOATMoto();

                    break;
                case 3:
                    vehiculo = new Camion();
                    soat = new SOATCamion();
                    break;
                case 4:
                    vehiculo = new Bus();  
                    soat = new SOATBus();
                    break;

                default:
                    vehiculo = new Bus(); 
                    soat = new SOATBus();
            }        
            vehiculo.setPlaca(request.getParameter("placa"));
            String fecha = request.getParameter("fecha");        
            vehiculo.setFechaUltimoMantenimiento(desglosarFecha(fecha));        
            vehiculo.setCilindraje(Integer.parseInt(request.getParameter("cilindraje")));

            //setear datos soat
            String fechaS = request.getParameter("fechaS");
            soat.setFecha(desglosarFecha(fechaS));            
            soat.setEmpresa(request.getParameter("empresa"));        
            soat.setCiudad(request.getParameter("ciudad"));        
            soat.setTipoDeServicio(Integer.parseInt(request.getParameter("tipoServicio")));

            
            int idSoat = datosSoat.encontrarIdSoatPorVehiculo(idVehiculo);
            datosSoat.actualizarSOAT(idSoat, soat);
            
            System.out.println(idSoat+" idSoat");
            
            vehiculo.setSoat(soat);

            int id_combustible=0;
            //setear dato combustible
            switch(Integer.parseInt(request.getParameter("tipoCombustible"))){
                case 1:
                    combustible = new ACPM();
                    id_combustible = 1;
                    break;
                case 2:
                    combustible = new Gasolina();
                    id_combustible = 2;
                    break;
                case 3:
                    combustible = new Gas();
                    id_combustible = 3;
                    break;

                default:
                    combustible = new Gas();
                    break;
            } 

            vehiculo.agregarCombustible(combustible);  
            
            System.out.println("combustibel: "+vehiculo.getCombustible().get(0).getTipo());


            // setear datos aceite
            aceite.setMarca(request.getParameter("marca"));       
            aceite.setTipo(vehiculo.getTipo());       
            aceite.setKmCambioAceite(Integer.parseInt(request.getParameter("kmMaximoAceite")));   
            aceite.setCaracteristica(request.getParameter("referenciaAceite"));
            
                        
            
            int idAceite = datosAceite.encontrarIdAceitePorVehiculo(idVehiculo);
            datosAceite.actualizarAceite(idAceite, aceite);
            
            
            vehiculo.setAceite(aceite);
            Ubicacion ubicacion = new Ubicacion();
            ubicacion.setDireccion("no registrada");
            ubicacion.setLatitud(0);
            ubicacion.setLongitud(0);
            
            
            int idUbicacion = datosUbicacion.encontrarIdUbicacionPorVehiculo(idVehiculo);
            datosUbicacion.actualizarUbicacion(idUbicacion, ubicacion);
           
            datosVehiculo.actualizarVehiculo(idVehiculo,idUsuario,idSoat, idAceite, idUbicacion, id_combustible, vehiculo);

            usuario.getVehiculo().clear();
            usuario.setVehiculo(datosVehiculo.vehiculosUsuarioById(idUsuario));    
            
            
            
            
            request.getSession().setAttribute("vehiculoActual",vehiculo);
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro Vehiuclo</title>");   
            //tiempo de demorar en la pagina
            out.println("<meta http-equiv=\"Refresh\" content=\"2;url="+"gacet.jsp"+"\">");
            out.println("</head>");
            out.println("<body>");
            if(usuario !=null){
                out.println("<h1>"+"Vehiculo con placas "+vehiculo.getPlaca()+" fue editado correctamente</h1>");                
            }            
            
            out.println("</body>");
            out.println("</html>"); 
        }
    }
    
    public GregorianCalendar desglosarFecha(String fecha){
        
        int anio = Integer.parseInt(fecha.substring(0,4));
        int mes = Integer.parseInt(fecha.substring(5,7));
        int dia = Integer.parseInt(fecha.substring(8));
        GregorianCalendar fechaMante = new GregorianCalendar(anio, mes-1, dia-1);
        
        return fechaMante;
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
