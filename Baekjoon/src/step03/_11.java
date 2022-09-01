package step03;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		for (int i=1; i>0 ; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a+b);
		
			
		}
	}

}
