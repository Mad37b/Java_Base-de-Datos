package Java_DB;

public class Java_Empresa {

	class Employess {
		// Atributos de la clase
		String employee_id;
		String first_name;
		String last_name;
		String email;
		int phone_number;
		String hire_date;
		String job_id;
		float salary;
		float commission_pct;
		int manager_id;
		int department_id;

		// Getters and setters employees

		public String getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(String employee_id) {
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

		public int getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(int phone_number) {
			this.phone_number = phone_number;
		}

		public String getHire_date() {
			return hire_date;
		}

		public void setHire_date(String hire_date) {
			this.hire_date = hire_date;
		}

		public String getJob_id() {
			return job_id;
		}

		public void setJob_id(String job_id) {
			this.job_id = job_id;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public float getCommission_pct() {
			return commission_pct;
		}

		public void setCommission_pct(float commission_pct) {
			this.commission_pct = commission_pct;
		}

		public int getManager_id() {
			return manager_id;
		}

		public void setManager_id(int manager_id) {
			this.manager_id = manager_id;
		}

		public int getDepartment_id() {
			return department_id;
		}

		public void setDepartment_id(int department_id) {
			this.department_id = department_id;
		}

	}

	class Departments {

		// Atributos de la clase
		String department_id;
		String department_name;
		String manager_id;
		String location_id;

		// Getters and setters employees

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

		public String getManager_id() {
			return manager_id;
		}

		public void setManager_id(String manager_id) {
			this.manager_id = manager_id;
		}

		public String getLocation_id() {
			return location_id;
		}

		public void setLocation_id(String location_id) {
			this.location_id = location_id;
		}

	}

	class Jobs {
		// Atributos de la clase

		String job_id;

		String job_title;
		float min_salary;
		float max_salary;

		// Getters and setters employees

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

		public float getMin_salary() {
			return min_salary;
		}

		public void setMin_salary(float min_salary) {
			this.min_salary = min_salary;
		}

		public float getMax_salary() {
			return max_salary;
		}

		public void setMax_salary(float max_salary) {
			this.max_salary = max_salary;
		}

	}

	class Jobs_History extends Jobs {
		// Atributos de la clase

		String employee_id;
		String start_date;
		String end_date;
		String job_id;
		String department_id;

		// Getters and setters employees

		public String getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(String employee_id) {
			this.employee_id = employee_id;
		}

		public String getStart_date() {
			return start_date;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		public String getEnd_date() {
			return end_date;
		}

		public void setEnd_date(String end_date) {
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

	class Country {
		String country_id;
		String country_name;
		String region_id;

		// Getters and setters employees

		public String getCountry_id() {
			return country_id;
		}

		public void setCountry_id(String country_id) {
			this.country_id = country_id;
		}

		public String getCountry_name() {
			return country_name;
		}

		public void setCountry_name(String country_name) {
			this.country_name = country_name;
		}

		public String getRegion_id() {
			return region_id;
		}

		public void setRegion_id(String region_id) {
			this.region_id = region_id;
		}

	}

	class Region extends Country {
		String region_id;
		String region_name;

// Getters and setters employees

		public String getRegion_id() {
			return region_id;
		}

		public void setRegion_id(String region_id) {
			this.region_id = region_id;
		}

		public String getRegion_name() {
			return region_name;
		}

		public void setRegion_name(String region_name) {
			this.region_name = region_name;
		}

	}

	class locations extends Region {

		int location_id;
		String Street_address;
		int postal_code;
		String city;
		String state_province;
		String country_id;

		// Getters and setters employees

		public int getLocation_id() {
			return location_id;
		}

		public void setLocation_id(int location_id) {
			this.location_id = location_id;
		}

		public String getStreet_address() {
			return Street_address;
		}

		public void setStreet_address(String street_address) {
			Street_address = street_address;
		}

		public int getPostal_code() {
			return postal_code;
		}

		public void setPostal_code(int postal_code) {
			this.postal_code = postal_code;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState_provide() {
			return state_province;
		}

		public void setState_provide(String state_provide) {
			this.state_province = state_provide;
		}

		public String getCountry_id() {
			return country_id;
		}

		public void setCountry_id(String country_id) {
			this.country_id = country_id;
		}

	}

}
