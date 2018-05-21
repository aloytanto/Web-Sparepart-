package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("<title>Admin Master</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link href=\"global.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write(" body {\n");
      out.write("        padding-top: 40px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("        background-color: #f5f5f5;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .form-signin {\n");
      out.write("        max-width: 300px;\n");
      out.write("        padding: 19px 29px 29px;\n");
      out.write("        margin: 0 auto 20px;\n");
      out.write("        background-color: #fff;\n");
      out.write("        border: 1px solid #e5e5e5;\n");
      out.write("        -webkit-border-radius: 5px;\n");
      out.write("           -moz-border-radius: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("      }\n");
      out.write("      .form-signin .form-signin-heading,\n");
      out.write("      .form-signin .checkbox {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("      }\n");
      out.write("      .form-signin input[type=\"text\"]\n");
      out.write("      {\n");
      out.write("        font-size: 16px;\n");
      out.write("        height: auto;\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        padding: 7px 9px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <link href=\"bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<\n");
      out.write("  \n");
      out.write("      <title>Halaman Admin akun</title>\n");
      out.write(" </head>\n");
      out.write("   \n");
      out.write("<div id=\"MainHolder\">\n");
      out.write("  <div id=\"TOP\"><img src=\"produk/logo_02.jpg\" alt=\"Loan Detective\" width=\"100\" height=\"100\" /></div>\n");
      out.write("  <div id=\"TOP-Message\">Halaman Utama Lihat Jadwal Dokter  <br />\n");
      out.write("   </div>\n");
      out.write("  <div id=\"TOP-Menu\">\n");
      out.write("    <p><a href=\"HalamanAwal.jsp\">Jadwal</a> <a href=\"Kritik_Saran.jsp\">Kritik Saran</a> <a href=\"Promosi.jsp\">Promosi</a> <a href=\"Login.jsp\">Admin</a> <a href=\"http://www.pantinugroho.or.id/\">HOME</a> </p>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"TOP-SubMenu\">\n");
      out.write("  <marquee font direction=\"right\"  >Lihat jadwal hari  ");
      out.print(new java.util.Date().toLocaleString() );
      out.write("   </marquee>\n");
      out.write("   </marquee>\n");
      out.write("  </div>\n");
      out.write("  <body>\n");
      out.write("            \n");
      out.write("      \n");

     
          String Host = "jdbc:oracle:thin:@localhost:1521:xe";
          Connection connection = null;
          Statement statement = null;
          ResultSet rs = null;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          connection = DriverManager.getConnection(Host, "GANTENG", "tanto");
          statement = connection.createStatement();
          String Data = "select * from  MASTERBARANG";
          rs = statement.executeQuery(Data);

      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("<table border=\"1\" align=\"center\" width=\"600px\" color =\"brown\">\n");
      out.write("    <tr>\n");
      out.write("        <th>KODE BARANG</th> \n");
      out.write("        <th>NAMA BARANG</th>\n");
      out.write("        <th>HARGA JUAL</th>\n");
      out.write("        <th>HARGA BELI</th>\n");
      out.write("        <th>SATUAN</th>\n");
      out.write("        <th>KATEGORI</th>\n");
      out.write("        <th> <a href= \"tambahdata.jsp\" >tambah </a></th>\n");
      out.write("    \n");
      out.write("         \n");
      out.write("    </tr>\n");
      out.write("    \n");

                        while(rs.next())
                        {
                            out.println("<tr>");
                            out.println("<td>"+rs.getString("KODEBARANG")+"</td>");
                            out.println("<td>"+rs.getString("NAMABARANG")+"</td>");
                            out.println("<td>"+rs.getString("HARGAJUAL")+"</td>");
                            out.println("<td>"+rs.getString("HARGABELI")+"</td>");
                            out.println("<td>"+rs.getString("SATUAN")+"</td>");
                            out.println("<td>"+rs.getString("KATEGORI")+"</td>");
                            out.println("<td><a href=HAPUS.jsp"+ ">hapus </a> </td>");
                            out.println("<td><a href=update.jsp"+ ">update </a> </td>");
                            out.println("</tr>");
                            
                          
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
