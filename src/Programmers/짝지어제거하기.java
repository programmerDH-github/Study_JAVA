package Programmers;
import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		int answer = -1;        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!stack.empty() && stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }

        answer = stack.empty() ? 1 : 0;
        
        System.out.println(answer);

	}

}
/*
	baabaa
	
	1
*/
/*
	cdcd

	0
*/