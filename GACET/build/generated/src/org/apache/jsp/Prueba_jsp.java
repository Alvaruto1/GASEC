package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-3.2.1.js\"></script>\r\n");
      out.write("  <link href=\"css/jquery.gmaps.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <script src=\"js/jquery.gmaps.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
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
      out.write("      data-event-mousewheel=\"true\" \r\n");
      out.write("      data-zoom=\"20\" role=\"map\" class=\"gmaps\">\r\n");
      out.write("          ");
 
              int id;
              DatosUbicacion datosUbicacion = new DatosUbicacion("gacet", "root", ""); 
              DatosEstacion datosEstacion = new DatosEstacion("gacet", "root", "");
              ResultSet rS = datosUbicacion.MostrarTabla();
              
              double lat= Double.parseDouble(request.getSession().getAttribute("Latitud").toString());
              double lon= Double.parseDouble(request.getSession().getAttribute("Longitud").toString());
              
              while(rS.next()){
                  
              id= rS.getInt("id_Ubicacion");
              
              ResultSet datos = datosEstacion.sacarEstacion(id);
          
      out.write("\r\n");
      out.write("      \r\n");
      out.write("          \r\n");
      out.write("          <div\r\n");
      out.write("          data-id=\"");
      out.print( rS.getInt("id_Ubicacion"));
      out.write("\"\r\n");
      out.write("          data-lat=\"");
      out.print( rS.getDouble("Latitud"));
      out.write("\"\r\n");
      out.write("          data-lng=\"");
      out.print( rS.getDouble("Longitud"));
      out.write("\"\r\n");
      out.write("          class=\"marker\">\r\n");
      out.write("          <div class=\"map-card\">\r\n");
      out.write("          <p>Address: ");
      out.print( rS.getString("Direccion"));
      out.write("</p>\r\n");
      out.write("          \r\n");
      out.write("          ");
 
           while(datos.next()){
          
          
      out.write("\r\n");
      out.write("            <p> Marca:");
      out.print( datos.getString("Marca"));
      out.write(" </p>\r\n");
      out.write("            <p> Puestos:");
      out.print( datos.getInt("Puestos"));
      out.write("</p>\r\n");
      out.write("            <p> Valoracion:");
      out.print( datos.getInt("Valoracion"));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          ");

              }
            }

       
          
      out.write("\r\n");
      out.write("    \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("      $('.gmaps').gmaps();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/Mapa.js\"></script>\r\n");
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
