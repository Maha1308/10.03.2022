package com.usescanner;
import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		
String name;
int age;
float salary;
Scanner scanner=new Scanner(System.in);



System.out.println("enter the  age");
age=scanner.nextInt();
System.out.println("enter the name");
name=scanner.nextLine();
scanner.nextLine();
System.out.println("enter the  salary");
salary=scanner.nextFloat();

System.out.println("employee details");
System.out.println("enter the name="  +name);
System.out.println("enter the age="  +age);
System.out.println("enter the salary="  +salary);

	}

}
