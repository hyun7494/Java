package step03;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = a/4;
		for(int i = 1; i<=b; i++) {
			System.out.print("long");
			System.out.print(" ");
		}
		System.out.print("int");
		
		sc.close();
		
	}

}
