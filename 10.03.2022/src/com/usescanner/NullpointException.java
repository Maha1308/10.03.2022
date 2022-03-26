package com.usescanner;

import java.util.Scanner;

public class NullpointException {

	public static void main(String[] args) {
		String n= null;
		Scanner sc= new Scanner (System.in);
		try
		{
			System.out.println("enter the name");
			n=sc.nextLine();
			System.out.println("Name="+n);
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}

	}

}
