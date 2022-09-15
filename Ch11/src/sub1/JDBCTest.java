package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김현준
 * 내용 : JDBC 실습하기
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
		}catch (Exception e) { // Exception => 예외타입(모든 예외 클래스의 부모클래스), e => 참조변수
			e.printStackTrace(); // 에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}
		
		System.out.println("접속 테스트 완료...");
	}
}