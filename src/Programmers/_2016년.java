package Programmers;

public class _2016³â {

	public static void main(String[] args) {
		String answer = "";
		int a = 5;
		int b = 24;
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] MM = {31,29,31,30,31,30,31,31,30,30,31,30};
        
        for(int i = 1; i < a; i++) {
            b += MM[i-1];
        }
        
        answer = week[(b+4)%7]; 
        
        System.out.println(answer);

	}

}
