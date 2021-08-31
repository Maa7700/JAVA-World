package String;

public class String_Lateral {

	public static void main(String[] args) {
		
		String name="Maa";
		String name2="Baba";
		
		System.out.println("Length of string is:"+name.length());
		System.out.println("Trim:"+ name.trim());
		System.out.println("Index checking is "+ name.charAt(2));
		System.out.println("Merging statement is:"+name.concat(name2));

	}

}



/*

If multiple character is there then String come into picture.
Its of 2 types- String Lateral, String Buffer/Builder.
String lateral object is created in String Constant pool and if once same object is created instead of creating new object it just changed the reference pointer. 
So it manage memory well.
Here we use concat for merging the statements.
It is immutable and its not thread safe.
*/