package step02;

/*
- 날짜 : 2022/08/26
- 이름 : 김현준
- 내용 : 중첩 if문 활용
*/

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println("1");
		}else if(a < 0 && b > 0){
			System.out.println("2");
		}else if(a < 0 && b < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		
	}

}
