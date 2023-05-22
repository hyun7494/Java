package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// B진법 수 N을 10진법으로 바꾸기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		int a = Integer.parseInt(N, B);
		bw.write(a+"\n");
		
		bw.flush();
		bw.close();
	}
}
