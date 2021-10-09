package Programmers;

public class 신규아이디추천 {

	public static void main(String[] args) {
		String answer = "";
		String new_id = "...!@BaT#*..y.abcdefghijklm";
        char tmp;
        
        /* 1-step */
        for(int i = 0; i < new_id.length(); i++) {
            tmp = new_id.charAt(i);
            if((65 <= tmp) && (tmp <= 90)) answer += new_id.valueOf(tmp).toLowerCase();
            else answer += (char)tmp;
        }
        
        /* 2-step */       
        answer = answer.replaceAll("[^-_.0-9a-z]","");
        
        /* 3-step */
        answer = answer.replaceAll("\\.{2,}",".");
        
        /* 4-step */
        if(answer.charAt(0) == '.') answer = answer.substring(1);
        
        if(answer.endsWith(".")) answer = answer.substring(0,answer.length()-1);
        
        /* 5-step */
        if(answer.length() == 0) answer = "a";
        
        /* 6-step */
        if(answer.length() >= 16) answer = answer.substring(0,15);
        
        if(answer.endsWith(".")) answer = answer.substring(0,answer.length()-1);
        
        /* 7-step */
        if(answer.length() <= 2) { 
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1) + "";
            }
        }
        
        
        System.out.println(answer);

	}

}
