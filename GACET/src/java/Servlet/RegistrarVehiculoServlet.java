/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;



import Logica.Aceite.Aceite;
import Logica.EstacionGasolina.*;
import Logica.SOAT.*;
import Logica.Ubicacion.Ubicacion;
import Logica.Usuario.Usuario;
import Logica.Vehiculo.*;
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
public class RegistrarVehiculoServlet extends HttpServlet {

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
        Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
        int idUsuario = Integer.parseInt(request.getSession().getAttribute("id").toString());
        Vehiculo vehiculo;        
        SOAT soat;
        Combustible combustible;
        Aceite aceite = new Aceite();
        DatosVehiculo datosVehiculo = new DatosVehiculo("gacet", "root", "root");
        DatosSoat datosSoat = new DatosSoat("gacet", "root", "root");
        DatosAceite datosAceite = new DatosAceite("gacet", "root", "root");
        DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", "root");
        
        
        
        //setear datos vehiculo
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
        
        datosSoat.ingresarSOAT(soat);
        int idSoat = datosSoat.getIdRegistroActual();
        System.out.println(idSoat+" idSoat");
        
        
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
        
        
        // setear datos aceite
        aceite.setMarca(request.getParameter("marca"));       
        aceite.setTipo(vehiculo.getTipo());       
        aceite.setKmCambioAceite(Integer.parseInt(request.getParameter("kmMaximoAceite")));   
        aceite.setCaracteristica(request.getParameter("referenciaAceite"));
        
        datosAceite.ingresarAceite(aceite);
        int idAceite = datosAceite.getIdRegistroActual();
        System.out.println(idAceite+" idAceite");
        vehiculo.setAceite(aceite);
        Ubicacion ubicacion = new Ubicacion();
        ubicacion.setDireccion("no registrada");
        ubicacion.setLatitud(0);
        ubicacion.setLongitud(0);
        datosUbicacion.IngresarUbicacion(ubicacion);
        int idUbicacion = datosUbicacion.getIdRegistroActual();
        System.out.println(idUbicacion+" idUbicacion");
        datosVehiculo.IngresarVehiculo(idUsuario,idSoat, idAceite, idUbicacion, id_combustible, vehiculo);
        
        usuario.agregarVehiculo(vehiculo);
        
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
            out.println("<h1>"+"Vehiculo con placas "+vehiculo.getPlaca()+" registrado correctamente</h1>");
            out.println("</body>");
            out.println("</html>"); 
        }
    }
    
    public GregorianCalendar desglosarFecha(String fecha){
        
        int anio = Integer.parseInt(fecha.substring(0,4));
        int mes = Integer.parseInt(fecha.substring(5,7));
        int dia = Integer.parseInt(fecha.substring(8));
        
        GregorianCalendar fechaMante = new GregorianCalendar(anio, mes, dia);
        
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
