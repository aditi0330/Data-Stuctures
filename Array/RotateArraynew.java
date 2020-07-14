
// Java program to rotate an array by 
// d elements 
// Method 2

public class RotateArraynew { 
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{  
	    int temp[] = new int[d];
		for (int i = 0; i < d; i++) 
		    temp[i] = arr[i];   
		for(int j = d; j < n; j++)
		    arr[j-d] = arr[j];
		int count = 0;
		for(int k = n-d; k < n; k++)
		    arr[k] = temp[count++];    
	}

	/*  function to print an array */
	void printArray(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	} 

	public static void main(String[] args) 
	{ 
		RotateArraynew rotate = new RotateArraynew(); 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotate.leftRotate(arr, 2, 7); 
		rotate.printArray(arr, 7); 
	} 
} 
