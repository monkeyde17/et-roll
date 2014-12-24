package com.Project.M;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ETReader {
	
	private final String DIR = "class";
	private final String ENCODE = "GBK";
	
	
	private String READFILENAME = "";
	
	ETReader(String file) {
		// TODO Auto-generated constructor stub
		READFILENAME = DIR + File.separator + file;
	}
	
	public List<ETPerson> getCurList( ) {
		try {
			InputStreamReader reader = new InputStreamReader(
					new FileInputStream(READFILENAME), ENCODE);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = "";
			boolean first = true;
			
			List<ETPerson> personsList = new ArrayList<ETPerson>();
			while ((line = bufferedReader.readLine()) != null) {
				if (first) {
					first = false;
					continue;
				}
				ETPerson person = new ETPerson(line);
				personsList.add(person);
			}
			
			return personsList;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
