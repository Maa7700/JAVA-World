package Oops_Concept;

public class Method_overloading {

	public static void main(String[] args) {
	
		Method_overloading m= new Method_overloading();
		System.out.println("Value is :"+m.display(12, 15));
		System.out.println("Value is :"+m.display(12, 15, 29));

	}

	
	public static int display(int x , int y) 
	{
	        return x+y;
	}
	
	
	public static int display(int x , int y, int z)
	{
		return x+y+z;
		
	}
	
}


/*
 * Method over loading is type of static polymorphism.
 * When method name is same and signature is different we use this.
 * 
 */
