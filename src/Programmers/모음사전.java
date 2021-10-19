package Programmers;

public class 모음사전 {
	static String[] dir = { "A", "E", "I", "O", "U" };
	static String str = "";
	static int answer = 0;

	public static void main(String[] args) {
		String[] word = { "AAAAE", "AAAE", "I", "EIO" };

		dfs(0, word[3]);

	}

	public static void dfs(int count, String word) {
		if (str.equals(word)) {
			System.out.println(answer);
			return;
		}
		if (count == 5) {
			return;
		}

		for (int i = 0; i < dir.length; i++) {
			answer++;
			str += dir[i];
			dfs(count + 1, word);
			str = str.substring(0, str.length() - 1);
		}
	}

}
