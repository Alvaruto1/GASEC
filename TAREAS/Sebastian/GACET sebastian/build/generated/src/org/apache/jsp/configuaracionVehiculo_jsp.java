package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Vehiculo.Vehiculo;
import Logica.Usuario.Usuario;
import java.util.ArrayList;

public final class configuaracionVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            ArrayList<Vehiculo> vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <title>Configuracion vehiculos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contLogo\">\n");
      out.write("                \n");
      out.write("            <div class=\"contTitulo\">\n");
      out.write("                <h1 class=\"titulo\">Configuracion vehiculo</h1>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"listaVheiculos\">\n");
      out.write("                <select id=\"vehiculo\" name=\"vehiculo\">\n");
      out.write("                    ");
for(int i=0; i< vehiculos.size(); i++){
                        if(i==0){
                            out.println("<option value="+(i)+" selected=true>"+vehiculos.get(i).getPlaca()+"</option>");                            
                        }
                        else{
                            out.println("<option value="+(i)+">"+vehiculos.get(i).getPlaca()+"</option>");                            
                        }
                        
                    }
                    
      out.write("\n");
      out.write("                                        \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            <div>Caracteristicas Vehiculo:</div>\n");
      out.write("            \n");
      out.write("            <div><h2>Combustible</h2> <h2 id=\"combustible\">");
      out.print(vehiculos.get(0).getCombustible().get(0).getTipo());
      out.write("</h2></div>\n");
      out.write("            <div>\n");
      out.write("                <h2>Aceite: </h2> <h2 id=\"aceite\">");
      out.print(vehiculos.get(0).getAceite().getMarca());
      out.write("</h2>\n");
      out.write("                <h2>Caracteristica: </h2> <h2 id=\"caracteristica\">");
      out.print(vehiculos.get(0).getAceite().getCaracteristica());
      out.write("</h2>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                <form action=\"ConfiguracionVehiculoServlet\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" value=\"0\" name=\"opcion\">\n");
      out.write("                    <input type=\"hidden\" value=\"0\" name=\"idVehiculo\" id=\"idVehiculo\">\n");
      out.write("                    <input type=\"submit\" value=\"Agregar vehiculo\">\n");
      out.write("                </form>\n");
      out.write("                <form action=\"ConfiguracionVehiculoServlet\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                    <input type=\"hidden\" value=\"0\" name=\"idVehiculo\" id=\"idVehiculo\">\n");
      out.write("                    <input type=\"submit\" value=\"Editar vehiculo\">\n");
      out.write("                </form>\n");
      out.write("                <form action=\"ConfiguracionVehiculoServlet\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                    <input type=\"hidden\" value=\"0\" name=\"idVehiculo\" id=\"idVehiculo\">\n");
      out.write("                    <input type=\"submit\" value=\"Eliminar vehiculo\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <script type=\"text/javascript\" src=\"js/configuracionVehiculo.js\"></script>\n");
      out.write("            \n");
      out.write("    </body>\n");
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
