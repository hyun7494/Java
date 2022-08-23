package step01;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김현준
 * 내용 : 숫자를 입력받고 계산하여 출력
 */

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a*((b/100)%10));
		System.out.println(a*b);
	}

}
