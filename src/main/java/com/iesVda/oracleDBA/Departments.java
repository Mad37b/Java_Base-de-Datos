package com.iesVda.oracleDBA;
import java.util.*;

/**
 * 
 */
public class Departments extends Employees {

    /**
     * Default constructor
     */
    public Departments() {
    }

    /**
     * 
     */
    public String department_id;

    /**
     * 
     */
    public String department_name;

    /**
     * 
     */
    public boolean manager_id;

    /**
     * 
     */
    public String location_id;

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public boolean getManager_id() {
		return manager_id;
	}

	public void setManager_id(boolean manager_id) {
		this.manager_id = manager_id;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
    
    // relaciones entre clases
	
	Employees DepartmentsEmployees_id;
   Locations DepartmentsLocation_id;

}