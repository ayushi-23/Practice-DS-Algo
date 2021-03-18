
/*
author : Ayushi Saxena
Problem statement : move all negative elements to one side of array
*/


public class moveNegativeElementsOnOneSide {
	public static void moveNegative(int arr[], int n) {
			int temp,j=0;
		for(int i=0;i<n;++i) {
			if(arr[i]<0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				++j;
			}
		}
		
			System.out.println("The sorted array is :");
			printArray(arr,n);
		
	}
	
	public static void printArray(int arr[],int n) {
		
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {0,-1,1,0,-2,-1,0,2};
		System.out.println("The original array was: ");
		printArray(arr,arr.length);
		System.out.println();
		
		moveNegative(arr,arr.length);
	}
}
