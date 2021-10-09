package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 순위검색 {
	static HashMap<String, ArrayList<Integer>> map;

	public static void main(String[] args) {
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };
		int[] answer = new int[query.length];
		map = new HashMap<>();

		for (String in : info) {
			String[] infoArr = in.split(" ");
			dfs("", 0, infoArr);
		}

		int index = 0;
		for (String key : map.keySet()) {
			Collections.sort(map.get(key));
		}

		for (String q : query) {
			String str = q.replace(" and ", "");
			String[] tmp = str.split(" ");
			answer[index++] = search(tmp[0], Integer.parseInt(tmp[1]));
		}

		for(int s : answer) {
			System.out.print(s + " ");
		}

	}

	public static void dfs(String str, int depth, String[] info) {
		if (depth == 4) {
			int score = Integer.parseInt(info[4]);
			if (map.containsKey(str))
				map.get(str).add(score);
			else {
				ArrayList<Integer> arraylist = new ArrayList<>();
				arraylist.add(score);
				map.put(str, arraylist);
			}
			return;
		}

		dfs(str + "-", depth + 1, info);
		dfs(str + info[depth], depth + 1, info);
	}

	public static int search(String query, int score) {
		if (!map.containsKey(query))
			return 0;
		ArrayList<Integer> tmpList = map.get(query);
		int start = 0, end = tmpList.size() - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (score > tmpList.get(mid))
				start = mid + 1;
			else
				end = mid - 1;
		}
		return tmpList.size() - start;
	}

}
