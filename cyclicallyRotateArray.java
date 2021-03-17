import java.util.*;
/*
author : Ayushi Saxena
Problem statement : cyclically rotate array
*/
public class Competitve {

	
	
	public static void rotate(int arr[],int n) {
		int temp =arr[n-1];
		
		for (int i=n-2;i>=0;--i) {
			arr[i+1] = arr[i];
		}
		
		arr[0] = temp;
		
		
		
		//print rotated array 
		for(int i=0;i<n;++i) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public static void main (String args[]) {
		int arr[] = {1,2,3,4,5,6};
		
		rotate(arr,arr.length);
		
		}
	
	
}
