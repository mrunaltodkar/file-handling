package com.capgemini.filehandling.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.FindSubstring;

public class FindSubstringTest {

	@Test
	public void testSubstringPresentInFile() throws IOException {
		FindSubstring findSubstring = new FindSubstring();
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertTrue(findSubstring.checkSubstringPresentOrNot(bufferedReader,
				"Hello World"));
		assertEquals(7, findSubstring.getCountLine());
		bufferedReader.close();
		fileReader.close();
	}

	@Test
	public void testSubstringNotPresentInFile() throws IOException {
		FindSubstring findSubstring = new FindSubstring();
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertFalse(findSubstring.checkSubstringPresentOrNot(bufferedReader,
				"Have a nice day!!"));
		bufferedReader.close();
		fileReader.close();
	}
	

}
