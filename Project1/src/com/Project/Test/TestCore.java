package com.Project.Test;

import com.Project.M.ETCore;
import com.Project.M.ETLog;

public class TestCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1 */
		ETLog.debug("Next(int)");
		for (int i = 0; i < 10; i++) {
			System.out.println(ETCore.Next(1000));
		}
		ETLog.LINE();
		
		/* 2 */
		ETLog.debug("Rand(int)");
		for (int i = 0; i < 10; i++) {
			System.out.println(ETCore.Rand(123));
		}
		ETLog.LINE();
		
		/* 3 */
		ETLog.debug("Rand(int, int)");
		for (int i = 0; i < 10; i++) {
			ETLog.debug(String.valueOf(ETCore.Rand(23, 9)));
		}
		ETLog.LINE();
	}

}
