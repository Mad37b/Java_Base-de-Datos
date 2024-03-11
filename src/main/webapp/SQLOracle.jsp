<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*"%>


<%@ page import="com.iesVda.oracleDBA.*"%>

<%
//initialize driver class
try { 
Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (Exception e) {
out.println("Fail to initialize Oracle JDBC driver: " + e.toString() + "<P>");
}
String dbUser = "hr";
String dbPasswd = "oracle";
String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";



//connect
Connection conexion = null;
try {
conexion = DriverManager.getConnection(dbURL,dbUser,dbPasswd);
out.println(" Connection status: " + conexion + "<P>");
} catch(Exception e) {
out.println("Connection failed: " + e.toString() + "<P>"); 
}



String query;
int numRowsAffected;
Statement stmt = conexion.createStatement();
ResultSet cursor;
/* ---- */

// insert query regions
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de la base de datos en JBDC "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
 


// select query regions
query = "Select * From Employees where employee_id = '100' ";
cursor = stmt.executeQuery(query);
while (cursor.next()) {
	
	try{
		out.println("Employee_id = "+cursor.getInt("Employee_id")+", First_name = "+"\n" +"\r"+ cursor.getString("First_name") + "<BR>"); 
	}catch(SQLException e){
		out.println("Department_id = "+("Null")+ "<BR>"+", Depatment_name= "+"\n" +"\r"+ cursor.getString("Department_name") + "<BR>"); 
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

%> 

<HTML>
<BODY>
<h3>Bye bye! The system time is now</h3> 

<%=new java.util.Date() %>

</BODY>
</HTML>