package step02;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b){
			System.out.println("<");
		}else(a==b){
			System.out.println("==");
		}
	}

}
