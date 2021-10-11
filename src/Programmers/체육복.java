package Programmers;

public class Ã¼À°º¹ {

	public static void main(String[] args) {
		int answer = 0;
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
        
        int[] visit = new int[n];
        
        for(int i = 0; i < n; i++) {
            visit[i] = 1;
        }
        
        for(int i = 0; i < lost.length; i++) {
            visit[lost[i] - 1] = 0;
        }
        
        for(int i = 0; i < reserve.length; i++) {
            visit[reserve[i] - 1] = 2;
        }
        
        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] == lost[j]) visit[reserve[i] - 1] = 1;
            }
        }
        
        for(int i = 0; i < visit.length; i++) {
            if((i+1) == visit.length) break;
            if(visit[i] == 0 && visit[i+1] == 2) {
                visit[i] = 1;
                visit[i+1] = 1;
            }
            else if(visit[i] == 2 && visit[i+1] == 0) {
                visit[i] = 1;
                visit[i+1] = 1;
            }
            
        }
        
        for(int i = 0; i < visit.length; i++) {            
            if(visit[i] == 1 || visit[i] == 2) answer++;
        }
        
        System.out.println(answer);

	}

}
