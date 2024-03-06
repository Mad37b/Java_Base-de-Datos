package com.iesVda.oracleDBA;

import java.io.IOException;
import java.sql.*;

import java.util.List;

public class RegionDao implements DaoInterface<Region> {

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

	public RegionDao() {

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

			stmt = Conexion.createStatement();
		} catch (Exception event2) {
			System.out.println("Connection failed: " + event2.toString() + "<P>");

		}

	}

	@Override
	public Region get(Region t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Region get_name(Region t) {

		// TODO Auto-generated method stub

		// busca una region name por ID ( Where ) getRegion_name();

		sql = "select region_name from Regions Where Region_id=" + t.getRegion_name();

		// Devolver un nombre

		try {
			this.cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Region Name = " + cursor.getString("Region_Name") + "<BR>");

			}
			cursor.close();
			stmt.close();
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		return t;

	}

	@Override
	public Region get_id(Region t) {
		// TODO Auto-generated method stub

		sql = "select region_name from Regions Where Region_id=" + t.getRegion_id();

		try {
			this.cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Region Id = " + cursor.getInt("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
			cursor.close();
			stmt.close();
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		return t;
	}

	@Override
	public List<Region> getAll() {
		// TODO Auto-generated method stub

		sql = "Select * From Region;";
		try {
			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
			cursor.close();
			stmt.close();
			Conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		// commit only when updating the DB
		// conn.commit();
		// disconnect

		return getAll();
	}

	public void delete(Region t) {

		sql = "Delecte FROM Regions WHERE region_name = " + t.getRegion_name();
		try {
			this.cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
			cursor.close();
			stmt.close();
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

	}

	public Region update(Region t, String[] params) {
		// TODO Auto-generated method stub
		sql = "UPDATE Regions SET Region_name =" + t.getClass();
		try {
			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println(
						"Id = " + cursor.getString("region_id") + ", Name = " + cursor.getInt("region_name") + "<BR>");
			}

			cursor.close();
			stmt.close();
			Conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		return t;
	}

	@Override
	public Region save(Region t) {
		// TODO Auto-generated method stub
		sql = "Insert into Regions (Region_name) VALUES" + "(" + t.getRegion_name() + ")";
		try {
			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}

			stmt.close();
			cursor.close();
			Conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("<P>");

		System.out.println("<P>");

		return t;
	}
}
