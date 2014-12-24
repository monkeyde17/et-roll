package com.Project.M;

import java.util.List;
import com.Project.V.ETBoxWay;

public class ETDataManager {
	
	
	private String classFileUrl = "";
	private int randSecond = -1;
	private String randWay = ETBoxWay.RAND_STRING;
	private int showWay = 0;
	private int deltaTime = 0;
	
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
	
	public ETPerson getRandPerson() {
		int cnt = list.size();
		
		
		int rid = 0;
		
		if (randWay.equals("rand")) {
			rid = ETCore.Rand(cnt);
		} else if (randWay.equals("roll")) {
			rid = ETCore.Next(cnt);
		} else {
			rid = ETCore.Rand(cnt);
		}
		
		return list.get(rid);
	}

	public int getShowWay() {
		return showWay;
	}

	public void setShowWay(int showWay) {
		this.showWay = showWay;
	}

	public int getDeltaTime() {
		return deltaTime;
	}

	public void setDeltaTime(int deltaTime) {
		if (deltaTime < 30) deltaTime = 30;
		this.deltaTime = deltaTime;
	}

}

