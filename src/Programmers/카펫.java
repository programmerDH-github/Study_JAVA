package Programmers;

import java.util.ArrayList;

public class Ä«Æê {

	public static void main(String[] args) {
		int[] answer = new int[2];
		int brown = 10;
		int yellow = 2;
		ArrayList<Integer> arraylist = new ArrayList<>();
		int sum = brown + yellow;

		for (int i = 1; i <= sum; i++) {
			if (sum % i == 0) {
				arraylist.add(i);
				arraylist.add(sum / i);
			}

		}

		for (int i = 0; i < arraylist.size(); i += 2) {
			if (arraylist.get(i) - arraylist.get(i + 1) >= 0) {
				if (arraylist.get(i) * 2 + arraylist.get(i + 1) * 2 - 4 == brown) {
					answer[0] = arraylist.get(i);
					answer[1] = arraylist.get(i + 1);
					break;
				}
			}
		}

		for(int s : answer) System.out.print(s + " ");

	}

}
