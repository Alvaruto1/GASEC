package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consultas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <title>Consultas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contPrincipal\">\n");
      out.write("            <div class=\"contLogo\">\n");
      out.write("                <div class=\"tituloGACET\">GACET</div>\n");
      out.write("                <div class=\"logoGACET\">\n");
      out.write("                    <img src=\"img/logos/logo.png\" alt=\"no disponible\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"RegistrarVehiculoServlet\" method=\"post\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">CONSULTAS</h1>\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"contForm\">    \n");
      out.write("                        <label for=\"fecha\">Fecha de SOAT:</label>\n");
      out.write("                        <input type=\"date\" id=\"fecha\" name=\"fecha\">\n");
      out.write("                        <label for=\"empresa\">Empresa:</label>                        \n");
      out.write("                        <input type=\"text\" id=\"empresa\" name=\"empresa\" pattern=\"[A-Z]{4-16}\" placeholder=\"Escriba la empresa de SOAT\">\n");
      out.write("                        <label for=\"ciudad\">Ciudad:</label>                        \n");
      out.write("                        <datalist id=\"ciudades\">\n");
      out.write("                            <option value=\"Bogota\">\n");
      out.write("                            <option value=\"Cali\">\n");
      out.write("                            <option value=\"Barranquilla\">\n");
      out.write("                            <option value=\"Medellin\">\n");
      out.write("                            <option value=\"Ibague\">\n");
      out.write("                        </datalist>\n");
      out.write("                        <input name=\"ciudad\" id=\"ciudad\" list=\"ciudades\" placeholder=\"Escoja la ciudad\">\n");
      out.write("                        <label for=\"tipoServicio\">Tipo servicio:</label>\n");
      out.write("                        <select id=\"tipoServicio\" name=\"tipoServicio\">\n");
      out.write("                            <option value=\"particular\">Particular</option>\n");
      out.write("                            <option value=\"publico\">Publico</option>\n");
      out.write("                            <option value=\"carga\">Carga</option>\n");
      out.write("                            <option value=\"diplomatico\">Diplomatico</option>\n");
      out.write("                        </select>\n");
      out.write("                        <div>Dias faltantes:</div>\n");
      out.write("                        <div>125</div>\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">Mantenimiento</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"contForm\">\n");
      out.write("                        <label for=\"fecha\">Fecha ultimo mantenimiento:</label>\n");
      out.write("                        <input type=\"date\" id=\"fecha\" name=\"fecha\">\n");
      out.write("                        <div>Dias faltantes:</div>\n");
      out.write("                        <div>45</div>                                                \n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">Aceite</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"contForm\">\n");
      out.write("                        <label for=\"kmRecorridos\">Kilometros recorridos:</label>                        \n");
      out.write("                        <input type=\"text\" id=\"empresa\" name=\"empresa\" pattern=\"[0-9]{0-99999999}\" placeholder=\"Escriba kilometro recorridos\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                </div>                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input type=\"submit\" id=\"registrar\" name=\"registrar\" value=\"Registrar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
