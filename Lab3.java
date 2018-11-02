//***********************************************************
// Name:  Anthony Weringer
// Title: Lab3.java
// Description: String statements
// Time spent: 2.5 hours
// Date: 8/25/17
//***********************************************************

import java.util.Scanner;

public class Lab3 
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in); /*setup scanner*/
		System.out.print("Enter a string: "); /*prompt*/
		String string1= in.nextLine();
		System.out.print("Enter another string: "); /*prompt*/
		String string2= in.nextLine();
			if (!string1.equals(string2))
			{
				System.out.println("The strings are not the same");
			}
			else
			{
				System.out.println("The strings are the same");
			}
		if (string1.length() > string2.length())
		{
			System.out.println("\""+ string1 +"\" is longer than \""+ string2+"\"");
		}
		if (string1.length() < string2.length())
		{
				System.out.println("\""+ string2 +"\" is longer than \""+ string1+"\"");
		}
		if (string1.length() == string2.length())
		{
				System.out.println("The strings are the same length");
		}

		}
	}


