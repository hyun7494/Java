package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김현준
 * 내용 : 1단계 5번 A*B
 */


public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 < A, B < 10 조건에 맞는 정수를 입력해주세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		

		if( 0 < A && B < 10) {
			
		System.out.println(A*B);
		
	}else {
		System.out.println("다시 입력해주세요");
	}

		
}
}