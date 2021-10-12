package Programmers;

import java.util.ArrayList;

public class ÆùÄÏ¸ó {

	public static void main(String[] args) {
		int answer = 0;
		int[] nums = { 3, 3, 3, 2, 2, 4 };

		ArrayList<Integer> arrlist = new ArrayList<>();

		for (int i : nums) {
			if (!arrlist.contains(i))
				arrlist.add(i);
		}

		if ((nums.length / 2) > arrlist.size())
			answer = arrlist.size();
		else
			answer = (nums.length / 2);

		System.out.println(answer);

	}

}
