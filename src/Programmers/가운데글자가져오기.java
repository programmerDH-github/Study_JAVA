package Programmers;

public class ������ڰ������� {

	public static void main(String[] args) {
		String s = "abcde";
		
		if(s.length()%2 == 0) {
			System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
		}
		else {
			System.out.println(s.charAt(s.length() / 2)); 
		}

	}

}
