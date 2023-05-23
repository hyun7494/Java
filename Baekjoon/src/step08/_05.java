package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _05 {
	// 모르겠다(while 쓰고 하래)
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int a=0; a>=0; a++) {
			int b = 6*a;
			System.out.println("b 현재값 : "+b);
			if(b-N > 0) {
				bw.write(a +" ");
				break;
				
			}
			int c = b++;
			c += b;
			System.out.println("c현재값 : "+c);
			
		}
		
		bw.flush();
		bw.close();
	}
}
