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

	public Region get(Region t) {

		// consultar todo los datos

		// busca una region name por ID getRegion_id();

		// busca una region id por Nombre ( Where ) getRegion_name();

		sql = "select region_name from Regions Where Region_id=" + t.getRegion_id();
		sql = "select region_name from Regions Where Region_id=" + t.getRegion_name();
		try {
			cursor = stmt.executeQuery(sql);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_ID") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
			cursor.close();
			stmt.close();
			Conexion.close();

		} catch (SQLException e) {

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

	@Override
	public Region save(Region t) {
		// TODO Auto-generated method stub

		sql = "Insert into Region (Region_name) VALUES(Oceania)";
		try {
			cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
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

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public Region update(Region t, String[] params) {
		// TODO Auto-generated method stub
		sql = "UPDATE Regions SET Region_name =" + t.getClass();
		try {
			cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// While

		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("region_id") + ", Name = "
						+ cursor.getString("region_name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
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

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public void delete(Region t) {
		// TODO Auto-generated method stub

		sql = "Delecte FROM Regions WHERE region_name= America";
		try {
			this.cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
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

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Region get_name(Region t) {
		// TODO Auto-generated method stub

		// Devolver todo los nombres

		sql = "select region_name From Regions";

		// Devolver un nombre

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

		System.out.println("<P>");

		return t;

	}

	@Override
	public Region get_id(Region t) {
		// TODO Auto-generated method stub

		sql = "Select region_id From Region";

		try {
			this.cursor = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("Region_id") + ", Name = "
						+ cursor.getString("Region_Name") + "<BR>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("<P>");

		System.out.println("<P>");
		try {
			cursor.close();
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

		// commit only when updating the DB
		// conn.commit();
		// disconnect
		try {
			Conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

}
