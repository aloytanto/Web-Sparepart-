<!doctype html>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
	<meta charset="utf-8">
	<title>Web Spare Part</title>
	<meta name="title" content="jQuery One Page Scroll by Pete R. | The Pete Design" />
	<meta name="description" content="Create an Apple-like one page scroller website (iPhone 5S website) with One Page Scroll plugin" />
	<link rel="image_src" href="/images/notify_better_image.png" />

	<meta content="http://www.thepetedesign.com/demos/onepage_scroll_demo.html" property="og:url" />
	<meta content="http://www.thepetedesign.com/images/onepage_scroll_image.png" property="og:image" />
	<link rel="shortcut icon" id="favicon" href="favicon.png"> 
	<meta name="author" content="Pete R.">
	<link rel="canonical" href="http://www.thepetedesign.com/demos/onepage_scroll_demo.html" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Pacifico:400' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script type="text/javascript" src="jquery.onepage-scroll.js"></script>
  <link href='onepage-scroll.css' rel='stylesheet' type='text/css'>
  <style>
    html {
      height: 100%;
    }
    body {
      background: #E2E4E7;
      padding: 0;
      text-align: center;
      font-family: 'open sans';
      position: relative;
      margin: 0;
      height: 100%;
      -webkit-font-smoothing: antialiased;
    }
    
    .wrapper {
    	height: 100% !important;
    	height: 100%;
    	margin: 0 auto; 
    	overflow: hidden;
    }
    
    a {
      text-decoration: none;
    }
    
    
    h1, h2 {
      width: 100%;
      float: left;
    }
    h1 {
      margin-top: 100px;
      color: #000;
      margin-bottom: 5px;
      font-size: 70px;
      letter-spacing: -4px;
      font-weight: 100;
    }
    h1 span {
      font-size: 26px;
      margin: 0 5px;
      text-transform: capitalize;
      background: rgba(0,0,0,0.85);
      display: inline-block;
      color: #6D461D;
      border-radius: 5px 5px;
      -webkit-border-radius: 5px 5px;
      -moz-border-radius: 5px 5px;
      text-shadow: 0 2px 8px rgba(0, 0, 0, 0.75);
      padding: 3px 10px;
    }
    h2 {
      color: #6D461D;
      font-weight: 100;
      margin-top: 0;
      margin-bottom: 10px;
    }
    
    .pointer {
      color: #9b59b6;
      font-family: 'Pacifico', cursive;
      font-size: 30px;
      margin-top: 15px;
    }
    code {
      margin: 20px 1%;
      float: left;
      width: 48%;
      height: 105px;
      background: rgba(0,0,0,0.1);
      border: rgba(0,0,0,0.05) 5px solid;
      border-radius: 5px;
      padding:5px;
      color: white;
      text-align: center;
      font-size: 15px;
      margin-top: 25px;
      display: block;
      box-sizing: border-box;
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
    }
    code.html {
      color: #7EC9E6;
    }
    code.js {
      color: #FFAD00;
    }

    .main {
      float: left;
      width: 100%;
      margin: 0 auto;
    }
    
    .main h1 {
      padding:150px 50px;
      float: left;
      width: 100%;
      font-size: 45px;
      box-sizing: border-box;
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
      font-weight: 100;
      color: white;
      margin: 0;
    }
   
    .main h1.demo1 {
      background: #1ABC9C;
    }
    
    .reload.bell {
      font-size: 12px;
      padding: 20px;
      width: 45px;
      text-align: center;
      height: 47px;
      border-radius: 50px;
      -webkit-border-radius: 50px;
      -moz-border-radius: 50px;
    }
    
    .reload.bell #notification {
      font-size: 25px;
      line-height: 140%;
    }
    
    .reload, .btn{
      display: inline-block;
      border: 4px solid #A2261E;
      border-radius: 5px;
      -moz-border-radius: 5px;
      -webkit-border-radius: 5px;
      background: #CC3126;
      display: inline-block;
      line-height: 100%;
      padding: 0.7em;
      text-decoration: none;
      color: #fff;
      width: 100px;
      line-height: 140%;
      font-size: 17px;
      font-family: open sans;
      font-weight: bold;
    }
    .reload:hover{
      background: #444;
    }
    .btn {
      width: 200px;
      color: rgb(255, 255, 255);
      border: 4px solid rgb(0, 0, 0);
      background: rgba(3, 3, 3, 0.75);
    }
    .clear {
      width: auto;
    }
    .btn:hover, .btn:hover {
      background: #444;
    }
    .btns {
      width: 410px;
      margin: 50px auto;
    }
    .credit {
      text-align: center;
      color: rgba(0,0,0,0.5);
      padding: 10px;
      width: 410px;
      clear: both;
    }
    .credit a {
      color: rgba(0,0,0,0.85);
      text-decoration: none;
      font-weight: bold;
      text-align: center;
    }
    
    .back {
      position: absolute;
      top: 0;
      left: 0;
      text-align: center;
      display: block;
      padding: 7px;
      width: 100%;
      box-sizing: border-box;
      -moz-box-sizing: border-box;
      -webkit-box-sizing: border-box;
      background: rgba(255, 255, 255, 0.25);
      font-weight: bold;
      font-size: 13px;
      color: #000;
      -webkit-transition: all 500ms ease-in-out;
      -moz-transition: all 500ms ease-in-out;
      -o-transition: all 500ms ease-in-out;
      transition: all 500ms ease-in-out;
    }
    .back:hover {
      color: black;
      background: rgba(255, 255, 255, 0.5);
    }
    
    header {
      position: relative;
      z-index: 10;
    }
    .main section .page_container {
      position: relative;
      top: 25%;
      margin: 0 auto 0;
      max-width: 950px;
      z-index: 3;
    }
    .main section  {
      overflow: hidden;
    }
    
    .main section > img {
      position: absolute;
      max-width: 100%;
      z-index: 1;
    }
    
    .main section.page1 {
      background:rgb(230, 217, 200);
    }
    .main section.page1 h1 {
      text-align: left;
      padding: 0;
      margin-bottom: 15px;
      font-size: 70px;
      color: black;
    }
    .main section.page1 h2 {
      color: rgba(0,0,0,0.85);
      text-align: center;
      width: 435px;
      line-height: 160%;
    }
    .main section .page_container .btns {
      clear: both;
      float: left;
      text-align: center;
      width: 435px;
    }
    .main section .page_container .btns a{
      text-align: center;
    }
    .main section.page2 {
      background: #555557 url(back-phone.png) no-repeat center -150px ;
    }
    .main section.page2 > img {
      position: absolute;
      top: -300px;
      left: 50%;
      margin-left: -1095px;
    }
    .main section.page2 .page_container {
      margin-top: 240px;
      overflow: hidden;
    }
    .main section.page2 h1 {
      text-align: center;
      padding: 0;
      margin-bottom: 15px;
      font-size: 50px;
      letter-spacing: -1px;
      color: white;
    }
    .main section.page2 h2 {
      color: rgba(255,255,255,0.85);
      text-align: center;
      line-height: 160%;
      font-weight: 100;
    }
    .viewing-page-2 .back{
      background: rgba(0, 0, 0, 0.25);
      color: #FFF;
      }
    .main section.page3 {
      background:url(tilted-phone.png) no-repeat 156px -150px ;
    }
    .main section.page3 .page_container {
      overflow: hidden;
      width: 500px;
      right: -285px;
    }
    .main section.page3 h1 {
      text-align: left;
      padding: 0;
      margin-bottom: 0;
      font-size: 70px;
      letter-spacing: -1px;
      color: black;
    }
    .main section.page3 h2 {
      color: rgba(0,0,0,0.85);
      text-align: left;
      line-height: 160%;
      font-weight: 100;
      font-size: 21px;
    }
	</style>
	<script>
	  $(document).ready(function(){
      $(".main").onepage_scroll({
        sectionContainer: "section"
      });
		});
		
	</script>
</head>
<body>
  <div class="wrapper">
	  <div class="main">
  <marquee font direction="right"  >Lihat jadwal hari  <%=new java.util.Date().toLocaleString() %>   </marquee>	    
      <section class="page1">
        <div class="page_container">
         
  </div>
  <body>
            
      
<%
     
          String Host = "jdbc:oracle:thin:@localhost:1521:xe";
          Connection connection = null;
          Statement statement = null;
          ResultSet rs = null;
          Class.forName("oracle.jdbc.driver.OracleDriver");
          connection = DriverManager.getConnection(Host, "GANTENG", "tanto");
          statement = connection.createStatement();
          String Data = "select * from  MASTERBARANG";
          rs = statement.executeQuery(Data);
%>

<table border="1" align="center" width="600px" color ="brown">
    <tr>
        <th>KODE BARANG</th> 
        <th>NAMA BARANG</th>
        <th>HARGA JUAL</th>
        <th>HARGA BELI</th>
        <th>SATUAN</th>
        <th>KATEGORI</th>
        <th> <a href= "tambahdata.jsp" >tambah </a></th>
    
         
    </tr>
    
<%
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
%>
</table>


   <a class="reload btn" href="test2.jsp">Penjualan </a>
  	      </div>
  	    </div>
  	    <img src="phones.png" alt="phones">
      </section>
<link rel="stylesheet" type="text/css" href="style.css">
<
</body>
</html>