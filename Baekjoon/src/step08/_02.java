package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _02 {
	public static void main(String[] args) throws IOException {
		// 진법변환(10진수 입력값 내가 넣은 값으로)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		String a = Integer.toString(N, B);
		String A = a.toUpperCase();
		
		bw.write(A+"\n");
		bw.flush();
		bw.close();
	}
}
