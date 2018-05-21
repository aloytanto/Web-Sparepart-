package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class halamanawal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("<title>Jadwal Dokter</title>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Membuat design table bergaya elegan dengan CSS | MalasNgoding.com</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<center><h1>Membuat design table bergaya elegan dengan CSS | MalasNgoding.com</h1></center>\n");
      out.write("\t<table cellspacing='0'>\n");
      out.write("\t\t<thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("      ");

     
          String Host = "jdbc:oracle:thin:@localhost:1521:xe";
          Connection connection = null;
          Statement statement = null;
          ResultSet rs = null;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          connection = DriverManager.getConnection(Host, "GANTENG", "tanto");
          statement = connection.createStatement();
          String Data = "select * from  PENJUALAN";
          rs = statement.executeQuery(Data);

      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("<table border=\"1\" align=\"center\" width=\"600px\" color =\"brown\">\n");
      out.write("    <tr>\n");
      out.write("        <th> TGL FAKTUR</th> \n");
      out.write("        <th>NOMOR FAKTUR</th>\n");
      out.write("        <th>NAMA KONSUMEN</th>\n");
      out.write("        <th>KODE BARANG</th>\n");
      out.write("        <th>JUMLAH</th>\n");
      out.write("        <th>HARGA SATUAN</th>\n");
      out.write("        <th>HARGA TOTAL </th>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("    </tr>\n");
      out.write("    \n");

                        while(rs.next())
                        {
                            out.println("<tr>");
                            out.println("<td>"+rs.getString("TGLFAKTUR")+"</td>");
                            out.println("<td>"+rs.getString("NOFAKTUR")+"</td>");
                            out.println("<td>"+rs.getString("NAMAKONSUMEN")+"</td>");
                            out.println("<td>"+rs.getString("KODE")+"</td>");
                            out.println("<td>"+rs.getString("JUMLAH")+"</td>");
                            out.println("<td>"+rs.getString("HARGASATUAN")+"</td>");
                            out.println("<td>"+rs.getString("HARGATOTAL")+"</td>");
                          
                            
                          
                                                   }

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("      </fieldset>      \n");
      out.write("    \n");
      out.write("   </body>\n");
      out.write("</html>     \n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("   \n");
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
