package Programmers;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 125;
		String three = "";

		while (n / 3 > 0) {
			three = three + (n % 3);
			n = n / 3;
		}
		three = three + n;

		// answer = Integer.parseInt(three, 3);
		answer = three.charAt(three.length() - 1) - '0';
		int j = 1;
		for (int i = three.length() - 2; i >= 0; i--) {
			answer += (three.charAt(i) - '0') * (int) (Math.pow(3, j));
			j++;
		}

		System.out.println(answer);

	}

}
