package Programmers;

public class 멀쩡한사각형 {

	public static void main(String[] args) {
		int w = 8; int h = 12; 
		
		long answer;
        long x = (long)w;
        long y = (long)h;
        long all_box = x * y;
        long min = (x < y) ? x : y;
        long gcd = 0;
        
        for(long i = 1; i <= min; i++) {
            if(x % i == 0 && y % i == 0) gcd = i;
        }
        answer = all_box - (x + y - gcd) ;
        
        System.out.println(answer);
	}

}

/*	예제 1
	8 12
	
	80
*/