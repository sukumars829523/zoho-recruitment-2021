package round1;

import java.util.Scanner;


// program to print snake pattern without array and if condition

public class SnakePatternPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input N: ");
		int n = sc.nextInt();
		
		printSnakePattern(n);
		sc.close();
	}

	private static void printSnakePattern(int n) {
		int pval = 1 ;
		
		for (int i = 0; i < n; i++) {
			int j = 0 ;
				for(;j < n-i-1 ; j++)
					System.out.print("_ ");
				
				for(; i%2 == 0 &&  j < 2*n-i-1;j++)
					System.out.print(pval++ +" ");
				
				for(; i%2 == 1 &&  j < 2*n-i-1;j++)
					System.out.print(--pval + " ");
				for (; j < 2*n-1; j++) 
					System.out.print("_ " );
				
				
			pval+=n;
			System.out.println();
		}
		
	}

}
