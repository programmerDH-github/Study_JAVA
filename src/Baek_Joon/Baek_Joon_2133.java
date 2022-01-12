package Baek_Joon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Baek_Joon_2133 {
	
	static int[] dp;
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int n = Integer.parseInt(bf.readLine());
			dp = new int[n+1];
			System.out.println(topDown(n));
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//D[n] = 3 * D[n-2] + 2*(D[n-2] + D[n-4] + ... + D[0])
	
	public static int topDown (int n) {
		
		if(n == 0) return 1;
		if(n == 1) return 0;
		if(n == 2) return 3;
		if(dp[n] != 0) return dp[n];
		dp[n] = 3*topDown(n-2);
		//짝수일 때 2씩 새로운 케이스 등장
		for(int i = 3; i <= n; i++) {
			if(i % 2 == 0) dp[n] += (2 * topDown(n-i));
		}
		
		return dp[n];
		 
	}

}

/*	예제 1
	2
	
	3
*/
/*	예제 2
	4
	
	11
*/
/*	예제 3
	6
	
	41
*/
 
 
 
