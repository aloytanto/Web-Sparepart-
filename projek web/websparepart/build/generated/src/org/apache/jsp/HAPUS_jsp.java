package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class HAPUS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("</table>\n");
      out.write("     </head>\n");
      out.write("   <form class=\"form-signin\"  method=\"POST\">\n");
      out.write("       <h2  align=\"center\" class=\"form-signin-heading\">hapus barang </h2>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" class=\"input-block-level\" name=\"kata_kunci\" placeholder=\"Masukkan ID\">\n");
      out.write("        \n");
      out.write(" </label>\n");
      out.write("        <button   align=\"center\" class=\"btn btn-large btn-primary\" type=\"submit\" >hapus</button>\n");
      out.write("        <p><a href=\"admin.jsp\">home</a> </p>\n");
      out.write("    </body>\n");
      out.write("</form>\n");
      out.write("     ");

            String kata_kunci = request.getParameter("kata_kunci");
            
            try{
             String Host = "jdbc:oracle:thin:@localhost:1521:xe";
                  Connection conn= null;
                Class.forName("oracle.jdbc.driver.OracleDriver");
                  conn = DriverManager.getConnection(Host, "GANTENG", "tanto");
                if(conn != null)
                {
                    PreparedStatement pst = conn.prepareStatement("DELETE FROM  MASTERBARANG WHERE KODEBARANG  LIKE '%"+kata_kunci+"%'");
                    ResultSet b = pst.executeQuery();
                    int no = 1;

      out.write('\n');
      out.write('\n');

                }else{
                    out.println("Koneksi Gagal !!!");
                }
            }catch(Exception e){
                out.println("Error Koneksi !!!"+e.getMessage());
            }
           
        
      out.write("   \n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
