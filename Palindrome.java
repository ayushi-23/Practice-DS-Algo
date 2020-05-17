import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Find whether a number is Palindrome

*/

public class Main {

	public static void main (String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		int flag=0;
		String no = String.valueOf(num);
		int len = no.length()-1;
		
		for(int i=0;i<=len;++i) {
			if(no.charAt(i)!=no.charAt(len-i))
				flag=1;
		}
		if(flag==1) {
			System.out.println("Not a palindrome");
		}
		else 
			System.out.println("palindrome");
}
}
