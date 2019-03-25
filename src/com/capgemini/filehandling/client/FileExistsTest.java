package com.capgemini.filehandling.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.filehandling.model.FileExists;

public class FileExistsTest {

	private static FileExists FileExists;

	@BeforeClass
	public static void setUp() {
		FileExists  = new FileExists();
	}

	@Test
	public void testFileFound() {
		File file = new File("C:\\MrunalT\\Core_Java\\file-handling\\test.txt");
		assertTrue(FileExists.isFileExits(file));
	}

	@Test
	public void testFileNotFound() {
		File file = new File("C:\\MrunalT\\Core_Java\\file-handling\\test3.txt");
		assertFalse(FileExists.isFileExits(file));
	}
}
