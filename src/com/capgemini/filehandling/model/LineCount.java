package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.IOException;

public class LineCount {

	public int countNumberOfLineInFile(BufferedReader bufferedReader) {
		int countLine = 0;
		String content;

		try {
			while ((content = bufferedReader.readLine()) != null) {

				countLine++;
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return countLine;
	}
}
