package step03;

import java.util.Scanner;

public class _13 {
	public static void main(String[] args){
		/*
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  // 입력받은 수
		
		final int M = N;
		
		int count = 0; // 사이클 길이 측정하려고
		
		int q = N / 10; // 10의 자리 
		int r = N % 10; // 1의 자리


		
		while (r*10 + q+r != M) {
			
			N = r*10 + q+r;
			count++;
		}
		
		
		System.out.println(q);
		System.out.println(r);
		System.out.println(count);
		*/

				Scanner sc = new Scanner(System.in);
		 
				int N = sc.nextInt();
				sc.close();
		        
				int cnt = 0;
				int copy = N;
		        
				while (true) {
					N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
					cnt++;
		 
					if (copy == N) {
						break;
					}
				}
				System.out.println(cnt);
		
		
	}

}
