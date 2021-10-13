package Programmers;

import java.util.ArrayList;

public class 소수찾기 {
	static int count = 0;
	static boolean[] visited;
	static int[] box;
	static int[] result;
	static ArrayList<Integer> arraylist = new ArrayList<>();

	public static void main(String[] args) {
		int answer = 0;
		String numbers = "011";
		String num = "";
		String[] str = numbers.split("");
		visited = new boolean[numbers.length()];
		box = new int[numbers.length()];
		result = new int[numbers.length()];

		for (int i = 0; i < numbers.length(); i++) {
			box[i] = Integer.parseInt(str[i]);
		}

		for (int i = 1; i <= box.length; i++) {
			dfs(i, num);
		}

		for (int i = 0; i < arraylist.size(); i++) {
			prime(arraylist.get(i));
		}

		answer = count;

		System.out.println(answer);

	}

	public static void prime(int number) {
		if (number == 0 || number == 1)
			return;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return;
		}

		count++;

	}

	public static void dfs(int i, String num) {
		if (i == num.length()) {
			if (!arraylist.contains(Integer.parseInt(num))) {
				arraylist.add(Integer.parseInt(num));
			}
			return;
		}

		for (int j = 0; j < box.length; j++) {
			if (!visited[j]) {
				num += box[j] + "";
				visited[j] = true;
				dfs(i, num);
				visited[j] = false;
				num = num.substring(0, num.length() - 1);
			}
		}
	}

}
