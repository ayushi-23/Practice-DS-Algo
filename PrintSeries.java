import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Print terms of series 3n+2
*/
public class Competitve {

	public static void main (String args[]) {
		//int num;
		//Scanner scan = new Scanner(System.in);
		
		//num = scan.nextInt();
		for(int i=0;i<20;++i) {
			int term = 3*i+2;
			if(term%4!=0)
			System.out.print(term + " ");
		}
	
	}
	}
