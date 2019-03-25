package com.capgemini.filehandling.client;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.filehandling.model.WordCount;

public class WordCountTest {

	private static WordCount countWord;

	@BeforeClass
	public static void setUp() {
		countWord = new WordCount();
	}

	@Test
	public void testNumberOfWordInFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertEquals(9, countWord.countNumberOfWordInFile(bufferedReader));
	}
	
	@Test
	public void testNumberOfWordWithExtraSpacesInFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\test.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		assertEquals(7, countWord.countNumberOfWordInFile(bufferedReader));
	}
	
	@Test
	public void testForFileIsEmpty() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\MrunalT\\Core_Java\\file-handling\\Car.java");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		assertEquals(0, countWord.countNumberOfWordInFile(bufferedReader));
	}

}
