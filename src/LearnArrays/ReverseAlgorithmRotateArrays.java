package LearnArrays;

import java.util.Arrays;

public class ReverseAlgorithmRotateArrays {

	 public void rotate(int arr1[], int d, int n)
	{
		for(int i=0; i<d; i++)
		{
			
			int temp = arr1[0];
			for(int j=0;j<arr1.length-1;j++)
			{
				arr1[j] = arr1[j+1];
			}
			arr1[arr1.length-1] = temp;
			
		}
		System.out.println("Reverse Algorithm "+Arrays.toString(arr1));
		
	
	}
	
}
