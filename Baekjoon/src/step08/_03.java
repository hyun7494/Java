package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = a/25;
			int c = (a%25)/10;
			int d = ((a%25)%10)/5;
			int e = (((a%25)%10)%5)/1;
			bw.write(b+" "+c+" "+d+" "+e+"\n");
		}
		bw.flush();
		bw.close();
	}
}
