package Programmers;

import java.util.ArrayList;

public class Á¤¼ö»ï°¢Çü {
	
	static int[][] dp;
	public static void main(String[] args) {
		int answer = 0;
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		dp = new int[triangle.length][triangle.length];
		
		
		dp[0][0] = triangle[0][0];
		for(int i = 1; i < triangle.length; i++) {
			for(int j = 0; j < triangle[i].length; j++) {
				if(j == 0) {
					dp[i][j] = dp[i-1][j] + triangle[i][j];
					
				}
				else if(j ==  triangle.length-1) {
					dp[i][j] = dp[i-1][j-1] + triangle[i][j];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
				}
				
				
			}
		}
		
		for(int i = 0; i < triangle.length; i++) {
			answer = Math.max(answer, dp[triangle.length-1][i]);
		}
		
		System.out.println(answer);
		
	}
	

}
