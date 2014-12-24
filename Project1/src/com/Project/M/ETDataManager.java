package com.Project.M;

import com.Project.V.ETBoxWay;

public class ETDataManager {
	
	
	private String classFileUrl = null;
	private int randSecond = -1;
	private String randWay = ETBoxWay.RAND_STRING;
	
	static private ETDataManager instant = null;
	
	static ETDataManager getInstant() {
		if (instant == null) {
			instant = new ETDataManager();
		}
		return instant;
	}

	public String getClassFileUrl() {
		return classFileUrl;
	}

	public void setClassFileUrl(String classFileUrl) {
		this.classFileUrl = classFileUrl;
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
}
