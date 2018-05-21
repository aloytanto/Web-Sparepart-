<%-- 
    Document   : HAPUS
    Created on : May 21, 2018, 2:17:43 PM
    Author     : intel
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</table>
     </head>
   <form class="form-signin"  method="POST">
       <h2  align="center" class="form-signin-heading">hapus barang </h2>
        
        <input type="text" class="input-block-level" name="kata_kunci" placeholder="Masukkan ID">
        
 </label>
        <button   align="center" class="btn btn-large btn-primary" type="submit" >hapus</button>
        <p><a href="test.jsp">home</a> </p>
    </body>
</form>
     <%
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
%>

<%
                }else{
                    out.println("Koneksi Gagal !!!");
                }
            }catch(Exception e){
                out.println("Error Koneksi !!!"+e.getMessage());
            }
           
        %>   
        
</body>
<html>



