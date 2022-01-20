package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 올바른괄호 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = br.readLine();
			boolean answer = true;
	        int count = 0;
	        
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == '(') {
	                count++;
	            }
	            else count--;
	            
	            if(count < 0) {
	                answer = false;
	                break;
	            }
	        }
	        
	        answer = (count == 0) ? true : false;
	        System.out.println(answer);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

/*	입력		출력
	()()	true
	(())()	true
	)()(	false
	(()(	false
*/
 