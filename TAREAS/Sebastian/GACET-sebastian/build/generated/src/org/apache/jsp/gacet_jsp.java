package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Usuario.Usuario;

public final class gacet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        ");

            Usuario usuario= new Usuario();
            int id= Integer.parseInt(request.getSession().getAttribute("id").toString());
            usuario = (Usuario) request.getSession().getAttribute("usuario");
        
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flexboxgrid.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/cssGacet.css\">\r\n");
      out.write("        <title>GACET</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"contPrincipal\">\r\n");
      out.write("        <header class=\"logo-menu\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row middle-xs between-xs\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"logo\"><h2>Gacet</h2></div>\r\n");
      out.write("                        <nav class=\"menu\">\r\n");
      out.write("                            <a href=\"#somos\">¿Quienes somos?</a>                      \r\n");
      out.write("                            <a href=\"#\">Placa vehiculo actual</a>\r\n");
      out.write("                            <a href=\"modificarCuenta.jsp\"> ");
      out.print(usuario.getAlias());
      out.write(" </a>\r\n");
      out.write("                            <a href=\"#\">Cerrar Sesion</a>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        </br>\r\n");
      out.write("        </br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"contenid\"></div>  \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"contenido\"> <img src=\"mapa.jpg\"></div>  \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("                <div class=\"menuContenido\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                    </br>\r\n");
      out.write("                        <form action=\"GACETServlet\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"0\"> \r\n");
      out.write("                            <input type=\"submit\" value=\"Mostrar Ubicacion\" class=\"btnContenido\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </br>    \r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"texto\">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    </br>\r\n");
      out.write("                    \r\n");
      out.write("                    <div>\r\n");
      out.write("                        <form action=\"GACETServlet\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"1\"> \r\n");
      out.write("                            <input type=\"submit\" value=\"Consultas\" class=\"btnContenido\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </br>    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"texto\">Esta opcion muestra las fechas del SOAT, mantenimiento y el aceite</div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    </br>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("        </br>\r\n");
      out.write("        </br>    \r\n");
      out.write("\r\n");
      out.write("        <hr color=\"#21618C\" size=7>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("            </div>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"titulo\">Recorrido</div>\r\n");
      out.write("                \r\n");
      out.write("            </div> \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("                \r\n");
      out.write("            </div> \r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("                <form action=\"GACETServlet\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"2\"> \r\n");
      out.write("                    <input type=\"submit\" value=\"Iniciar\" class=\"btnContenido\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("                <form action=\"GACETServlet\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"3\"> \r\n");
      out.write("                    <input type=\"submit\" value=\"Detenerse\" class=\"btnContenido\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-1\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs\" >\r\n");
      out.write("                <form action=\"GACETServlet\">\r\n");
      out.write("                    <input type=\"hidden\" value=\"4\"> \r\n");
      out.write("                    <input type=\"submit\" value=\"Reiniciar\" class=\"btnContenido\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-3\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">  \r\n");
      out.write("            <div class=\"col-xs\">\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("            </div>  \r\n");
      out.write("        </div> \r\n");
      out.write("       </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
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
