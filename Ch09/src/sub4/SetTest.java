package sub4;
import java.util.HashSet;
import java.util.Set;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김현준
 * 내용 : 자료구조 실습하기
 * 
 * Set
 *  -
 *  -
 */
public class SetTest {
	public static void main(String[] args) {
		
		//집합생성

		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		// 집합 갯수
		System.out.println("set 집합 원소 갯수 : "+set.size());
		
		for(int n : set) {
			System.out.println(n + " ");
		}
		System.out.println();
		
		// 집합 연산
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
	}

}
