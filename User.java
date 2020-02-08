package com.start;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose one option \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Power");
		int n=sc.nextInt();
		System.out.println("Choose one option \n 1.Integers \n 2.Float");
		int k=sc.nextInt();
		System.out.println("Enter two numbers");
		int a=0,b=0;
		if(k==1) {
		 a=sc.nextInt();
		 b=sc.nextInt();
		}
		float c=0.0f,d=0.0f;
		if(k==2) {
			c=sc.nextFloat();
			d=sc.nextFloat();
		}
		if(n==1 && k==1) {
			Add m=new Add(a,b);
		}
		if(n==2 && k==1) {
			Subtract m=new Subtract(a,b);
		}
		if(n==3 && k==1) {
			Multiply m=new Multiply(a,b);
		}
		if(n==4 && k==1) {
			Power m=new Power(a,b);
		}
		if(n==1 && k==2) {
			Add m=new Add(c,d);
		}
		if(n==2 && k==2) {
			Subtract m=new Subtract(c,d);
		}
		if(n==3 && k==2) {
			Multiply m=new Multiply(c,d);
		}
		if(n==4 && k==2) {
			Power m=new Power(c,d);
		}
	}

}
