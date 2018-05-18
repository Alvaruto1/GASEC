package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        ");

            double latitud = 25;
            double longitud = 25;
            double km = 70;
            String t = request.getParameter("latitud");
//            if(t!=""){
//                latitud = Double.parseDouble(request.getParameter("latitud"));
//                longitud = Double.parseDouble(request.getParameter("longitud"));
//                km = Double.parseDouble(request.getParameter("km"));
//            } 
        
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedorFlex\">\n");
      out.write("            <header class=\"titulo\">\n");
      out.write("                <div>\n");
      out.write("                    Mapa y kilometros recorridos\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <section class=\"contenedorMapaFlex\">\n");
      out.write("                <div class=\"mapa\" id=\"mapa\" style=\"width: 100%; height: 400px\"></div>                    \n");
      out.write("            </section>\n");
      out.write("            <aside>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <form action=\"servlet\" class=\"contenedorLatLonFlex\" method=\"post\" id=\"formula\">                    \n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"submit\" name=\"aceptar\" id=\"aceptar\" value=\"Enviar\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"hidden\" id=\"loni\" name=\"loni\">\n");
      out.write("                    <input type=\"hidden\" id=\"lati\" name=\"lati\">\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div class=\"contenedorDatosFlex\">\n");
      out.write("                    <div>Ultima posicion enviada</div>\n");
      out.write("                    <div>Latiud ");
out.println(request.getSession().getAttribute("longi"));
      out.write("</div>\n");
      out.write("                    <div>Longitud ");
out.println(request.getSession().getAttribute("latid"));
      out.write("</div>\n");
      out.write("                    <div id=\"distancia\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </aside>\n");
      out.write("        </div>\n");
      out.write("                <script id=\"escript\"></script>\n");
      out.write("        <script src=\"generadorMapa.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>");
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
