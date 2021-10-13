package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] numbers = { 2, 1, 3, 4, 1 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!list.contains(numbers[i] + numbers[j]))
					list.add(numbers[i] + numbers[j]);

			}

		}

		Collections.sort(list);

		System.out.println(list);

	}

}
