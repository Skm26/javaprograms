package assignment4;


public class Autoboxing_and_unboxing 
{
	public static void main(String a[])
	{
		 //Auto-boxing of Integer
	     Integer i =new Integer(10);
	      
	     //Auto-unboxing of Integer
	     int i1=i;
	     System.out.println("Value of i: " +i);
	     System.out.println("Value of i1: " +i1);
	     
	     System.out.println("*******************");
	     
	     //Autoboxing of char
	     Character gfg ='a';
	     
	     //Auto-unboxing of character
	     char ch = gfg;
	     System.out.println("Value of ch: " +ch);
	     System.out.println("Value of gfg: " +gfg);
	     
	     System.out.println("*******************");
	     
	     //Auto-boxing of float
	     Float foo = 10.5f;
	     
	     //Auto-unboxing of float
	     float fv=foo;
	     
	     System.out.println("Value of Float: " +foo);
	     System.out.println("Value of fv: " +fv);
	}

}


/*Output of the program*/
/*
Value of i: 10
Value of i1: 10
*******************
Value of ch: a
Value of gfg: a
*******************
Value of Float: 10.5
Value of fv: 10.5
*/
 