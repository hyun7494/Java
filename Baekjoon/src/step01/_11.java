package step01;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김현준
 * 내용 : 입력받은 숫자 연산
 */

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		
		
	}

}
