package String;

public class StringBuffer_Buider {

	public static void main(String[] args) { 
	
	
  StringBuffer s= new StringBuffer("OM");
  StringBuffer j= new StringBuffer("Baba");
  
  System.out.println("Merge value is :"+s.append(j));
  
  System.out.println("Length of String1 is:" +s.length());
  
  System.out.println("Length of String2:"+j.length());
  
	

	
	}

}



/*
 * String buffer and string builder is same.
 * Here we use append for merging the statement.
 * In String buffer object is created in heap. Once we create object means it will create new object instead of referring pointer.
 * String Buffer is mutable and not thread safe.
 * String builder is mutable and its thread safe.
 * Maaa
 */
