package Programmers;

public class N으로표현 {
	static int N;
	static int answer = Integer.MAX_VALUE;
	static int number;

	public static void main(String[] args) {
		N = 2; 
		number = 11;
		
		dfs(0,0);
		
		System.out.println(answer);
		

	}
	
	public static void dfs(int count,int result) {
		if(number == result) {
			answer = (answer > count) ? count : answer;
			return;
		}
		if(count > 8) {
			answer = -1;
			return;
		}
		
		int temp = N;
		for(int i = 0; i < 8 - count; i++) {
			int newCount = count + i + 1;
			dfs(newCount, result + temp);
			dfs(newCount, result - temp);
			dfs(newCount, result / temp);
			dfs(newCount, result * temp);
			
			temp = temp*10 + N;
		}
		
		
	}

}
