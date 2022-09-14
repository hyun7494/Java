package step03;
/*
 * 다했는데 배열을 잘 못써서 오류가 계속 났었음
 */

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //수열 A를 이루는 정수 N개
		int X = sc.nextInt(); //X보다 작은 수를 찾는게 문제
		
		int [] A= new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); 
		}
		sc.close();
		
		for(int i=0; i<N; i++) {
			if(A[i] < X) {
				System.out.print(A[i]+ " ");
			}
		}
		
	
		
	}

}
