package Programmers;

import java.util.PriorityQueue;

public class ´õ¸Ê°Ô {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		for (int sv : scoville) {
			priorityQueue.add(sv);
		}

		while (priorityQueue.peek() < K) {
			if (priorityQueue.size() == 1) {
				System.out.println("-1");
			}

			int scoville_1 = priorityQueue.poll();
			int scoville_2 = priorityQueue.poll();
			int scoville_mix = scoville_1 + scoville_2 * 2;

			priorityQueue.add(scoville_mix);

			answer++;
		}

		System.out.println(answer);

	}

}
