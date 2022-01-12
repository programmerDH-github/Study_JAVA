package Programmers;

public class 소수만들기 {
	static int cnt = 0;
	static int answer = 0;
	
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		dfs(nums, 0, 0, 0);
		
		
		
		System.out.println(answer);
		

	}
	
	public static void dfs(int[] nums, int sum, int index, int cnt) {
		if(cnt == 3) {
			if(is_prime(sum)) {
				answer++;
			}
			return;
		}
			
		for(int i = index; i < nums.length; i++) {
			dfs(nums, sum+nums[i], i+1, cnt+1);
		}
		
	}
	
	
	public static boolean is_prime(int num) {
		if(num < 2) {
			return true;
		}
		
		if(num == 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}

}

/*	예제 1
1,2,3,4
1

	예제 2
1,2,7,6,4
4
*/
