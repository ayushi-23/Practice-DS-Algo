import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Kadane's Algorithm or find the largest sum of contiguous sub-array 
*/
public class Competitve {

	
	
	public static int findLargestSum(int arr[],int n) {
		int max_of_all=0,max_till_here=0;
		
		for (int i=0;i<n;++i) {
			max_till_here = max_till_here + arr[i];
			if(max_of_all<max_till_here) {
				max_of_all = max_till_here;
			}
			
			if(max_till_here <0) {
				max_till_here = 0;
			}
		}
		 
		
		return max_of_all;
		
	}
	
	
	public static void main (String args[]) {
		int arr[] = {1,-2,0,4,5,6};
		
		int sum = findLargestSum(arr,arr.length);
		System.out.println("Max sum of contiguous sub-array is :" + sum);
		}
	
	
}
