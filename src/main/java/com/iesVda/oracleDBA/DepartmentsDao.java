package com.iesVda.oracleDBA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DepartmentsDao implements DaoInterface<Departments>{
	
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
	
	
	
	
public DepartmentsDao() {
	
}




@Override
public Departments get_name(Departments t) {
	// TODO Auto-generated method stub
	query = "select * From Deparments where Department_name=" + t.getDepartment_id();

	try {
		cursor = stmt.executeQuery(query);

		while (cursor.next()) {
			System.out.println("Id = " + cursor.getInt("Deparment_id"));

		}

	} catch (SQLException e) {
		e.printStackTrace();
	}

	return t;
}
public Departments get_id(Departments t) {

	// obtener country_id

	query = "select * From Deparments where Department_id=" + t.getDepartment_id();

	try {
		cursor = stmt.executeQuery(query);

		while (cursor.next()) {
			System.out.println("Id = " + cursor.getInt("Deparment_id"));

		}

	} catch (SQLException e) {
		e.printStackTrace();
	}

	return t;
}

@Override
public List<Departments> getAll() {
	query=" Select * From Locations";
	try {
		cursor = stmt.executeQuery(query);
			while ( cursor.next()) {
				System.out.println("id = " + cursor.getInt("Deparment_id")+" Nombre =" +cursor.getString("Department_name")+ "isManager = "+cursor.getInt("isManager")+cursor.getInt("Location_id")+"<BR>");
			}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	// TODO Auto-generated method stub
	return getAll();
}

@Override
public Departments save(Departments t) {

	// insertar un nombre nuevo de un pais

	query = "Insert into Locations (Street_address,Locations_id) VALUES" + "(" + t.getDepartment_name() + ")" + "("
			+ t.getDepartment_id() + ")";
	try {
		cursor = stmt.executeQuery(query);
		while (cursor.next()) {
			System.out.println(
					"id" + cursor.getInt(t.location_id) + "Name = " + cursor.getString(t.getDeparment_id()) + "<BR>");
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

public Departments update(Departments t,String[] params) {

	query = "UPDATE Departments SET Deparment_name() = " + t.getDepartment_name() + "Where" + t.getDepartment_id();
	try {
		cursor = stmt.executeQuery(query);
		while (cursor.next()) {
			System.out.println("id = " + cursor.getInt(t.getLocation_id()) + " Name "
					+ cursor.getString(t.getDepartment_name() + " <BR>"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return t;

	// TODO Auto-generated method stub

}

@Override
public void delete(Departments t) {
	query=" Delete FROM Countries Where region_name = "+ t.getLocation_id();
	
	try {
		cursor = stmt.executeQuery(query);
		while (cursor.next()) {
			System.out.println("id = " + cursor.getInt(t.getLocation_id()) + " Name "
					+ cursor.getString(t.getDepartment_name() + " <BR>"));
		}
		
	}catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	// TODO Auto-generated method stub

}







@Override
public Countries update(Countries t) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Departments get(Departments t) {
	// TODO Auto-generated method stub
	return null;
}
}

