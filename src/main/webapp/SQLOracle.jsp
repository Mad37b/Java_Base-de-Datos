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



String sql;
int numRowsAffected;
Statement stmt = conexion.createStatement();
ResultSet cursor;
/* ---- */
int job_id;
Date start_date;
Date end_date;
int employee_id;
String department_id;
/* ---- */ 
double min_salary=0;
double max_salary=0;
String job_title="{}";

/* ---- */ 

String first_name;
String last_name;
String email;
int phone_number;
Date hire_date;
double salary=0;
double commission_pct;
int manager_id;
/*int department_id;*/


// insert query regions
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Insercion de datos en la tabla Regiones "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
 
//sql="insert into Regions (Region_Name,Region_ID) Values('Groelandia','8')";


/*cursor = stmt.executeQuery(sql);*/

// select query regions
sql = "select * from Regions";
cursor = stmt.executeQuery(sql);
while (cursor.next()) {
out.println("Id = " + cursor.getString("REGION_ID") + ", Name Region = " + cursor.getString("REGION_NAME")  + "<BR>"); 
}

// select query countries 

sql=" select * from countries";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de las paises "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
out.println("Id = " + cursor.getString("country_ID") + ", Name Country = " + cursor.getString("Country_NAME")  + "<BR>"); 
}

//select query countries 

sql=" select * from locations";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de las localizaciones "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
	
out.println( "<BR>"+"Id = " + cursor.getString("location_ID") + ", Street_Address = " + cursor.getString("street_address")  + ",Postal_Code = " + cursor.getString("postal_code")+ "<BR>"+ "<BR>"); 
}

sql="select * from departments";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de los Departamentos "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
	
out.println( "<BR>"+"Id = " + cursor.getString("department_ID") + ", department_name = " + cursor.getString("department_name")  + "manager_id = " + cursor.getString("manager_id")+ "location_id = " + cursor.getString("location_id")+"<BR>"+ "<BR>"); 
}

sql="select * from job_history";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de los historiales de trabajo "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
	job_id=cursor.getInt("Employee_ID");
	start_date=cursor.getDate("Start_date");
	end_date=cursor.getDate("End_date");
	employee_id=cursor.getInt("Employee_id");
	department_id=cursor.getString("department_id");
	
	 
	
out.println( "<BR>"+"Id = " + job_id +",  Start_date "+start_date+",  End_date "+end_date+",  Employee_id = "+employee_id+", Department_id  = "+department_id+"<BR>"+ "<BR>"); 
}


sql="select * from jobs";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de los trabajos "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
	job_id=cursor.getInt("job_ID");
	start_date=cursor.getDate("job_title");
	end_date=cursor.getDate("min_salary");
	employee_id=cursor.getInt("max_salary");
	
	
	 
	
out.println( "<BR>"+"Id = " + job_id +",  job_title =" +job_title+",  min_salary =  "+min_salary+",  max_salary = "+max_salary+"<BR>"+ "<BR>"); 
}

sql="select * from Employees";
cursor = stmt.executeQuery(sql);
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
out.println("<br>"+"Consulta de los datos de los Empleados "+"<br>");
out.println("<br>"+"///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// "+"<br>");
while (cursor.next()) {
	job_id=cursor.getInt("Employee_ID");
	first_name=cursor.getString("first_name");
	last_name=cursor.getString("last_name");
	email=cursor.getString("email");
	phone_number=cursor.getString("phone_number");
	employee_id=cursor.getInt("Employee_id");
	department_id=cursor.getString("department_id");
	
	 
	
out.println( "<BR>"+"Id = " + job_id +",  first_name =" +first_name+", last_name =  "+last_name+",  email = "+email+"phone_number"+phone_number+"hire_date"+hire_date+"job_id"+job_id+"salary"+salary+"commission_pct"+commission_pct+"manager_id"+manager_id+"department_id"+department_id+"<BR>"+ "<BR>"); 
}




out.println("<P>");



out.println("<P>");
cursor.close();
stmt.close();



//commit only when updating the DB
//conn.commit();
//disconnect
conexion.close();
%> 









<HTML>
<BODY>
<h3>Bye bye! The system time is now</h3> 

<%=new java.util.Date() %>

</BODY>
</HTML>