package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.IOException;

public class WordCount {

	public int countNumberOfWordInFile(BufferedReader bufferedReader) {

		int countWord = 0;
		String content;

		try {
			while ((content = bufferedReader.readLine()) != null) {

				countWord = countWord + content.split("\\s+").length;
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return countWord;
	}
}
