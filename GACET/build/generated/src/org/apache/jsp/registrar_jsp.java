package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registrar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contPrincipal\">\n");
      out.write("            <div class=\"contLogo\">\n");
      out.write("                <div class=\"tituloGACET\">GACET</div>\n");
      out.write("                <div class=\"logoGACET\">\n");
      out.write("                    <img src=\"img/logos/logo.png\" alt=\"no disponible\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"contPanel\">\n");
      out.write("                <div class=\"contTitulo\">\n");
      out.write("                    <h1 class=\"titulo\">Registro</h1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <form class=\"contForm\" action=\"RegistrarServlet\" method=\"post\">\n");
      out.write("                    <label for=\"nombre\">Nombre:</label>\n");
      out.write("                    <input type=\"text\" id=\"nombre\" name=\"nombre\" required pattern=\"[a-zA-Z]{4,16}\" title=\"letras de 4 a 16 caracteres\" placeholder=\"Escriba su nombre\">\n");
      out.write("                    <label for=\"alias\">Alias:</label>\n");
      out.write("                    <input type=\"text\" id=\"alias\" name=\"alias\" required pattern=\"[a-zA-Z0-9]{4,16}\" title=\"alfanumerico de 4 a 16 caracteres\"placeholder=\"Escriba un usuario\">\n");
      out.write("                    <label for=\"edad\">Edad:</label>\n");
      out.write("                    <input type=\"number\" id=\"edad\" name=\"edad\" required pattern=\"[0-9]{0,3}\" placeholder=\"Escriba su edad\">\n");
      out.write("                    <label for=\"correo\">Correo:</label>\n");
      out.write("                    <input type=\"email\" id=\"correo\" name=\"correo\" required placeholder=\"Escriba su correo\">\n");
      out.write("                    <label for=\"contrasenia\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" id=\"contrasenia\" name=\"contrasenia\" required placeholder=\"Escriba una contraseña\">\n");
      out.write("                    <input type=\"submit\" id=\"registrar\" name=\"registrar\" value=\"Registrar\">\n");
      out.write("                </form>\n");
      out.write("            </div>            \n");
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
