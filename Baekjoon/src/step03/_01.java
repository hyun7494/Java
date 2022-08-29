package step03;

/*
 * 날짜 : 2022/08/29
 * 이름 : 김현준
 * 내용 : 숫자를 입력받아 구구단 출력
 */

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i;
		for(i=1; i<10; i++) {
			System.out.println(a +" * "+ i + " = " + a*i);
		}
	}

}
