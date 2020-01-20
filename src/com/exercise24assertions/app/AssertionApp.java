package com.exercise24assertions.app;

import java.util.Scanner;

public class AssertionApp 
{
	public static void main(String[] args) 
	{
		//Variable declaration
		int edad = 0;
		
		Scanner kInput = new Scanner(System.in);
		
		System.out.println("Input your age:");
		edad = kInput.nextInt();
		
		System.out.println(isMayorEdad(edad));
		
		kInput.close();
	}
	
	public static String isMayorEdad(int edad)
	{
		String str = "";
		assert edad > 0: "Age not valid this method only accepts positive values";
		
		if (edad < 18)
			str = "You can't enter";
		else if (edad >= 18)
			str = "Great! you can enter";
		
		return str;
	}
}
