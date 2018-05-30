package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-3.2.1.js\"></script>\n");
      out.write("  <link href=\"css/jquery.gmaps.css\" rel=\"stylesheet\" />\n");
      out.write("  <script src=\"js/jquery.gmaps.js\"></script>\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("       \n");
      out.write("      .gmaps {\n");
      out.write("      height:500px;\n");
      out.write("      width: 100%;\n");
      out.write("      }\n");
      out.write("      </style>\n");
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <form id=\"formulario\" runat=\"server\">\n");
      out.write("      \n");
      out.write("      <div data-key=\"AIzaSyBoDcMaMDDNmggoN7t-Y6fyr6LCGd_UPB4\"\n");
      out.write("      data-control-zoom=\"true\"\n");
      out.write("      data-control-type=\"true\"\n");
      out.write("      data-control-scale=\"true\"\n");
      out.write("      data-control-streetview=\"true\"\n");
      out.write("      data-control-rotate=\"true\"\n");
      out.write("      data-event-mousewheel=\"true\"\n");
      out.write(" \n");
      out.write("      data-zoom=\"14\" role=\"map\" class=\"gmaps\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("          ");
   
              int id;
              DatosUbicacion datosUbicacion = new DatosUbicacion("gacet","root","Hola12345"); 
              DatosEstacion datosEstacion = new DatosEstacion("gacet","root","Hola12345");
              ResultSet rS = datosUbicacion.MostrarTabla();
              
              while(rS.next()){
                  
              id= rS.getInt("id_Ubicacion");
              
              ResultSet datos = datosEstacion.sacarEstacion(id);
              
              
          
      out.write("\n");
      out.write("      \n");
      out.write("          \n");
      out.write("          <div\n");
      out.write("          data-id=\"1\"\n");
      out.write("          data-lat=\"");
      out.print( rS.getDouble("Latitud"));
      out.write("\"\n");
      out.write("          data-lng=\"");
      out.print( rS.getDouble("Longitud"));
      out.write("\"\n");
      out.write("          class=\"marker\">\n");
      out.write("          <div class=\"map-card\">\n");
      out.write("          <p>Address: ");
      out.print( rS.getString("Direccion"));
      out.write("</p>\n");
      out.write("          \n");
      out.write("          ");
 
           while(datos.next()){
          
          
      out.write("\n");
      out.write("            <p> Marca:");
      out.print( datos.getString("Marca"));
      out.write(" </p>\n");
      out.write("            <p> Puestos:");
      out.print( datos.getInt("Puestos"));
      out.write("</p>\n");
      out.write("            <p> Valoracion:");
      out.print( datos.getInt("Valoracion"));
      out.write("</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("          ");

              }
          
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("          ");

              }
          
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write(" \n");
      out.write("      <!-- items de ubicaciones -->\n");
      out.write("\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function () {\n");
      out.write("      $('.gmaps').gmaps();\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
