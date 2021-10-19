package Programmers;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long answer = 0;

		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}

		System.out.println((answer - money <= 0) ? 0 : answer - money);

	}

}
