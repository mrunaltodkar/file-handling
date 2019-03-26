package com.capgemini.filehandling.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialize {

	public boolean serialization(Employee employee) {
		
		try{
			FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
			return true;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}

