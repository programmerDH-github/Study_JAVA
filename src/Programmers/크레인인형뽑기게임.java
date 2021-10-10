package Programmers;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {
		int answer = 0;
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};

		int[] result = new int[1001];
		int k = 0;

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] == 0)
					continue;
				else {
					result[k] = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
					k++;
					break;
				}

			}

			if (k > 1 && result[k - 1] == result[k - 2]) {
				result[k - 1] = 0;
				result[k - 2] = 0;
				answer = answer + 2;
				k = k - 2;
			}

		}

		System.out.println(answer);

	}

}
