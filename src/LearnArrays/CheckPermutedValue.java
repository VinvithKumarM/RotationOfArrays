package LearnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutedValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String a");
		String a = sc.nextLine();
		System.out.println("Enter the value of String b");
		String b = sc.nextLine();
		System.out.println("value of String a:"+a);
		System.out.println("value of String b:"+b);
		if(a.length() == b.length())
		{
			char[] achars = a.toCharArray();
	        Arrays.sort(achars);
	        String asorted = new String(achars);
	        System.out.println(asorted);
	        char[] bchars = b.toCharArray();
	        Arrays.sort(bchars);
	        String bsorted = new String(bchars);
	        System.out.println(bsorted);
	        if(asorted.contentEquals(bsorted))
	        {
	        System.out.println("String2 is the permuted value of String1");
	        }
	        else
	        {
	        	System.out.println("Entered are two different Strings");
	        }
	       
		}
		else {
			System.out.println("One of the string is not the permuted value of other");
		}
	}

}
