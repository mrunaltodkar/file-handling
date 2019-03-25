package com.capgemini.filehandling.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.filehandling.model.LineCount;

public class LineCountTest {

	private static LineCount lineCount;

	@BeforeClass
	public static void setUp() {
		lineCount = new LineCount();
	}

	@Test
	public void testNumberOfLineInFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(6, lineCount.countNumberOfLineInFile(bufferedReader));
	}

	@Test
	public void testNumberOfLineWithSpacesInFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test2.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(9, lineCount.countNumberOfLineInFile(bufferedReader));
	}
	
	
}
