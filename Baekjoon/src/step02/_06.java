package step02;
/*
 * 다시 생각해보자 (인터넷 봄)
 * 날짜 : 2022/08/26
 * 이름 : 김현준
 * 내용 : 시간 계산
 */

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int a = sc.nextInt(); //현재 시간
		int b = sc.nextInt(); //현재 분
		int c = sc.nextInt(); // 더할 분
		int d = c/60; //a에 더할 시간
		int e = c%60; //b에 더할 분
		int f; //출력 시간
		int g; //출력 분
		
		
		if(a+d > 23 && b+e > 59) {
			a = (a+d+1)%24;
			b = b+e-60;
			System.out.println(a +" "+ b);
		}else if(a+d >23 && b+e < 59) {
			a = (a+d+1)%24;
			b = b+e;
			System.out.println(a +" "+ b);
		}else if(a+d <= 23 && b+e > 59) {
			a = a+d+1;
			b = b+e-60;
			System.out.println(a +" "+ b);
		}else {
			a = a+d;
			b = b+e;
			System.out.println(a +" "+ b);
		}
		이러면 3번째 23 48
					 25
		  입력했을 때, a+d <= 23이라 첫번째 if에 안걸려서 꼬여버림
		
		*/
		
		int a = sc.nextInt(); //현재 시간
		int b = sc.nextInt(); //현재 분
		int c = sc.nextInt(); // 더할 분
		
		int d = a*60 + b + c;
		a = d/60;
		b = d%60;
		
		if (a>=24) {
			a= a-24;
		}
		System.out.println(a + " " + b);
		
	}

}
