package Programmers;

public class 음양더하기 {

	public static void main(String[] args) {
		int answer = 0;
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		for(int i = 0; i < absolutes.length; i++) {
			if(!signs[i]) answer = answer - absolutes[i];
			else answer = answer + absolutes[i];
		}
		
		System.out.println(answer);

	}

}
