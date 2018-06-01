package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import Logica.Vehiculo.Vehiculo;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

            Usuario usuario= new Usuario();
            ArrayList<Vehiculo> vehiculos = null;
            Vehiculo vehiculoActual = null;
            boolean estado = true;
            boolean estadoV =true;
            int id= 0;
            // verificar id de usuario no null
            if(request.getSession().getAttribute("id")!=null){
                id=Integer.parseInt(request.getSession().getAttribute("id").toString());
                
            }
            
            // verificar usuario no null
            if(request.getSession().getAttribute("usuario")!=null){
                usuario = (Usuario) request.getSession().getAttribute("usuario");  
                    //verificar vehiculos usuario no vacio
                if(((Usuario) request.getSession().getAttribute("usuario")).getVehiculo().size()>0){
                    vehiculos = ((Usuario) request.getSession().getAttribute("usuario")).getVehiculo();
                    // verificar vehiculo actual no null
                    if(request.getSession().getAttribute("vehiculoActual")!=null){
                        vehiculoActual = (Vehiculo) request.getSession().getAttribute("vehiculoActual");
                        estado=true;
                        estadoV=true;
                    }
                    else{
                        estadoV =false;
                        estado = false;
                        //response.sendRedirect("iniciarSesion.jsp");
                    }
                }
                else{   
                    estado=false;  
                    estadoV=false;
                }

                
            }
            else{
                estado=false;
                estadoV=false;
                response.sendRedirect("iniciarSesion.jsp");
                
            }
            
            System.out.println(vehiculoActual+"-"+estadoV);
            
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flexboxgrid.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/cssGacet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/gacetOcultar.css\"/>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/gacet.js\"></script> \n");
      out.write("        <title>GACET</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"contPrincipal\">\n");
      out.write("        <header class=\"logo-menu\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row middle-xs between-xs\">\n");
      out.write("\n");
      out.write("                        <div class=\"logo\"><h2>Gacet</h2></div>\n");
      out.write("                        <nav class=\"menu\">\n");
      out.write("                            <a href=\"#somos\" >¿Quienes somos?</a>\n");
      out.write("                                    \n");
      out.write("                                    <a href=\"");

                                                if(usuario.getVehiculo().size()>0){
                                                    out.println("#");
                                                }
                                                else{
                                                    out.println("registroVehiculo.jsp");
                                                }
                                        
                                        
                                            
      out.write("\n");
      out.write("                                       \" id=\"ingresarVehiculo\">\n");
      out.write("                                       ");

                                           if(estadoV){
                                               if(usuario.getVehiculo().size()>0){
                                                    out.println(vehiculoActual.getPlaca());
                                                }
                                                else{
                                                    out.println("Ingresar Vehiculo");
                                                }                                                
                                           }
                                           else{
                                               out.println("Ingresar Vehiculo");
                                           }
                                                                                               
                                        
      out.write("                               \n");
      out.write("                                        \n");
      out.write("                                    </a>\n");
      out.write("                            <a href=\"modificarCuenta.jsp\"> ");
      out.print(usuario.getAlias());
      out.write(" </a>\n");
      out.write("                            <form action=\"GACETServlet\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" value=\"0\" id=\"caso\" name=\"caso\">\n");
      out.write("                                <input type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("                            </form>\n");
      out.write("                        </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("\n");
      out.write("                <div class=\"contenid\"></div>  \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("\n");
      out.write("                <div class=\"contenido\"> \n");
      out.write("                    \n");
      out.write(" <!--Configuracion vehiculo_________________________________________________________________________________________________-->                   \n");
      out.write("\n");
      out.write(" <div id=\"configuracionVehiculo\" name=\"configuracionVehiculo\" class=\"ocultar\">\n");
      out.write("     <div class=\"contLogo\">\n");
      out.write("         \n");
      out.write("            <div class=\"contTitulo\">\n");
      out.write("                <h1 class=\"titulo\">Configuracion vehiculo</h1>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"listaVheiculos\">\n");
      out.write("                <select id=\"vehiculo\" name=\"vehiculo\">\n");
      out.write("                    ");

                        if(estado){
                            for(int i=0; i< vehiculos.size(); i++){
                                if(i==0){
                                    out.println("<option value="+(i)+" selected=true>"+vehiculos.get(i).getPlaca()+"</option>");                            
                                }
                                else{
                                    out.println("<option value="+(i)+">"+vehiculos.get(i).getPlaca()+"</option>");                            
                                }

                            }                            
                            
                        }
                        
                    
      out.write("\n");
      out.write("                                        \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            <div>Caracteristicas Vehiculo:</div>\n");
      out.write("            \n");
      out.write("            <div><h2>Tipo Vehiculo</h2> <h2 id=\"vehiculoTipo\">");
if(estado){
                out.print(vehiculos.get(0).getTipo());}
      out.write("</h2></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div><h2>Combustible</h2> <h2 id=\"combustible\">");
if(estado){
                out.print(vehiculos.get(0).getCombustible().get(0).getTipo());}
      out.write("</h2></div>\n");
      out.write("            <div>\n");
      out.write("                <h2>Aceite: </h2> <h2 id=\"aceite\">");
if(estado){out.print(vehiculos.get(0).getAceite().getMarca());}
      out.write("</h2>\n");
      out.write("                <h2>Caracteristica: </h2> <h2 id=\"caracteristica\">");
if(estado){out.println(vehiculos.get(0).getAceite().getCaracteristica());}
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
      out.write("                </form>                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write(" </div>    \n");
      out.write("\n");
      out.write("<!--Consultas_________________________________________________________________________________________________-->                   \n");
      out.write("<div id=\"consultas\" name=\"consultas\" class=\"ocultar\">          \n");
      out.write("       <div class=\"contPrincipal\">\n");
      out.write("            \n");
      out.write("            <form action=\"ActualizarDatosServlet\" method=\"post\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">CONSULTAS</h1>\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"contForm\"> \n");
      out.write("                        <label for=\"tipoVehiculo\">Tipo Vehiculo:</label>                        \n");
      out.write("                        <input type=\"text\" disabled id=\"tipoVehiculo\" name=\"tipoVehiculo\" pattern=\"[0-9]{0-99999999}\" placeholder=\"Escriba kilometro recorridos\" \n");
      out.write("                               value=\"");

                                   if(estadoV){
                                       out.print(vehiculoActual.getTipo());
                                   }
                               
      out.write("\">\n");
      out.write("                        <label for=\"fecha\">Fecha de SOAT:</label>\n");
      out.write("                        ");

                            
                            Date fecha = null;
                            SimpleDateFormat formatoFecha = null;
                            if(estadoV){
                                
                                System.out.println((vehiculoActual.getSoat().getFecha()==null)+"------------------");
                                fecha = vehiculoActual.getSoat().getFecha().getTime();
                                
                                formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                            }
                            
                        
      out.write("\n");
      out.write("                        <input type=\"date\" disabled id=\"fecha\" name=\"fecha\" value=\"");
if(estadoV){out.print(formatoFecha.format(fecha));}
      out.write("\">\n");
      out.write("                        <label for=\"empresa\">Empresa:</label>                        \n");
      out.write("                        <input type=\"text\" disabled id=\"empresa\" name=\"empresa\" pattern=\"[A-Z]{4-16}\" placeholder=\"Escriba la empresa de SOAT\" \n");
      out.write("                               value=\"");
if(estadoV){out.print(vehiculoActual.getSoat().getEmpresa());}
      out.write("\">\n");
      out.write("                        <label for=\"ciudad\">Ciudad:</label>                        \n");
      out.write("                        <datalist id=\"ciudades\">\n");
      out.write("                            <option value=\"Bogota\">\n");
      out.write("                            <option value=\"Cali\">\n");
      out.write("                            <option value=\"Barranquilla\">\n");
      out.write("                            <option value=\"Medellin\">\n");
      out.write("                            <option value=\"Ibague\">\n");
      out.write("                        </datalist>\n");
      out.write("                        <input name=\"ciudad\" disabled id=\"ciudad\" list=\"ciudades\" placeholder=\"Escoja la ciudad \" \n");
      out.write("                               value=\"");
if(estadoV){out.print(vehiculoActual.getSoat().getCiudad());}
      out.write("\">\n");
      out.write("                        <label for=\"tipoServicio\">Tipo servicio:</label>\n");
      out.write("                        <select disabled id=\"tipoServicio\" name=\"tipoServicio\" value=\"");
if(estadoV){out.print(vehiculoActual.getSoat().getTipoDeServicio());}
      out.write("\">\n");
      out.write("                            <option value=\"1\">Particular</option>\n");
      out.write("                            <option value=\"0\">Publico</option>\n");
      out.write("                            <option value=\"2\">Carga</option>\n");
      out.write("                            <option value=\"3\">Diplomatico</option>\n");
      out.write("                        </select>\n");
      out.write("                        <div>Dias faltantes:</div>\n");
      out.write("                        <div>\n");
      out.write("                            ");

                            if(estado){
                                Date fechaActual = new Date();
                                Date fechaMante = vehiculoActual.getSoat().getFecha().getTime();
                                long segundosActual = fechaActual.getTime();
                                long segundosMante = fechaMante.getTime();
                                long totalSegundos = segundosActual-segundosMante;
                                
                                long dias = 365-(((totalSegundos/1000)/60)/60)/24;
                                out.print(dias);
                            }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"contPanel\">\n");
      out.write("                    <div class=\"contTitulo\">\n");
      out.write("                        <h1 class=\"titulo\">Mantenimiento</h1>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        Date fechaM = null;
                        SimpleDateFormat formatoFechaM = null;
                            if(estadoV){
                            fechaM = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                            formatoFechaM = new SimpleDateFormat("yyyy-MM-dd");
                            }
                        
      out.write("\n");
      out.write("                    <div class=\"contForm\">\n");
      out.write("                        <label for=\"fecha\">Fecha ultimo mantenimiento:</label>\n");
      out.write("                        <input disabled type=\"date\" id=\"fecha\" name=\"fecha\" \n");
      out.write("                               value=\"");
if(estadoV){out.print(formatoFechaM.format(fechaM));}
      out.write("\">\n");
      out.write("                        <div>Dias faltantes:</div>\n");
      out.write("                        <div>");

                            if(estado){
                                Date fechaActual = new Date();
                                Date fechaMante = vehiculoActual.getFechaUltimoMantenimiento().getTime();
                                long segundosActual = fechaActual.getTime();
                                long segundosMante = fechaMante.getTime();
                                long totalSegundos = segundosActual-segundosMante;
                                
                                long dias = 365-(((totalSegundos/1000)/60)/60)/24;
                                out.print(dias);
                            }
                            
      out.write("</div>                                                \n");
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
      out.write("                        <input type=\"text\" disabled id=\"empresa\" name=\"empresa\" pattern=\"[0-9]{0-99999999}\" placeholder=\"Escriba kilometro recorridos\" \n");
      out.write("                               value=\"");

                                   if(estadoV){
                                       out.print(vehiculoActual.getKmRecorrido());
                                   }
                               
      out.write("\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                </div>                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>             \n");
      out.write("                  \n");
      out.write("</div>\n");
      out.write("<!--Mostrar mapa_________________________________________________________________________________________________-->                   \n");
      out.write("<div class=\"ubicacionSebastinaGay\">\n");
      out.write("    <h2>Latitud: </h2>\n");
      out.write("    <div id=\"posX\" name=\"posX\">0.0</div>\n");
      out.write("    <h2>Longitud: </h2>\n");
      out.write("    <div id=\"posY\" name=\"posY\">0.0</div>\n");
      out.write("    <h2>Distancia: </h2>\n");
      out.write("    <div id=\"distancia\" name=\"distancia\">0.0</div>                   \n");
      out.write("</div>\n");
      out.write("<div id=\"mapa\" name=\"mapa\" class=\"ocultar\">          \n");
      out.write("    <div class=\"contPrincipal\">         \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        <div id=\"mapa\" name=\"mapa\">\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                <a href=\"Prueba.jps\">Ir al mapa</a>                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script id=\"script\" name=\"script\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/mapa.js\"></script>           \n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("<!--Mostrar mapa final_________________________________________________________________________________________________-->                   \n");
      out.write("           \n");
      out.write("\n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("                <div class=\"menuContenido\">\n");
      out.write("                    <div>\n");
      out.write("                    </br>\n");
      out.write("                    <a href=\"#\" id=\"mostrarMapa\">Mostrar Ubicacion</a>\n");
      out.write("                        \n");
      out.write("                    <div class=\"texto\">Esta opcion permite ver la ubicacion actual y te muestra las estaciones que tengas dentro de tu radio</div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    </br>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" id=\"consultasBtn\">Consultas</a>\n");
      out.write("                    </br>    \n");
      out.write("\n");
      out.write("                    <div class=\"texto\">Esta opcion muestra las fechas del SOAT, mantenimiento y el aceite</div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    </br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("        </br>\n");
      out.write("        </br>    \n");
      out.write("\n");
      out.write("        <hr color=\"#21618C\" size=7>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("            </div>    \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"titulo\">Recorrido</div>\n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("                \n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("                <form action=\"GACETServlet\">\n");
      out.write("                    <input type=\"hidden\" value=\"2\" id=\"caso\" name=\"caso\"> \n");
      out.write("                    <input type=\"button\" value=\"Iniciar\" class=\"btnContenido\" id=\"inicio\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("                <form action=\"GACETServlet\">\n");
      out.write("                    <input type=\"hidden\" value=\"3\" id=\"caso\" name=\"caso\"> \n");
      out.write("                    <input type=\"button\" value=\"Detenerse\" class=\"btnContenido\" id=\"detener\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-1\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"col-xs\" >\n");
      out.write("                <form action=\"GACETServlet\">\n");
      out.write("                    <input type=\"hidden\" value=\"4\" id=\"caso\" name=\"caso\"> \n");
      out.write("                    <input type=\"button\" value=\"Reiniciar\" class=\"btnContenido\">\n");
      out.write("                </form>\n");
      out.write("            </div>-->\n");
      out.write("            <div class=\"col-xs-3\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"row\">  \n");
      out.write("            <div class=\"col-xs\">\n");
      out.write("             \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div> \n");
      out.write("       </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
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
