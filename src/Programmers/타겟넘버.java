package Programmers;

public class Å¸°Ù³Ñ¹ö {
	static int answer = 0;
	
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		dfs(numbers, target, 0);

		System.out.println(answer);
	}

	public static void dfs(int[] numbers, int target, int k) {
		if (k == numbers.length) {
			int sum = 0;
			for (int i = 0; i < numbers.length; i++)
				sum += numbers[i];
			if (sum == target)
				answer++;
		} else {
			numbers[k] *= 1;
			dfs(numbers, target, k + 1);

			numbers[k] *= -1;
			dfs(numbers, target, k + 1);
		}
	}

}
