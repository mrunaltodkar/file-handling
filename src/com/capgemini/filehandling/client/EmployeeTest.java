package com.capgemini.filehandling.client;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.filehandling.model.Employee;
import com.capgemini.filehandling.model.EmployeeDeserialize;
import com.capgemini.filehandling.model.EmployeeSerialize;

public class EmployeeTest {

	private static Employee employee;

	@BeforeClass
	public static void setUp() {
		employee = new Employee(101, "John Deo", 34000);
	}

	@Test
	public void testObjectSerializeSuccessfully() throws IOException, ClassNotFoundException {

		EmployeeSerialize employeeser = new EmployeeSerialize();
		assertTrue(employeeser.serialization(employee));

	}

	@Test
	public void testObjectDeserializeSuccessfull() throws IOException, ClassNotFoundException {

		EmployeeDeserialize deserialize=new EmployeeDeserialize();
		
		assertTrue(deserialize.deserialization().equals(employee));
	}

}
