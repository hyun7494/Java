package step06;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int a = sc.nextInt(1);
		int b = 0;
		
		for(int i=0; i<=N; i++) {
			b += a;
		}
		System.out.println(b);
	}
}
