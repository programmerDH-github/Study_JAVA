package Programmers;

import java.util.ArrayList;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
        ArrayList<Integer> arraylist = new ArrayList<>();
        int[] day = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++) {
            if((100-progresses[i]) % speeds[i] != 0) {
                day[i] = (100-progresses[i]) / speeds[i] + 1;
            }
            else day[i] = (100-progresses[i]) / speeds[i];
        }
        
        int max = day[0];
        int count = 1;
        for(int i = 1; i < day.length; i++) {
            if(max >= day[i]) {
                count++;
            }
            else {
                max = day[i];
                arraylist.add(count);
                count = 1;
            }
        }
        
        arraylist.add(count);
        
        
        for(int i = 0; i < arraylist.size(); i++) {
        	System.out.print(arraylist.get(i) + " ");
        }
        
        

	}

}

/*
	90, 30, 5
	1, 30, 5
	
	2, 1
*/
/*
	95, 90, 99, 99, 80, 99
	1, 1, 1, 1, 1, 1

	1, 3, 2
*/