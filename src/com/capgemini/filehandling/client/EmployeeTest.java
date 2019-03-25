package com.capgemini.filehandling.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.capgemini.filehandling.model.Employee;

public class EmployeeTest {

	@Test
	public void testObjectWriteIntoFileAndReadIntoFileSuccessfully()
			throws IOException, ClassNotFoundException {
		Employee employee = new Employee(101, "John Deo", 34000);
		Employee employee3 = new Employee(102, "Anna", 36000);

		FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("employee.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		Employee employee2 = (Employee) inputStream.readObject();

		inputStream.close();

		assertTrue(employee.equals(employee2));
		assertFalse(employee.equals(employee3));
	}

}
