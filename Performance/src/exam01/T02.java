package exam01;

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
		    
		    // 공백 j를 위한 for문
		    for(int j = a-1; j >= i; j--) {
		        System.out.print(" ");
		    }
		    
		    // 별 j를 위한 for문
		    for(int j=1; j <=i; j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println("");
		}

		
	}
	
}
