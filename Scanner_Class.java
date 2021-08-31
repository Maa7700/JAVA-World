package ControlStatement;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	 System.out.println("Enter First Name");
	 String name= sc.next();
	 System.out.println("Enter Age:");
	 int age= sc.nextInt();
	 System.out.println("Enter Gender");
	 char gender=sc.next().charAt(0);
	 
	 System.out.println("------------------------------------------");
	 
	 System.out.println("Name is : "+name);
	 System.out.println("Age is :"+ age);
	 
	 System.out.println("Gender is:"+gender);

	}

}

/*Scanner class is mostly used to take user inputs during run time.
 * Here we create scanner class object first and based on the object we use scanner class in-build methods to perform actions.
 * Here scanner class should import from Java utils package.
 */

