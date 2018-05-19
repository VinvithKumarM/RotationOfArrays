package LearnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ComparePermutedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String a  = sc.nextLine();
		System.out.println("Enter String2");
		String b = sc.nextLine();
		getPermutedValue(a,b);
	}
public static void  getPermutedValue(String a, String b)
{
	char[] achar =a.toCharArray();
	Arrays.sort(achar);
	String asorted = new String(achar);
	
	char[] bchar =a.toCharArray();
	Arrays.sort(bchar);
	String bsorted = new String(achar);
		if(asorted.contains(bsorted))
		{
			System.out.println("String2 is a permuted value of string1");
		}
		else
		{
			System.out.println("Both are two different strings");
		}
	}
	
	
	}

