package Programmers;

import java.util.ArrayList;

public class ���¼��ڴ��ϱ� {

	public static void main(String[] args) {
		int answer = 0;
		int[] numbers = {5,8,4,0,6,7,9};
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for(int n : numbers) {
			arraylist.add(n);
		}
		
		for(int i = 0; i < 10; i++) {
			if(!arraylist.contains(i)) answer += i;
		}
		
		
		System.out.println(answer);
		
	}

}

/* ���� 1
1,2,3,4,6,7,8,0
14

���� 2
5,8,4,0,6,7,9
6
*/