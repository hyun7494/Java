package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김현준
 * 내용 : 문자스트림 실습하기
 */
public class RederTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java1\\Desktop\\Sample2.txt";
		
		try {
			FileReader fr = new FileReader(path);

		
			while(true) {
					// 파일 읽기
					int value = fr.read();
					
					if(value == -1) {
						// 파일을 모두 읽었으면
						break;
				}
				
				char c = (char) value;	// 여기는 input 스트림
				System.out.print(c);	// 파일을 통해 입력받을 때

				
			}
		
			// 스트림 해제
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
