import java.util.*;
/*
author : Ayushi Saxena
Problem Statement : Find all Leap years between 2000 and 3000
*/
public class Main {

	public static void main (String args[]) {
		
		for(int i=2000;i<=3000;i+=4) {
			if(i%4==0)
			{
			if(i%100==0) {
				if( i%400==0)
				{	{System.out.print(i + " ");}
			
				}
			}
				else
					System.out.print(i + " ");
		}
			
	}
}
}
