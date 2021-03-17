import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Min max element of an array
*/
public class Competitve {

	int max,min;
	
	public static Competitve findMinMax(int arr[],int start,int end) {
		
		Competitve minmax = new Competitve();
		Competitve mml = new Competitve();
		Competitve mmr = new Competitve();
		
		//only one element
		if(start==end) {
			minmax.min = arr[start];
			minmax.max = arr[start];
			return minmax;
		}
		
		//if two elements
		if(end == start+1) {
			if(arr[start]<arr[end]) {
				minmax.min = arr[start];
				minmax.max = arr[end];
			}
			else
			{
				minmax.min = arr[end];
				minmax.max = arr[start];				
			}
			return minmax;
		}
		
		int mid = (start+end)/2;
		mml = findMinMax(arr,start, mid);
		mmr = findMinMax(arr,mid+1,end);
		
		
		//for min element
		if(mml.min<mmr.min) {
			minmax.min = mml.min;
		}
		else
		{
			minmax.min = mmr.min;
		}
		
		//for max element
		if(mml.max > mmr.max) {
			minmax.max = mml.max;
		}
		else
		{
			minmax.max = mmr.max;
		}
		
		
		return minmax;
	}
	
	
	public static void main (String args[]) {
		int arr[] = {1,2,9,4,0,6,7};
		
		Competitve cmp = new Competitve();
		cmp = findMinMax(arr,0,arr.length-1);
		
		System.out.println("Min element is :" + cmp.min);
		System.out.println("Max Element is :" + cmp.max);
		
		}
	
	
}
