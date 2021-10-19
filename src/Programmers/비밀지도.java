package Programmers;

public class 비밀지도 {

	public static void main(String[] args) {
		int n = 6;
		String[] answer = new String[n];
		
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};

		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replace("0", " ").replace("1", "#");
			if(answer[i].length() < n) answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
			System.out.println(answer[i]);
		}

	}

}
