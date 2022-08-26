package step02;
/* 
 * 가는 과정은 맞았는데 최대를 어떻게 구할지 몰라서 인터넷 찾아보고 Math.max 사용함
 * 날짜 : 2022/08/26
 * 이름 : 김현준
 * 내용 : 중첩 if랑 최대값을 구하기?
 */

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if(a==b && a==c && b==c) {
			System.out.println(10000+a*1000);
			
		}else if (a==b || a==c) {
			System.out.println(1000+(a*100));
			
		}else if (b==c) {
			System.out.println(1000+(b*100));
		}else {
			System.out.println((Math.max(a, Math.max(b, c))*100));
		}
		
	}

}
