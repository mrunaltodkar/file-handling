package com.capgemini.filehandling.client;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.filehandling.model.MyClass;

public class MyClassTest {

	private static MyClass student1;
	private static MyClass student2;
	private static MyClass student3;
	private static MyClass student4;
	private static MyClass student5;

	@BeforeClass
	public static void setUp() {
		student1 = new MyClass(25, "Anna", "Computer");
		student2 = new MyClass(74, "John Deo", "Mechanical");
		student3 = new MyClass(45, "Taylor", "Civil");
		student4 = new MyClass(12, "Aayush", "CSE");
		student5 = new MyClass(22, "Mrunal", "IT");
	}

	@Test
	public void test() throws IOException, ClassNotFoundException {
		ArrayList<MyClass> arrayList = new ArrayList<MyClass>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);

		FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(arrayList);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("student.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		ArrayList<MyClass> arrayList2 = (ArrayList<MyClass>) inputStream.readObject();

		Iterator<MyClass> iterator = arrayList.iterator();
		Iterator<MyClass> iterator2 = arrayList2.iterator();

		while (iterator.hasNext() && iterator2.hasNext()) {

			assertTrue(iterator.next().equals(iterator2.next()));
		}

		inputStream.close();

	}

}
