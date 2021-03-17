import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Reverse array
*/
public class Competitve {

	public static void reverseArray(int[]arr,int n) {
		int temp,start=0,end = n-1;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed array is : ");
		
		for(int i=0;i<n;++i) {
		System.out.println(arr[i]);
		}
	}
	
	
	public static void main (String args[]) {
		int arr[] = {1,2,3,4,5};
		reverseArray(arr,5);
		
		}
		
		
	
	
}
