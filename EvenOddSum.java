import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Sum of Odd and even terms of a number
*/
public class Main {

	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		String no = String.valueOf(num);
		
		int len = no.length();
		//System.out.print(len);
		int sum_odd=0;
		int sum_even = 0;
		num = Integer.parseInt(no);
		if(len%2==0) {
			
			for(int i=0;i<len;i++) {
				int rem = num%10;
				if(i%2==0) {
				sum_even=sum_even+rem;
				
				}
				else
					{
					sum_odd = sum_odd+rem;
					}
				num = num/10;
			}
		}
		else {
			
			for(int i=0;i<len;i++) {
				int rem = num%10;
				if(i%2==0) {
					
					sum_odd = sum_odd+rem;
				}
				else
				{	
					sum_even=sum_even+rem;
				}
				num = num/10;
		}
		
	}
		
		System.out.println("Sum odd:"+sum_odd);
		System.out.println("Sum even:"+sum_even);
	
	}
	}
