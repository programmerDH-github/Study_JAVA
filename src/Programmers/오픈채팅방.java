package Programmers;
import java.util.ArrayList;
import java.util.HashMap;

public class ����ä�ù� {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", 
				"Enter uid4567 Prodo","Leave uid1234",
				"Enter uid1234 Prodo","Change uid4567 Ryan"};
		ArrayList<String> arraylist = new ArrayList<>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < record.length; i++) {
			String[] userInfo = record[i].split(" ");
			
			if(userInfo[0].equals("Enter")) {
				map.put(userInfo[1], userInfo[2]);
			}
			else if(userInfo[0].equals("Change")) {
				map.put(userInfo[1], userInfo[2]);
			}
		}
		
		for(int i = 0; i < record.length; i++) {
			String[] userInfo = record[i].split(" ");
			
			if(userInfo[0].equals("Enter")) {
				arraylist.add(map.get(userInfo[1]) + "���� ���Խ��ϴ�.");
			}else if(userInfo[0].equals("Leave")) {
				arraylist.add(map.get(userInfo[1]) + "���� �������ϴ�.");
			}
		}
		
		System.out.println(arraylist);

	}

}
