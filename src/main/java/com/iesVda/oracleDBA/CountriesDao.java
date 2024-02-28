 package com.iesVda.oracleDBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CountriesDao implements DaoInterface<Countries>{
	
	// atributos de la clase
		String sql;
		int numRowsAffected;

		Connection Conexion = null;
		ResultSet cursor;
		// public interface
		Statement stmt;
		
		public static final String dbUser = "hr";
		String dbPasswd = "oracle";
		String dbURL = "jdbc:oracle:thin:@localhost:1521/freepdb1";

		// inicializar
	
	
public CountriesDao() {
	
	// inicializacion
	try {
		Class.forName("oracle.jdbc.drive.OracleDriver");
	} catch (Exception event) {
		System.out.println("Fail to initialize Oracle drive: " + event.toString() + "<P>");
	}

	

	// Conexion

	try {
		Conexion = DriverManager.getConnection(dbURL, " - " + dbUser, " - " + dbPasswd);
		System.out.println(" Connection status: " + Conexion + "<P>");
	} catch (Exception event2) {
		System.out.println("Connection failed: " + event2.toString() + "<P>");

	}

	try {
		stmt = Conexion.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	@Override
	public Countries get(Countries table) {
		
		// obtener country_id
		
		sql="select * From Countries where country_id="+table.getCountry_id();
		
		try {
			cursor=stmt.executeQuery(sql);
			
			while ( cursor.next()) {
				System.out.println("Id = " +cursor.getString("country_id"));
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Countries> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries save(Countries table) {
		return table;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Countries update(Countries table, String[] params) {
		return table;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Countries table) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Countries get_name(Countries t) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Countries get_id(Countries t) {
		// TODO Auto-generated method stub
		return null;
	}


}