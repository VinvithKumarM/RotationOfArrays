package LearnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAlgorithmRotateArrays s = new ReverseAlgorithmRotateArrays();
		Scanner sc = new Scanner(System.in);
		int[] arr2 = new int[5];
		
		for(int x=0; x<5;x++)
		{   
            System.out.println("Enter number: ");
            arr2[ x ] = sc.nextInt( );
		}
		s.rotate(arr2, 2, 5);
		int[] arr1 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Please enter the num of rotations to be made");
		int a = sc.nextInt();
		System.out.println("number of rotations are: "+a);
		for(int i=0; i<a; i++)
		{
			int temp = arr1[0];
		//	System.out.println(temp);
			for(int j=0;j<arr1.length-1;j++)
			{
				arr1[j] = arr1[j+1];
			}
			arr1[arr1.length-1] = temp;
			//System.out.println(arr1[arr1.length-1]);
		}
		System.out.println(Arrays.toString(arr1));
		
 	}

	

}
