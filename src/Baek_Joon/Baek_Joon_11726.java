package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_Joon_11726 {
	static int[] dp;
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			
			n = Integer.parseInt(bf.readLine());
			dp = new int[n+1];
			
			System.out.println(bottomUp(n));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int topDown (int n) {
		if(n == 0 || n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		return dp[n] = (topDown(n-1) + topDown(n-2)) % 10007;
	}
	
	public static int bottomUp (int n) {
		dp[0] = 1;
		if(n > 0) dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] = dp[i] % 10007;
		}
		
		return dp[n];
	}

}

/*	¿¹Á¦ 1
  	9
  
  	55 
*/
