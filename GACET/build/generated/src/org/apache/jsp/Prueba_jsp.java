package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import baseDeDatos.DatosUbicacionMapa;
import java.text.SimpleDateFormat;
import java.util.Date;
import Logica.Comentario.Comentario;
import java.util.ArrayList;
import baseDeDatos.DatosComentarios;
import javax.management.relation.RelationNotFoundException;
import baseDeDatos.DatosEstacion;
import java.sql.ResultSet;
import baseDeDatos.DatosUbicacion;

public final class Prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-3.2.1.js\"></script>\r\n");
      out.write("  <link href=\"css/jquery.gmaps.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/comentarios.css\"/>\r\n");
      out.write("  <script src=\"js/jquery.gmaps.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <style>\r\n");
      out.write("       \r\n");
      out.write("      .gmaps {\r\n");
      out.write("      height:500px;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      </style>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <form id=\"formulario\" runat=\"server\">\r\n");
      out.write("      \r\n");
      out.write("      <div data-key=\"AIzaSyBoDcMaMDDNmggoN7t-Y6fyr6LCGd_UPB4\"\r\n");
      out.write("      data-control-zoom=\"true\"\r\n");
      out.write("      data-control-type=\"true\"\r\n");
      out.write("      data-control-scale=\"true\"\r\n");
      out.write("      data-control-streetview=\"true\"\r\n");
      out.write("      data-control-rotate=\"true\"\r\n");
      out.write("      data-event-mousewheel=\"true\"\r\n");
      out.write(" \r\n");
      out.write("      data-zoom=\"20\" role=\"map\" class=\"gmaps\">\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          ");
   
             
              
              int idEstacion;
              DatosUbicacionMapa datosUbicacion = new DatosUbicacionMapa("gacet", "root", ""); 
              DatosEstacion datosEstacion = new DatosEstacion("gacet", "root", "");
              ResultSet rSUbicacion = datosUbicacion.MostrarTabla();
              
              
              while(rSUbicacion.next()){
                  
                  
              idEstacion= rSUbicacion.getInt("id_UbicacionMapa");
              
              ResultSet rSEstaciones = datosEstacion.sacarEstacion(idEstacion);
              
              
              
          
      out.write("\r\n");
      out.write("      \r\n");
      out.write("          \r\n");
      out.write("          <div\r\n");
      out.write("          data-id=\"");
      out.print( rSUbicacion.getInt("id_UbicacionMapa"));
      out.write("\"\r\n");
      out.write("          data-lat=\"");
      out.print( rSUbicacion.getDouble("Latitud"));
      out.write("\"\r\n");
      out.write("          data-lng=\"");
      out.print( rSUbicacion.getDouble("Longitud"));
      out.write("\"\r\n");
      out.write("          class=\"marker\">\r\n");
      out.write("          <div class=\"map-card\">\r\n");
      out.write("          <p>Address: ");
      out.print( rSUbicacion.getString("Direccion"));
      out.write("</p>\r\n");
      out.write("          \r\n");
      out.write("          ");
 
           while(rSEstaciones.next()){
          
          
      out.write("\r\n");
      out.write("            \r\n");
      out.write("<!----------------------------------------COmentario------------------------------------------------------>            \r\n");
      out.write("            <div class=\"contPrincipal\">          \r\n");
      out.write("                                    \r\n");
      out.write("            <form action=\"EstacionServlet\" method=\"post\">\r\n");
      out.write("                <div class=\"contPanel\">\r\n");
      out.write("                    <div class=\"contTitulo\">\r\n");
      out.write("                        <h1 class=\"titulo\">Estacion ");
      out.print(idEstacion);
      out.write("</h1>\r\n");
      out.write("                        <input type=\"hidden\" id=\"idEstacion\" name=\"idEstacion\" value=\"");
      out.print(idEstacion);
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"contForm\">\r\n");
      out.write("                        <p> Marca:");
      out.print( rSEstaciones.getString("Marca"));
      out.write(" </p>\r\n");
      out.write("                        <p> Puestos:");
      out.print( rSEstaciones.getInt("Puestos"));
      out.write("</p>\r\n");
      out.write("                        <p> Valoracion:");
      out.print( rSEstaciones.getInt("Valoracion"));
      out.write("</p>\r\n");
      out.write("                        <div class=\"fila\">\r\n");
      out.write("                            <div>Calificacion:</div>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"1\" checked=\"checked\">1\r\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"2\">2\r\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"3\">3\r\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"4\">4\r\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"5\">5\r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"contTitulo\">\r\n");
      out.write("                        <h1 class=\"titulo\">Comentarios</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"contComentarios\">\r\n");
      out.write("                        ");
  ArrayList<Comentario> comentarios;
                            DatosComentarios datosComentarios = new DatosComentarios("gacet", "root", "");
                            comentarios = datosComentarios.comentariosEstacionById(idEstacion);
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        ");

                            for(Comentario c: comentarios){
                                
                            
                        
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                       <div class=\"comentario\">\r\n");
      out.write("                            <div>Id usuario: ");
      out.print(c.getIdUsuario() );
      out.write("</div>\r\n");
      out.write("                            <div>Fecha:</div>\r\n");
      out.write("                            ");

                                Date fecha = c.getFecha();
                                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                            
      out.write("\r\n");
      out.write("                            <div class=\"fecha\">");
      out.print( formato.format(fecha) );
      out.write("</div>\r\n");
      out.write("                            <div>Comentario: ");
      out.print( c.getMensaje() );
      out.write("</div>\r\n");
      out.write("                            <div>Calificacion: ");
      out.print( c.getCalificacion() );
      out.write("</div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                            \r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"agregarComentario\">\r\n");
      out.write("                        <div class=\"titulo\">Comentario</div>\r\n");
      out.write("                        <div>\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"text\" id=\"comentario\" name=\"comentario\" required></textarea>\r\n");
      out.write("                                <input type=\"submit\" id=\"enviar\" name=\"enviar\" value=\"Enviar\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>                            \r\n");
      out.write("        </div>\r\n");
      out.write("<!--------------------------------------------------------------------------------------------------------------->\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("          ");

              }
            }

       
          
      out.write("\r\n");
      out.write("    \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("          <a href=\"gacet.jsp\">Regresar</a>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("      $('.gmaps').gmaps();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/DatosMapa.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
