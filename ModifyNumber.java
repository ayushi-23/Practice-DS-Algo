import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Replace 0s with 5 in a particular number
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
			if(no.charAt(i)=='0')
			no = no.replace(no.charAt(i), '5');
		}
		
			System.out.println(no);
}
}
