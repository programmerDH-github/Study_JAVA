package Programmers;

public class 등굣길 {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		int[][] dp = new int[n][m];
		
		
		for(int i = 0; i < puddles.length; i++) {
			dp[puddles[i][1]-1][puddles[i][0]] = -1;
		}
		
		dp[0][0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(dp[i][j] == -1) {
					dp[i][j] = 0;
					continue;
				}
				
				if(i != 0) dp[i][j] += dp[i-1][j] % 1000000007;
				
				if(j != 0) dp[i][j] += dp[i][j-1] % 1000000007;
				
			}
		}
		
		System.out.println(dp[n-1][m-1]);
	}

}

/*	예제 1
 	4 3 [[2, 2]]
 
 	4
*/
/*	예제 2
	4 4 [[3, 2], [2,4]]

	7
*/