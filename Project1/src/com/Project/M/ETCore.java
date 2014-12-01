package com.Project.M;

public class ETCore {

	private static int MAXNUM = 0xffffff;
	
	private static int CurNum = Rand(999);
	
	/**
	 * 
	 * @param cnt
	 * @return
	 */
	public static int Rand(int cnt) {
		CurNum = (int)(Math.random() * MAXNUM);
		return CurNum % cnt;
	}
	
	/**
	 * 
	 * @param cnt
	 * @param start
	 * @return
	 */
	public static int Rand(int cnt, int start) {
		return Rand(cnt) + start;
	}
	
	private static int STEP = 1;

	/**
	 * return the next number
	 * 
	 * @param cnt
	 * @return the next number
	 */
	public static int Next(int cnt) {
		CurNum += STEP;
		CurNum %= cnt;
		return CurNum;
	}
}
