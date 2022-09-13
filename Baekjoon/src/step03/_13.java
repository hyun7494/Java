package step03;

import java.util.Scanner;

public class _13 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int count = 0;
		
		int q = i / 10;
		int r = i % 10;
		
		int a = r * 10;

		
		while (q*10 + r != i) {
			a + r 
			count++;
		}
		
		
		System.out.println(q);
		System.out.println(r);
	}

}
