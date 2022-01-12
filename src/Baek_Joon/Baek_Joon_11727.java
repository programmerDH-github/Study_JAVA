package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_Joon_11727 {
	static int[] dp;
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int n = Integer.parseInt(bf.readLine());
			dp = new int[n+1];
			System.out.println(bottomUp(n));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static int topDown (int n) {
		if(n == 0 || n == 1) return 1;
		
		if(dp[n] != 0) return dp[n];
						
		return dp[n] = (topDown(n-1) + 2*topDown(n-2)) % 10007;
		
	}
	
	public static int bottomUp (int n) {
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
		}
						
		return dp[n];
		
	}
	

}

/*	예제 1
	2

	3 
*/
/*	예제 2
	8

	171 
*/
/*	예제 2
	12

	2731 
*/
