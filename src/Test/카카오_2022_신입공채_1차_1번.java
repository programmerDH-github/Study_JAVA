package Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class 카카오_2022_신입공채_1차_1번 {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		
		int[] answer = new int[id_list.length];
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		HashMap<String, Integer> count = new HashMap<>();

		for (int i = 0; i < report.length; i++) {
			String[] info = report[i].split(" ");
			if (map.get(info[1]) == null) {
				map.put(info[1], new ArrayList(Arrays.asList(info[0])));
				count.put(info[1], 1);
			} else {
				if (!map.get(info[1]).contains(info[0])) {
					map.get(info[1]).add(info[0]);
					count.put(info[1], count.get(info[1]) + 1);
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			if (count.getOrDefault(id_list[i], 0) >= k) {
				for (int j = 0; j < id_list.length; j++) {
					if (map.get(id_list[i]).contains(id_list[j])) {
						answer[j] += 1;
					}
				}
			}
		}
		
		for(int ans : answer) {
			System.out.println(ans);
		}

	}

}

/*	예제 1
 	id_list = {"muzi", "frodo", "apeach", "neo"}
 	report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}
 	k = 2
 	
 	result = {2,1,1,0} 
*/
/*	예제 2
	id_list = {"con", "ryan"}
	report = {"ryan con", "ryan con", "ryan con", "ryan con"}
	k = 3
	
	result = {0,0} 
*/