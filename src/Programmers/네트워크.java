package Programmers;

public class 네트워크 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 3; 
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        boolean[] check = new boolean[n];
        
        for(int node = 0; node < n; node++) {
            if(!check[node]) {
                dfs(computers,node,check);
                answer++;                
            }
        }
        
       System.out.println(answer);
	}
	
	static boolean[] dfs(int[][] computers, int k, boolean[] check){
        check[k] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(k != i && computers[k][i] == 1 && !check[i]) {
                dfs(computers,i,check);
            }
            
        }        
        
        
        return check;
    }
}
