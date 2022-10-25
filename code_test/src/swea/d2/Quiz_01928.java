package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Decoder;

// Base64 Decoder
public class Quiz_01928 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			String str = br.readLine();
			
			Decoder base = Base64.getDecoder();
			byte[] by = base.decode(str);
			
			sb.append("#"+tc).append(' ');
			for(byte i : by) {
				sb.append((char) i);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
