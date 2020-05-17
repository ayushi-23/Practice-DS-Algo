import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Count of Trailing zeroes of Factorial of a number
*/

public class Competitve {
	
	public static void main (String args[]) {
		int num,sum=0;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		while(num!=0) {
			 sum = sum+(num/5);
			 num = num/5;
		 }
	
		 
			System.out.println("No of trailing zeroes of fact:"+sum);
}

}