import java.util.*;

public class Competitve {

	public static void main (String args[]) {
		int N=5,i,j,k;
		
		for(i=1;i<=N;++i) {
			k=2;
			System.out.print("1");
			for(j=1;j<=i;++j) {
				
				while(k<=i-1) {
					System.out.print("2");
					++k;
				}
			}
			if(i>1)
			System.out.print("1");
			System.out.println();
		}
		
		//scan.close();
	}
	
}
