package com.usescanner;

import java.util.Scanner;

class Checkage extends Exception
{
	public Checkage(String s)
	{
		super(s);
	}
}

public class Mainclass {

	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		age=s.nextInt();
		try
		{
			if(age<18)
			{
			throw new Checkage("Not  eligible for voting");
		}else {
			System.out.println("Eligible for voting");
		}
		}catch(Checkage e) {
			e.printStackTrace();
		}
	}
}
		
		
