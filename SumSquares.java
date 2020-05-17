import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Find pairs of numbers such that Sum of squares of those numbers is equal to inputted number 
*/
public class Main {
	
	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		if(num>=0) {
		for(int i=0;i<=Math.sqrt(num);++i) {
			for(int j=i;j<=Math.sqrt(num);++j) {
				if((Math.pow(i+j,2)-2*i*j)==num)
				{
					System.out.println(i+","+j);
				}
			}
		}
	}
		 
			
}
}
