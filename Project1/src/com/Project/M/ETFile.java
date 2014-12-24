package com.Project.M;

import java.io.File;

public class ETFile {
	public static String[] getCSVFile() {
		return new File("class").list();
	}
}
