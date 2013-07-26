package org.labor.pojos;

// Generated Jul 26, 2013 2:30:51 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeeToJob generated by hbm2java
 */
@Entity
@Table(name = "Employee_to_Job", catalog = "tempit")
public class EmployeeToJob implements java.io.Serializable {

	private Integer id;
	private Integer employeeId;
	private Integer jobId;

	public EmployeeToJob() {
	}

	public EmployeeToJob(Integer employeeId, Integer jobId) {
		this.employeeId = employeeId;
		this.jobId = jobId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "employee_id")
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "job_id")
	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

}
