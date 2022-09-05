package sub1;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김현준
 * 내용 : 예외처리 실습하기 
 */
public class TryTest {
	public static void main(String[] args) {
		
		// 예외상황1 : 어떤수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		/*
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0; // int r4; r4는 try안에 있는 지역변수라 밖에서 초기화 시켜줘야 밑에 "r4 : "+r4에서 오류 안남
		
		try {
			
			r4 = num1 / num2;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		 */
		
		try {
			//예외가 발생할 수 있는 코드로직
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
					
		}catch(ArithmeticException e) {
			e.printStackTrace();
		} //예외가 발생했을때 처리할 코드로직
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		// 예외상황2 : 배열의 인덱스 범위를 벗어났을 때
		
		int[] arr = {1,2,3,4,5};
		
		try {
			for(int i=0; i<=5; i++) {
			System.out.println("arr[i] : "+arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황3 : NULL 포인트 참조
		
		Animal animal = null;
		
		try {
			animal.move();
			animal.hunt();
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		// 예외상황4 : Casting 에러
		Animal a1 = new Tiger(); //업 캐스팅(다형성)
		Animal a2 = new Eagle(); //업 캐스팅(다형성)
		
		try {
			Eagle eagle = (Eagle) a1;	
			eagle.move();
			eagle.hunt();
		
		} catch (ClassCastException e) {
			
			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();
			
		}finally {
			//정리 코드
			System.out.println(" 캐스팅 완료....");
		}
		System.out.println("프로그램 종료....");
	}

}
