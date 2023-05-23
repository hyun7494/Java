package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long A = Long.parseLong(st.nextToken());
		Long B = Long.parseLong(st.nextToken());
		
		Long C = A+B;
		bw.write(C +"");
		bw.flush();
		bw.close();
		
	}
}
