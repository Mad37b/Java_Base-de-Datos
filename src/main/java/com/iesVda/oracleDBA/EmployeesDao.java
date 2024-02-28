package com.iesVda.oracleDBA;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmployeesDao extends Employees implements DaoInterface<Employees> {
	private List<Employees> Employees = new ArrayList<Employees>();

	public EmployeesDao(){
			
			
			
			//initialize driver class
			try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			System.out.println("Fail to initialize Oracle JDBC driver: " + e.toString() + "<P>");
			}
			String dbUser = "hr";
			String dbPasswd = "oracle";
			String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";



			//connect
			Connection conn = null;
			try {
			conn = DriverManager.getConnection(dbURL,dbUser,dbPasswd);
			System.out.println(" Connection status: " + conn + "<P>");
			} catch(Exception e) {
				System.out.println("Connection failed: " + e.toString() + "<P>"); 
			}



			String sql;
			int numRowsAffected;
			Statement stmt = null;
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet rs = null;
			sql = "select employee_id, first_name from employees";
			try {
				rs = stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while (rs.next()) {
					System.out.println("Id = " + rs.getString("EMPLOYEE_ID") + ", Name = " + rs.getString("FIRST_NAME") + "<BR>"); 
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			System.out.println("<P>");



			System.out.println("<P>");
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



			//commit only when updating the DB
			//conn.commit();
			//disconnect
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Bye bye! The system time is now");
			
		}

	@Override
	public Employees get(Employees table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub

		return Employees;
	}

	@Override
	public void save(Employees table) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Employees table, String[] params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employees table) {
		// Employees.first_name.remove(Employees);
		// TODO Auto-generated method stub

	}

}
