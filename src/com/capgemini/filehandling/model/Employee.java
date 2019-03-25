package com.capgemini.filehandling.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeSalary);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee) obj;

		if (this.employeeId == employee.employeeId
				&& this.employeeName.equals(employee.employeeName)
				&& this.employeeSalary == employee.employeeSalary) {
			return true;
		}
		return false;
	}

}
