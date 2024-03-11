package com.iesVda.oracleDBA;

import java.lang.reflect.AccessFlag.Location;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class LocationsDao extends Locations implements DaoInterface<Locations>{
	
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

	
	
	
	
public LocationsDao() {
	
}
	
	@Override
	public Locations get(Locations t) {

		// obtener country_id

		query = "select * From Locations where Location_id=" + t.getLocation_id();

		try {
			cursor = stmt.executeQuery(query);

			while (cursor.next()) {
				System.out.println("Id = " + cursor.getString("location_id"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public List<Locations> getAll() {
		query=" Select * From Locations";
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
	public Locations save(Locations t) {

		// insertar un nombre nuevo de un pais

		query = "Insert into Locations (Street_address,Locations_id) VALUES" + "(" + t.getStreet_address() + ")" + "("
				+ t.getCountry_id() + ")";
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println(
						"id" + cursor.getInt(t.location_id) + "Name = " + cursor.getString(t.getStreet_address()) + "<BR>");
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

	public Locations update(Locations t) {

		query = "UPDATE Locations SET Street_address() = " + t.getStreet_address() + "Where" + t.getLocation_id();
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println("id = " + cursor.getInt(t.getLocation_id()) + " Name "
						+ cursor.getString(t.getStreet_address() + " <BR>"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return t;

		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Locations t) {
		query=" Delete FROM Countries Where region_name = "+ t.getLocation_id();
		
		try {
			cursor = stmt.executeQuery(query);
			while (cursor.next()) {
				System.out.println("id = " + cursor.getInt(t.getLocation_id()) + " Name "
						+ cursor.getString(t.getStreet_address() + " <BR>"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

	@Override
	public Locations get_name(Locations t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locations get_id(Locations t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locations update(Locations t, String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Countries update(Countries t) {
		// TODO Auto-generated method stub
		return null;
	}





	
	


}