package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class tambahdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" </div>\n");
      out.write("<form class=\"form\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> kode barang :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"kode \"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> nama barang :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"nama\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td> harga jual :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"jual\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> harga beli :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"beli\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td> satuan :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"satuan\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>kategori :</td>\n");
      out.write("                    <td><input  type=\"text\"  name=\"kategori\"/></td>\n");
      out.write("                </tr>\n");
      out.write("               </table> \n");
      out.write("              <p/>\n");
      out.write("            <input type=\"submit\" value=\"simpan\" />\n");
      out.write("                <p/>\n");
      out.write("        <a href=\"admin.jsp\">kembali </a>\n");
      out.write("    </body>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("       ");

            String kodebarang = request.getParameter("kode");
            String namabarang = request.getParameter("nama");
            String hargajual = request.getParameter("jual");
            String hargabeli = request.getParameter("beli");       
            String satuan =  request.getParameter("satuan");
            String kategori = request.getParameter("kategori");        
            
            try{
                String Host = "jdbc:oracle:thin:@localhost:1521:xe";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn= null; 
                
                conn = DriverManager.getConnection(Host, "GANTENG", "tanto");
               
                
                if(conn != null)
                {
                    if( kodebarang!= null && namabarang!= null && hargajual!= null && hargabeli!= null && satuan!= null&& kategori!= null)
                    {
                        PreparedStatement pst = conn.prepareStatement("INSERT INTO MASTERBARANG VALUES(?,?,?,?,?,?)");
                     
                        pst.setString(1, kodebarang);
                        pst.setString(2, namabarang);
                        pst.setString(3, hargajual);
                        pst.setString(4, hargabeli);
                        pst.setString(5, satuan);
                        pst.setString(6, kategori); 
                       
                        
                        pst.executeUpdate();
                    }
                }else{
                 
     out.println("berhasil");
    
                }
                             }catch(Exception e){
                out.println("Koneksi bermasalah");
            }
            
      out.write("\n");
      out.write("             \n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("   \n");
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
