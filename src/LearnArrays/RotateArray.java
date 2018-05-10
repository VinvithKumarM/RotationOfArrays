package LearnArrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rotate_array = {1,2,3,4,5,6};
		System.out.println("Enter the num of elements to be rotated");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a>0)
		{
		for(int i=0; i<rotate_array.length;i++)
		{
		int temp = rotate_array[0];
		System.out.println("temp"+temp);
		rotate_array[i] = rotate_array[i+1];
		System.out.print(rotate_array[i]);
		rotate_array[rotate_array.length] = temp;
		}
		a--;
		}
		System.out.println("Rotated Array by "+a+" elements is"+ rotate_array);
	}

}
