package Programmers;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String answer = "";
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < participant.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
			if (i == completion.length-1) {
				answer = participant[i + 1];
				break;
			}

		}
		System.out.println(answer);
	}

}
