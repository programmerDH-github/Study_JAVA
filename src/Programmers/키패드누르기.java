package Programmers;

public class 키패드누르기 {

	public static void main(String[] args) {
		String answer = "";
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";

		int Lweight = 10;
		int Rweight = 12;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer = answer + "L";
				Lweight = numbers[i];

			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer = answer + "R";
				Rweight = numbers[i];
			} else {
				int leftLength = length(Lweight, numbers[i]);
				int rightLength = length(Rweight, numbers[i]);
                
				if (leftLength > rightLength) {
					answer = answer + "R";
					Rweight = numbers[i];
				} 
				else if (leftLength < rightLength) {
					answer = answer + "L";
					Lweight = numbers[i];
				} else {
					if (hand.equals("left")) {
						answer = answer + "L";
						Lweight = numbers[i];
					} else {
						answer = answer + "R";
						Rweight = numbers[i];
					}
				}
			}
		}

		System.out.println(answer);

	}
	
	public static int length (int index, int number) {
		index = (index == 0) ? 11 : index;
		number = (number == 0) ? 11 : number;
		
		return Math.abs(((index - 1)/3) - number / 3) + Math.abs((index - 1)%3 - 1);
	}

}
