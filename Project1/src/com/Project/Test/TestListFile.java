package com.Project.Test;

import com.Project.M.ETFile;
import com.Project.M.ETLog;

public class TestListFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (String itemString : ETFile.getCSVFile()) {
			ETLog.debug(itemString);
		}
	}

}
