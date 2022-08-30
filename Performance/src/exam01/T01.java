package exam01;

import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//줄반복
		for(int start = 1; start <= a; start++) {
			
			//별반복
			for(int end = 1; end <= start; end++) {
			System.out.print("*");
			
			}
			
			System.out.println("");
			
		}
		

	}

}