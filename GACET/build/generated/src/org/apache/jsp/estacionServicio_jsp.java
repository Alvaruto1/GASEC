package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class estacionServicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Estacion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contPrincipal\">          \n");
      out.write("                                    \n");
      out.write("            <form action=\"EstacionServlet\" method=\"post\">\n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">Estacion</h1>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"contForm\">\n");
      out.write("                        <div class=\"fila\">Estacion Fonitbon</div>\n");
      out.write("                        <div class=\"fila\">Marca: Terpel</div>\n");
      out.write("                        <div class=\"\"fila>\n");
      out.write("                            <div>Calificacion:</div>\n");
      out.write("                            <div class=\"\">\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"1\">\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"2\">\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"3\">\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"4\">\n");
      out.write("                                <input type=\"radio\" name=\"calificacion\" id=\"calificacion\" value=\"5\">\n");
      out.write("                            </div>    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">Comentarios</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"contComentarios\">\n");
      out.write("\n");
      out.write("                        <!--se repite las veces coemntadas-->\n");
      out.write("                        <div class=\"comentario\">\n");
      out.write("                            <div class=\"usuario\">Nombre Usuario</div>\n");
      out.write("                            <div class=\"comentario\">El comentario es</div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"agregarComentario\">\n");
      out.write("                        <div class=\"titulo\">Comentario</div>\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                                <textarea id=\"comentario\" name=\"comentario\" required></textarea>\n");
      out.write("                                <input type=\"submit\" id=\"enviar\" name=\"enviar\" value=\"Enviar\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>                            \n");
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
