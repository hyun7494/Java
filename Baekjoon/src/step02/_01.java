package step02;

/*

- 날짜 : 2022/08/23
- 이름 : 김현준
- 내용 : if문 활용
*/

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
