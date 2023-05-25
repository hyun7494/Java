package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		BigInteger A = new BigInteger(a);
		
		String b = st.nextToken();
		BigInteger B = new BigInteger(b);
		
		
		BigInteger C = A.add(B);
		bw.write(C +"");
		bw.flush();
		bw.close();
		
	}
}
