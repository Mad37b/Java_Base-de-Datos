package com.iesVda.oracleDBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CountriesDao implements DaoInterface<Countries> {

	// atributos de la clase
	String query;
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
	public Countries get(Countries t) {

		// obtener country_id

		query = "select * From Countries where country_id=" + t.getCountry_id();

		try {
			cursor = stmt.executeQuery(query);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("country_id"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public List<Countries> getAll() {
		query=" Select * From Countries";
		try {
			cursor = stmt.executeQuery(query);
				while ( cursor.next()) {
					System.out.println("id = " + cursor.getInt("Country_id")+" Nombre =" +cursor.getString("Country_name")+"<BR>");
				}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return getAll();
	}

	@Override
	public Countries save(Countries t) {

		// insertar un nombre nuevo de un pais

		query = "Insert into Countries (Country_name,Country_id) VALUES" + "(" + t.getCountry_name() + ")" + "("
				+ t.getCountry_id() + ")";
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println(
						"id" + cursor.getInt(t.country_name) + "Name = " + cursor.getString(t.country_name) + "<BR>");
			}
			cursor.close();
			stmt.close();
			Conexion.close();
		} catch (SQLException e) {
			System.out.println("No found query save Countries");
			e.printStackTrace();

		}
		return t;

	}

	@Override
	public Countries update(Countries t) {

		query = "UPDATE Countries SET Region_Name = " + t.getCountry_name() + "Where" + t.getCountry_id();
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println("id = " + cursor.getInt(t.getCountry_id()) + " Name "
						+ cursor.getString(t.getCountry_name() + " <BR>"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return t;

		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Countries t) {
		query=" Delete FROM Countries Where region_name = "+ t.getCountry_name();
		
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println("id = " + cursor.getInt(t.getCountry_id()) + " Name "
						+ cursor.getString(t.getCountry_name() + " <BR>"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
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

	@Override
	public Countries update(Countries t, String[] params) {
		// TODO Auto-generated method stub
		return null;
	}


}