package com.capgemini.filehandling.model;

import java.io.File;
import java.io.Serializable;

public class FileExists implements Serializable {
	
	public boolean isFileExits(File file){
		return file.exists();
	}
	
}
