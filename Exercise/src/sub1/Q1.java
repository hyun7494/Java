package sub1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 입력받을 임의의 자연수
		int i;	
		int j;
		
		for(i=2; i<=a; i++) { // 2는 소수가 아니니까 2부터 a까지
			
			for(j=2; j<=i; j++) {
				
				if(i % j == 0)
					break;
			}
			
			if(i == j)
				System.out.println(i);
		}
	}

}
