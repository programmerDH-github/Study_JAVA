package Test;



public class 카카오_2022_신입공채_1차_2번 {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		
		String change = "";
        while(n > 0) {
            change = (n % k) + change;
            n = n/k;
        }
        String s = "";
        for(int i = 0; i < change.length(); i++) {
            if(change.charAt(i) == '0') {
                if(!s.equals("")){
                    is_prime(Long.parseLong(s));
                    s = "";
               }
                continue;                
            }
            else {
                s = s + change.charAt(i);
            }
        }
        
        if(!s.equals("")) {
            is_prime(Long.parseLong(s));
        }
        
        System.out.println(answer);
    }
    
	
	// 소수 판별 알고리즘
    public static void is_prime(long number) {
        // 0과 1은 소수가 아님
    	if(number < 2) {
            return;
        }
        
    	// 2는 소수
        if(number == 2) {
            answer++;
            return;
        }
        
        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {
            
        	// 소수가 아닐 경우
        	if(number % i == 0) {
                return;
            }
        }
        
        // 소수 일 경우
        answer++;
        return;
        
    }
	
}

/*	예제 1
 	n = 437674
 	k = 3
  
  	result = 3
*/
/*	예제 2
	n = 110011
	k = 10

	result = 2
*/