package com.iesVda.oracleDBA;
import java.util.*;

/**
 * 
 */
public class Jobs extends Employees {

    /**
     * Default constructor
     */
    public Jobs() {
    }

    /**
     * 
     */
    public String job_id;

    /**
     * 
     */
    public String job_title;

    /**
     * 
     */
    public Float min_salary;

    /**
     * 
     */
    public Float max_salary;

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public Float getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(Float min_salary) {
		this.min_salary = min_salary;
	}

	public Float getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(Float max_salary) {
		this.max_salary = max_salary;
	}

    
    
}