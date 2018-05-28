package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.omg.CORBA.UnionMemberHelper;

public final class iniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            String nombre;
            if(request.getSession().getAttribute("nombre")!=null){
                 nombre= request.getSession().getAttribute("nombre").toString();                
            }else{
                nombre ="";
            }
            
        
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css.css\">\r\n");
      out.write("        <title>Inicio Sesion</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"contPrincipal\">\r\n");
      out.write("            <div class=\"contLogo\">\r\n");
      out.write("                <div class=\"tituloGACET\">GACET</div>\r\n");
      out.write("                <div class=\"logoGACET\">\r\n");
      out.write("                    <img src=\"img/Logo.jpeg\" alt=\"no disponible\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"contImagen\">\r\n");
      out.write("                <img src=\"img/Usuario.jpg\" alt=\"no disponible\">\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"contInicioSesion\">\r\n");
      out.write("                <form action=\"IniciarSesionServlet\" method=\"post\">\r\n");
      out.write("                    <label for=\"usuario\">Usuario</label>\r\n");
      out.write("                    <input type=\"text\" id=\"usuario\" name=\"usuario\" required placeholder=\"Escriba su usuario o alias\" value=\"");
      out.print(nombre);
      out.write("\">\r\n");
      out.write("                    <label for=\"contrasenia\">Contraseña</label>\r\n");
      out.write("                    <input type=\"password\" id=\"contrasenia\" name=\"contrasenia\" required placeholder=\"Escriba su contraseña\">\r\n");
      out.write("                    <input type=\"submit\" id=\"iniciar\" name=\"iniciar\" value=\"Iniciar\">\r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"registrar.jsp\">Registrarse</a>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
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
