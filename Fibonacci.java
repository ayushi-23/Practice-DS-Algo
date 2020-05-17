//Fibonacci below N
import java.util.*;

public class Competitve {

	public static void main (String args[]) {
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int a=0,b=1,sum=0;
		while (sum<N) {
			
			System.out.println(sum);
			
			a = b;
			b = sum;
			sum = a+b;
		}
		scan.close();
	}
	
}
