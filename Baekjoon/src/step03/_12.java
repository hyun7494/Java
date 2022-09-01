package step03;

/*
 * 날짜 : 2022/09/01
 * 이름 : 김현준
 * 내용 : 값을 입력받고 합을 출력하는 과정
 * 		while문을 사용하여 입력받는 값이 있는가 확인해야하는 데 몰랐음
 */
import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			}
		sc.close();
	}

}
