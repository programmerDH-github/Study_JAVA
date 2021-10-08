package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		int answer = 0;
		int sum = 0;
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};

		Queue<Integer> bridge_ing = new LinkedList<>();

		for (int i : truck_weights) {
			while (true) {
				if (bridge_ing.isEmpty()) {
					bridge_ing.offer(i);
					answer++;
					sum += i;
					break;
				} else if (bridge_ing.size() == bridge_length) {
					sum -= bridge_ing.poll();
				} else if (sum + i <= weight) {
					bridge_ing.offer(i);
					answer++;
					sum += i;
					break;
				} else {
					bridge_ing.offer(0);
					answer++;
				}

			}

		}
		
		System.out.println(answer + bridge_length); 

	}

}
