package com.Project.M;

import java.util.List;
import com.Project.V.ETBoxWay;

public class ETDataManager {
	
	
	private String classFileUrl = "";
	private int randSecond = -1;
	private String randWay = ETBoxWay.RAND_STRING;
	
	
	private List<ETPerson> list = null;
	
	static private ETDataManager instant = null;
	static public ETDataManager getInstant() {
		if (instant == null) {
			instant = new ETDataManager();
		}
		return instant;
	}

	public String getClassFileUrl() {
		return classFileUrl;
	}

	public void setClassFileUrl(String classFileUrl) {
		if (!this.classFileUrl.equals(classFileUrl)) {
			this.classFileUrl = classFileUrl;
			updatePersonList();
		}
	}

	public int getRandSecond() {
		return randSecond;
	}

	public void setRandSecond(int randSecond) {
		this.randSecond = randSecond;
	}

	public String getRandWay() {
		return randWay;
	}

	public void setRandWay(String randWay) {
		this.randWay = randWay;
	}
	
	private void updatePersonList() {
		list = new ETReader(classFileUrl).getCurList();
	}
	
	public List<ETPerson> getPersonList() {
		return list;
	}
	
	public String getRandName() {
		int cnt = list.size();
		int rid = ETCore.Rand(cnt);
		
		ETPerson person = list.get(rid);
		
		return person.getId() + ":\n"+ person.getName();
	}
}

