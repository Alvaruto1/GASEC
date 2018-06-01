/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Comentario.Comentario;
import Logica.Usuario.Usuario;
import baseDeDatos.DatosComentarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvar
 */
public class EstacionServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int id;
        Comentario comentario = new Comentario();
        DatosComentarios datosComentarios = new DatosComentarios("gacet", "root", "root");
        if(request.getSession().getAttribute("id")!=null){
            id = Integer.parseInt(request.getSession().getAttribute("usuario").toString());
            comentario.setIdUsuario(id);
            comentario.setCalificacion(Integer.parseInt(request.getParameter("calificacion")));
            comentario.setMensaje(request.getParameter("comentario"));
            datosComentarios.IngresarComentario(comentario, Integer.parseInt(request.getParameter("idEstacion")));                      
        }
        
        
        
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Comentario</title>");   
            //tiempo de demorar en la pagina
            out.println("<meta http-equiv=\"Refresh\" content=\"2;url="+"Prueba.jsp"+"\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+"su comentario se ha realizado correctamente"+"</h1>");
            out.println("</body>");
            out.println("</html>");          
            
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
