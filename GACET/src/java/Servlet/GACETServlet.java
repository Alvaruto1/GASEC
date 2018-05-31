/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Usuario.Usuario;
import Logica.Vehiculo.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvar
 */
public class GACETServlet extends HttpServlet {

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
        //int caso = Integer.parseInt(request.getParameter("caso"));
        Usuario usuario=(Usuario) request.getSession().getAttribute("usuario");
        ArrayList<Vehiculo> vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
        int id;
        if(request.getParameter("posVehiActual")!=null){
            id= Integer.parseInt(request.getParameter("posVehiActual"));
            Vehiculo vehiculoActual = vehiculos.get(id);
            response.getWriter().println("{\"combustible\": \""+vehiculoActual.getCombustible().get(0).getTipo()
                    +"\", \"aceite\": \""+vehiculoActual.getAceite().getMarca()+"\", \"descripcion\": \""
                    +vehiculoActual.getAceite().getCaracteristica()+"\", \"placa\": \""+vehiculoActual.getPlaca()+"\", \"tipo\":\""+vehiculoActual.getTipo()+"\"}");
            request.getSession().setAttribute("vehiculoActual", vehiculoActual);            
        }
        
        
//        switch(caso){
//            case 0: 
//                
//                break;
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                //response.sendRedirect("gacet.jsp");                
//                break;            
//        }
        
        
        if(request.getParameter("caso")!=null){
            if(Integer.parseInt(request.getParameter("caso"))==0){
                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Cerrar sesion</title>");   
                    //tiempo de demorar en la pagina
                    out.println("<meta http-equiv=\"Refresh\" content=\"2;url="+"gacet.jsp"+"\">");
                    out.println("</head>");
                    out.println("<body>");

                    out.println("<h1>"+"Ha cerrado su sesion, gracias por visitarnos "+usuario.getNombre()+"</h1>");                


                    out.println("</body>");
                    out.println("</html>");
                }
                request.getSession().invalidate(); 
                response.sendRedirect("iniciarSesion.jsp");
                               
            }
            
            
        }
        
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
