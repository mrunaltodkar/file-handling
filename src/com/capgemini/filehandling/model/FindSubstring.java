package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.IOException;

public class FindSubstring {

	private int countLine;

	public FindSubstring() {
		countLine = 0;
	}

	public int getCountLine() {
		return countLine;
	}

	public void setCountLine(int countLine) {
		this.countLine = countLine;
	}

	public boolean checkSubstringPresentOrNot(BufferedReader bufferedReader, String subString) {
		boolean flag = false;
		String content;

		try {
			while ((content = bufferedReader.readLine()) != null) {

				countLine++;
				if (content.contains(subString)) {
					flag = true;
					break;
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		return flag;
	}
}
