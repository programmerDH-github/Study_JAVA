package Programmers;

import java.util.Arrays;

public class ����Ʈ {

	public static void main(String[] args) {
		int[] people = {40, 50, 150, 160};
		int limit = 200;
		int answer = 0;
        
        Arrays.sort(people);
        
        int index = 0;
        for(int i = people.length-1; i >= index; i--) {
            if(people[i] + people[index] > limit) {
            	answer++;
            }
            else {
            	answer++;
            	index++;
            }
        }
  		
        System.out.println(answer);
	}

}

/*	���� 1
  	[70, 50, 80, 50] 100
  
 	3
*/
/*	���� 2
	[70, 80, 50] 100

	3
*/
