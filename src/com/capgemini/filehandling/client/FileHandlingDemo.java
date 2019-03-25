package com.capgemini.filehandling.client;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("C:\\Abbas\\BankAccount.java");
		 * System.out.println(file.exists()); System.out.println(file.isFile());
		 * 
		 * File file1 = new File("C:\\Abbas\\BankAccount");
		 * System.out.println(file1.exists()); System.out.println(file1.isFile());
		 */

		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("File is created successfully...."); }
		 * 
		 * FileWriter writer = new FileWriter(file); BufferedWriter writer=new
		 * BufferedWriter(new FileWriter(file)); PrintWriter writer = new
		 * PrintWriter(new FileWriter(file,true)); writer.println("Hello.....");
		 * writer.println("How are you....."); writer.println("Bye.....");
		 * writer.println("Bye....."); writer.close();
		 * System.out.println("Write successfully....");
		 */
		/*FileReader reader = new FileReader("C:\\Abbas\\Core_Java\\Day1-Assignments\\src\\armstrong.java");

		BufferedReader bufferReader = new BufferedReader(reader);

		PrintWriter writer = new PrintWriter("Armstrong.java");

		String content;

		while ((content = bufferReader.readLine()) != null) {

			// System.out.println(content);

			writer.println(content);
		}
		writer.close();
		bufferReader.close();
		reader.close();
		*/
		
		/*
		 * File windowDirectory=new File("C:\\Program Files");
		 * 
		 * String content[]=windowDirectory.list();
		 * 
		 * for (String string : content) { System.out.println(string); }
		 */
		File newDir=new File("myDir");
		
		if(!newDir.exists()) {
			newDir.mkdir();
		}
		
		File file=new File(newDir,"myfile.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
	}
}
