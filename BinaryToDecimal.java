/*
author : Ayushi Saxena
Problem Statement : Binary to Decimal 
*/
import java.util.*;

public class Main {

	public static void main (String args[]) {
		//110010
		int n,remainder=0,i=0,sum=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(n>0) {
			remainder = n%10;
			remainder *=Math.pow(2, i);
			sum+=remainder;
			++i;
			n = n/10;
			
		}
		System.out.println(sum);
		
	}
	
}
