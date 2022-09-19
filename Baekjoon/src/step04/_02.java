package step04;

import java.util.Arrays;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		// 배열에 넣고 그 배열을 복사해서 복사본으로하자
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[9]; // 입력받을 9개의 수
		int a;
		int temp;
		for(int i=0; i<9; i++) {
			a = sc.nextInt();
			arr[i] = a;

		
		System.out.println(Arrays.toString(arr));
		
		for(int j=1; j<9-i; j++) {
			if(arr[j-1] > arr[j]) {
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
		
		}
		sc.close();
		
		
		
	}
}
