import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Check Numbers in AP
*/

public class Main {
	
	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		int d=0,flag=0;
		int arr[] = new int[num];
		for(int i=0;i<num;++i) {
			arr[i] = scan.nextInt();
			if(i>0) {
				d = arr[i] - arr[i-1];
			
			if(arr[i] != arr[0]+(i)*d) {
				flag=1;
				break;
			}
			}
		}
		 if(flag==1) {
			 System.out.println("Not AP");
		 }
		 else {
			 System.out.println("Yes AP");
		 }
			
}
}
