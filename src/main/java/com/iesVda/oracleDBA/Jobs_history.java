package com.iesVda.oracleDBA;
import java.util.*;

/**
 * 
 */
public class Jobs_history {

    /**
     * Default constructor
     */
    public Jobs_history() {
    }

    /**
     * 
     */
    public String employee_id;

    /**
     * 
     */
    public Date start_date;

    /**
     * 
     */
    public Date end_date;

    /**
     * 
     */
    public String job_id;

    /**
     * 
     */
    public String department_id;

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

    
    
}