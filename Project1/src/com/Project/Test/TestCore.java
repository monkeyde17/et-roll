package com.Project.Test;

import com.Project.M.ETCore;

public class TestCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1 */
		System.out.println("[Test] -- Next(int)");
		for (int i = 0; i < 10; i++) {
			System.out.println(ETCore.Next(1000));
		}
		System.out.println("------------------");
		
		/* 2 */
		System.out.println("[Test] -- Rand(int)");
		for (int i = 0; i < 10; i++) {
			System.out.println(ETCore.Rand(123));
		}
		System.out.println("------------------");
		
		/* 3 */
		System.out.println("[Test] -- Rand(int, int)");
		for (int i = 0; i < 10; i++) {
			System.out.println(ETCore.Rand(23, 9));
		}
		System.out.println("------------------------");
	}

}
