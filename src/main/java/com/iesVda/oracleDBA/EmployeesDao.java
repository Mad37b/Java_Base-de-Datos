package com.iesVda.oracleDBA;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmployeesDao implements DaoInterface<Employees> {
	
	String query;
	int numRowsAffected;

	Connection Conexion = null;
	ResultSet cursor;
	// public interface
	Statement stmt;

	public static final String dbUser = "hr";
	String dbPasswd = "oracle";
	String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";
	
	public EmployeesDao() {
		
	}
	
	

	@Override
	public Employees get_name(Employees t) {
		
		query="select firts_name FROM Employees where firts_name = "+ getEmployee_id(t);
		
		try {
			cursor = stmt.executeQuery(query);

			while (cursor.next()) {
				System.out.println("Employee id = " + cursor.getInt("Employee_id")+", First Name = "+cursor.getString("First_name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return t;
	}

	private Employees getEmployee_id(Employees t) {
		// TODO Auto-generated method stub
		
		query="Select Employee_id FROM Employee_id Where "+getEmployee_id(t);
		
		try {
			cursor = stmt.executeQuery(query);

			while (cursor.next()) {
				System.out.println("Employee id = " + cursor.getInt("Employee_id")+", First Name = "+cursor.getString("First_name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return t;
	}
	
	public Employees getEmployeebyID ( int id) {
		
		Employees employee = new Employees (); 
		
		query = " Select * From  Employees Where Emplooyee_id = " + id;
		
		try {
			cursor = stmt.executeQuery(query);
			while ( cursor.next()){
				
				System.out.println("Employee_id" +cursor.getInt("Employee_id")+" First_Name"+cursor.getString("First_Name")
				+"Last_Name"+cursor.getString("Last_Name")+"Email"+cursor.getString("Email")+", Phone Number"+cursor.getString("Email")
				+",Hire_Date" +cursor.getDate("Hire_Date")+",Job_id "+cursor.getInt("Job_id")+",Salary"+ cursor.getInt("Salary")
				+",Commission_PCT "+cursor.getInt("Commission_PCT")+",Manager_id"+cursor.getInt("Manager_id")+",Department_id"+cursor.getInt("Department_id"));
				
				employee=query;
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return employee ;
		
	}



	

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		return  getAll() ;
	}

	@Override
	public Employees save(Employees t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employees update(Employees t, String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employees t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees get(Employees t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employees get_id(Employees t) {
		// TODO Auto-generated method stub
		return t;
	}



	@Override
	public Countries update(Countries t) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
