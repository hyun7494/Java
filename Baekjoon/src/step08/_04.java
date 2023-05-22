package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int b = 0;
		
		for(int i=0; i<N; i++) {
			int a = (int) Math.pow(2*N+1, 2);
			b += a;
		}
		
		
		bw.write(b+"");
		
		bw.flush();
		bw.close();
		
	}
}
