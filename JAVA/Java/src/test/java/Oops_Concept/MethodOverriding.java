package Oops_Concept;


class A 
{
	
	public void show()
	{
		System.out.println("Display value A");
	}

}


class B extends A
{
	
	public void show()
	
	{
		super.show();
		System.out.println("Display value B");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		B ai=new B();
		ai.show();
		//A a2= new A();
		//a2.show();
		
	

	}

}





/*
 * Its a type of Run time polymorphism.
 * Where method name is same and signature is same and child class extend parent class property.
 * Its same as inheritance concept.
 * If u want to print parent class data then use super keyword in child class.
 * Here 2 class need to be there and child need to extend parent one.
 * 
 */



