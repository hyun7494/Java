package sub02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 김현준
 * 내용 : 자바 팩토리얼 재귀 메서드 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		System.out.println("  1과   5의 최대공약수 : "+gcd(5, 1));
		System.out.println(" 12과  18의 최대공약수 : "+gcd(18, 12));
		System.out.println(" 60과  24의 최대공약수 : "+gcd(60, 24));
		System.out.println("192과 162의 최대공약수 : "+gcd(192, 162));
	}
	
	public static int gcd(int a, int b) {
		
		if(a%b == 0) {
			return b;
		}else {
			return gcd(b, a%b);
		}
	}
}
