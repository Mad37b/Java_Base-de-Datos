package com.iesVda.oracleDBA;

import java.util.*;

/**
 * 
 */
public class Employees {

	/**
     * Default constructor
     */
    public Employees() {
    }

	
	private int employee_id;


	private String first_name;

	
	private String last_name;

	
	private String email;

	
	private String phone_number;

	
	private Date hire_date;


	private int jobs_id;

	
	private double salary=0;

	public double commision_pct;

	/**
	 * 
	 */
	private boolean manager_id;
	private boolean isManager;
	private boolean isWorking;
	/**
	 * 
	 */
	private int deparment_id;

	// relaciones entre clases

	Departments EmployeeDepartment_id;
	Departments EmployeeDepartment_Manager;
	Departments employeeDepartment;
	Jobs jobsEmployees_id;
	Jobs_history historyEmployees_id;
	

	// Metodos

	// Setter y Getters

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public int getJob_id() {
		return jobs_id;
	}

	public void setJob_id(int jobsEmployees_id) {
		this.jobs_id = jobsEmployees_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public double getCommision_pct() {
		return commision_pct;
	}

	public void setCommision_pct(int commision_pct) {
		this.commision_pct = commision_pct;
	}

	public boolean getManager_id() {
		return manager_id;
	}

	public void setManager_id(boolean EmployeeDepartment_Manager) {
		this.manager_id = EmployeeDepartment_Manager;
	}

	public int getDeparment_id() {
		return deparment_id;
	}

	public void setDeparment_id(int EmployeeDepartment_id) {
		this.deparment_id = EmployeeDepartment_id;
	}

}