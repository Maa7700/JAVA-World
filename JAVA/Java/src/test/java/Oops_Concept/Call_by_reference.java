package Oops_Concept;

public class Call_by_reference {

	public static void main(String[] args) {
		
		System.out.println("Area of Permiter is :"+ Perimieter(39,10));
		System.out.println("Area of Rectangle size is :"+Rectanglesize(10,25));
		System.out.println("2nd Area of Perimiter is :"+Perimieter(30,19));
		
	}
		public static int Perimieter(int length, int breadth)
		{
			
			 	return length * breadth;
		}
		
		
		public static int Rectanglesize(int length,int size)
		{
			return length + size;
			
		}
		

		
	}

/*Function/Method- A piece of code block is called as a method.
 * A method can call by 2 ways call by value and call by reference.
 * Call by value- when primitive data type passed as a parameter.
 * Call by reference- when object of a class is passed as a parameter.
 * Its used for code redundacy instead of writing multiple lines of code we can create method and pass value from main method.
 */

