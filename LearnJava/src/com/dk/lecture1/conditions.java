package com.dk.lecture1;

import java.util.*;

public class conditions {
	public static void main(String args []) {
		Scanner sc= new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a==b) {
			System.out.print("equal");
		}else {
			if (a>b) {
				System.out.println("greater");
			}else {
				System.out.println("Lesser");
			}
		}
	}
}
	
	
	


