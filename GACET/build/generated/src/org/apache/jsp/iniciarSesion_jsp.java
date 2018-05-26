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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            String nombre;
            if(request.getSession().getAttribute("nombre")!=null){
                 nombre= request.getSession().getAttribute("nombre").toString();                
            }else{
                nombre ="";
            }
            
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <title>Inicio Sesion</title>\n");
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
      out.write("            <div class=\"contImagen\">\n");
      out.write("                <img src=\"img/logos/usuario.png\" alt=\"no disponible\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"contInicioSesion\">\n");
      out.write("                <form action=\"IniciarSesionServlet\" method=\"post\">\n");
      out.write("                    <label for=\"usuario\">Usuario</label>\n");
      out.write("                    <input type=\"text\" id=\"usuario\" name=\"usuario\" required placeholder=\"Escriba su usuario o alias\" value=\"");
      out.print(nombre);
      out.write("\">\n");
      out.write("                    <label for=\"contrasenia\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" id=\"contrasenia\" name=\"contrasenia\" required placeholder=\"Escriba su contraseña\">\n");
      out.write("                    <input type=\"submit\" id=\"iniciar\" name=\"iniciar\" value=\"Iniciar\">\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <a href=\"registrar.jsp\">Registrarse</a>\n");
      out.write("            \n");
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
