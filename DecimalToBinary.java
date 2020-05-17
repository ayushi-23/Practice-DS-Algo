import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Decimal to Binary 
*/
public class Main {

	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		//String no = String.valueOf(num);
		String binary="";
		String reverse="";
		
		while(num>0) {
			int rem = num%2;
			binary = binary+String.valueOf(rem);
			num = num/2;
			
			
		}
		for(int i = binary.length() - 1; i >= 0; i--)
        {
            reverse = reverse + binary.charAt(i);
        }
		System.out.println("Binary No:"+reverse);
	
	}
	}
