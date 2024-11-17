package com.dk.lecture1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int sum = x + y;
		System.out.println(sum);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		System.out.println("result="+(num1+num2));
		System.out.println("enter name1-");
		String name1=sc.next();
		
		System.out.println("enter name2-");
		String name2=sc.nextLine();
		
		System.out.println("name1 - "+name1);
		
		
		System.out.println("name2 - "+name2);
		
	} 

}
