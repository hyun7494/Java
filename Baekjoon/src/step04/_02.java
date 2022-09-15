package step04;

import java.util.Arrays;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		// 배열에 넣고 그 배열을 복사해서 복사본으로하자
		Scanner sc = new Scanner(System.in);
		
		int [] data = new int[9]; // 입력받을 9개의 수
		int a;
		for(int i=0; i<10; i++) {
			a = sc.nextInt();
		data[i] = a;
		
		System.out.println(Arrays.toString(data));
		}
		
	}
}
