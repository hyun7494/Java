package step04;

import java.util.Arrays;
import java.util.Scanner;
// bubble sort 알고리즘이란다
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // n개의 정수
		int temp = 0;
		int [] arr= new int[N]; // 입력 받는 n개의 정수를 배열
		
		int a;
		
		for(int i=0; i<N; i++) {
			a = sc.nextInt();
			arr[i] = a;
		
			for(int j=1; j<N-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(arr[0]);
		System.out.print(arr[N]);

	}
	

}
