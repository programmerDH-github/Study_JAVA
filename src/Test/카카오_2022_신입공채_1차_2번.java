package Test;



public class īī��_2022_���԰�ä_1��_2�� {
	
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
    
	
	// �Ҽ� �Ǻ� �˰���
    public static void is_prime(long number) {
        // 0�� 1�� �Ҽ��� �ƴ�
    	if(number < 2) {
            return;
        }
        
    	// 2�� �Ҽ�
        if(number == 2) {
            answer++;
            return;
        }
        
        // ������ �Լ� : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {
            
        	// �Ҽ��� �ƴ� ���
        	if(number % i == 0) {
                return;
            }
        }
        
        // �Ҽ� �� ���
        answer++;
        return;
        
    }
	
}

/*	���� 1
 	n = 437674
 	k = 3
  
  	result = 3
*/
/*	���� 2
	n = 110011
	k = 10

	result = 2
*/