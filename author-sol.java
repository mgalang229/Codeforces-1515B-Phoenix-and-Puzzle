import java.io.*;
import java.util.*;

public class Main {
	
	private static FastReader in;
	
	public static void main(String[] args) {
		in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solver();
		}
	}
	
	static boolean isSquare(int x) {
		int y = (int) Math.sqrt(x);
		return (y * y == x);
	}
	
	static class Solver { 
		Solver() {
			// If n can be written as 2x or 4x, where x is a square number, 
			// then the answer is YES. Otherwise it is NO.
			
			// To visualize this construction, we start by first building a smaller square 
			// using exactly 2 or 4 pieces (the drawings are in the sample test explanation).
			// We can just use x of those smaller squares to build a larger square.
			
			int n = in.nextInt();
			
			if(n % 2 == 0 && isSquare(n / 2)) {
				System.out.println("YES");
			} else if(n % 4 == 0 && isSquare(n / 4)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}
		
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
