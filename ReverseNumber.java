import java.util.*;
/*
author : Ayushi Saxena
Problem statement : Reverse of a number
*/
public class Main {

	public static void main (String args[]) {
		int N,i=0,j,k,rev;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		rev = 0;
		while(N>0) {
			k = N%10;
			rev = rev*10 +k;
			N = N/10;
		}
		System.out.println(rev);
		//scan.close();
	}
	
}
