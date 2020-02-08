package com.start;

public class Add implements Calculate {
	int num1,num2;
	
	public Add(int a,int b){
		num1=a;
		num2=b;
		Calculation(a,b);
	}
	float num3,num4;
	public Add(float a,float b){
		num3=a;
		num4=b;
		Calculation(a,b);
	}
	@Override
	public void Calculation(int num1,int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	public void Calculation(float num1,float num2) {
		// TODO Auto-generated method stub
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}

}
