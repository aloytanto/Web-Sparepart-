<%-- 
    Document   : update
    Created on : May 21, 2018, 4:14:28 PM
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
       <h2  align="center" class="form-signin-heading"> Update Barang </h2>
        
        <input type="text" class="input-block-level" name="kode" placeholder="kode">
         <input type="text" class="input-block-level" name="nama" placeholder="nama">
          <input type="text" class="input-block-level" name="jual" placeholder="harga jual">
           <input type="text" class="input-block-level" name="beli" placeholder="harga beli">
           <input type="text" class="input-block-level" name="satuan" placeholder="satuan">
            <input type="text" class="input-block-level" name="kategori" placeholder="kategori">
          
          
        
 </label>
        <button   align="center" class="btn btn-large btn-primary" type="submit" >hapus</button>
        <p><a href="test.jsp">home</a> </p>
    </body>
</form>
     <%
            String kode = request.getParameter("kode");
            String nama = request.getParameter("nama");
            String hargajual = request.getParameter("jual");
            String hargabeli  = request.getParameter("beli");
            String satuan = request.getParameter("satuan");
            String kategori = request.getParameter("kategori");
            
            try{
             String Host = "jdbc:oracle:thin:@localhost:1521:xe";
                  Connection conn= null;
                Class.forName("oracle.jdbc.driver.OracleDriver");
                  conn = DriverManager.getConnection(Host, "GANTENG", "tanto");
                if(conn != null)
                {
                      Statement st=conn.createStatement();
    int i=st.executeUpdate("UPDATE MASTERBARANG SET NAMABARANG='"+nama+"', HARGAJUAL='"+hargajual+"', HARGABELI='"+hargabeli+"', SATUAN='"+satuan+"', KATEGORI='"+kategori+"' WHERE KODEBARANG="+kode);
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




