package step02;

/*
- 날짜 : 2022/08/26
- 이름 : 김현준
- 내용 : 중첩 if문 활용
*/

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > 0 && b >= 45) {
			b -= 45;
			System.out.println(a +" "+ b);
		}else if(a > 0 && b < 45) {
			a--;
			b = 60 - (45-b);
			System.out.println( a +" "+ b );
		} else if( a <= 0 && b >= 45){
			b -= 45;
			System.out.println( a +" "+ b );
		} else
		{
			a = 24 - 1;
			b = 60 - (45-b);
			System.out.println( a +" "+ b );
		}
	}

}
