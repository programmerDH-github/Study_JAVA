package Programmers;

public class 모의고사 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] first = {1, 2, 3, 4, 5};
		int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int answerF = 0;
		int answerS = 0;
		int answerT = 0;
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == first[i%5]) answerF++;
			else if(answers[i] == second[i%8]) answerS++;
			else if(answers[i] == third[i%10]) answerT++;
		}
		

	}

}
