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

   
    public int job_id;

    /**
     * 
     */
    public String job_title;

    /**
     * 
     */
    public double min_salary=0;

    /**
     * 
     */
    private double max_salary=0;

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public double getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(Float min_salary) {
		this.min_salary = min_salary;
	}

	public double getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(Float max_salary) {
		this.max_salary = max_salary;
	}

    
    
}