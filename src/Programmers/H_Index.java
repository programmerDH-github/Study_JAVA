package Programmers;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		int answer = 0;
		int[] citations = {3, 0, 6, 1, 5};

		Arrays.sort(citations);

		for (int h = 0; h <= 10000; h++) {
			int count = 0;
			for (int i = 0; i < citations.length; i++) {
				if (h <= citations[i]) {
					count++;
					if (count == h)
						answer = count;
				}
			}

		}

		System.out.println(answer);

	}

}
