import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Armstrong number
*/

public class Main {
	
	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		int no = num;
		int sum=0,flag=0,rem;
		
		while (num>0) {
			rem = num%10;
			sum=sum+rem*rem*rem;
			
			num/=10;
		}
		if(sum==no)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
}
}
