package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 여행경로 {
	static boolean[] visited;
	static ArrayList<String> arraylist;
	static String str = "";

	public static void main(String[] args) {
		arraylist = new ArrayList<>();
		String[][] tickets = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" },
				{ "ATL", "SFO" } };
		String[] answer;
		for (int i = 0; i < tickets.length; i++) {

			visited = new boolean[tickets.length];
			String start = tickets[i][0];
			String end = tickets[i][1];

			if (tickets[i][0].equals("ICN")) {
				str = start + ",";
				str += end + ",";
				visited[i] = true;
				dfs(tickets, end, 1);
			}
		}
		Collections.sort(arraylist);
		answer = arraylist.get(0).split(",");
		
		for(String s : answer) {
			System.out.print(s + " ");
		}
		

	}

	public static void dfs(String[][] tickets, String end, int cnt) {
		if (cnt == tickets.length) {
			arraylist.add(str);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			if (end.equals(tickets[i][0]) && !visited[i]) {
				str += tickets[i][1] + ",";
				visited[i] = true;
				dfs(tickets, tickets[i][1], cnt + 1);
				visited[i] = false;
				str = str.substring(0, str.length() - 4);
			}
		}
	}

}
