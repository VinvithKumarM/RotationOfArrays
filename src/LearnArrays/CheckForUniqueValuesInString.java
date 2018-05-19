package LearnArrays;

import java.util.Scanner;

public class CheckForUniqueValuesInString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of string");
		String a = sc.nextLine();
		System.out.println(a.charAt(2));
		for(int i=0;i<a.length()-1;i++)
		{
			System.out.println("Entered i loop");
			for(int j=i+1; j<a.length()-1;j++)
			{
				System.out.println("Entered j loop");
				if(a.charAt(i) == a.charAt(j))
				{
					System.out.println("Entered if loop");
					System.out.println("Found Match");
					}
				
			}
		}
	}

}
