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
		
		//(2^N + 1)^2
		int N = Integer.parseInt(br.readLine());
		int a = (int)(Math.pow(2,N));
		
		int b = (int)(Math.pow(a+1,2));
		
		
		
		bw.write(b+"");
		
		bw.flush();
		bw.close();
		
	}
}
