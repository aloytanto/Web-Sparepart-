<%-- 
    Document   : tambahdata
    Created on : May 21, 2018, 2:10:31 PM
    Author     : intel
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<HTML>
   
        <%  
            Connection connection = null;
            String Host = "jdbc:oracle:thin:@localhost:1521:xe";
            Class.forName("oracle.jdbc.driver.OracleDriver");
           connection = DriverManager.getConnection(Host, "GANTENG", "tanto");
            Statement statement = connection.createStatement();

            String command = "INSERT INTO MASTERBARANG(KODEBARANG, NAMABARANG,HARGAJUAL,HARGABELI,SATUAN,KATEGORI) VALUES (1, 'Tom','HH','FF','AS','G')";
            statement.executeUpdate(command);

            command = "INSERT INTO MASTERBARANG(KODEBARANG, NAMABARANG,HARGAJUAL,HARGABELI,SATUAN,KATEGORI) VALUES (2, 'Tom','HH','FF','AS','G')";
            statement.executeUpdate(command);

            ResultSet resultset = statement.executeQuery("select * from MASTERBARANG");

            while(resultset.next()){ 
        %>
            
        <% 
            } 
        %>
        
        <jsp:forward page="test.jsp"/>
    </BODY>
</HTML>