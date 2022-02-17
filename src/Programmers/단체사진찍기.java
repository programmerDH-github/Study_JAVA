package Programmers;

public class 단체사진찍기 {
	static String str = "";
    static boolean[] visited;
    static int answer = 0;
	public static void main(String[] args) {
		String[] poeple = {"A", "C", "F", "J", "M", "N", "R", "T"};
		int n = 2;
		
		String[] data = {"N~F=0", "R~T>2"};
        visited = new boolean[poeple.length];
        answer = 0;
        dfs(poeple,data, 0);        
        
        System.out.println(answer);
        

	}
	
	public static void dfs(String[] poeple, String[] data, int count) {
        if(count > 7) {
            if(check(data)) answer++;            
            return;
        }
        
        for(int i = 0; i < poeple.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                str += poeple[i];
                dfs(poeple, data, count+1);
                str = str.substring(0, str.length()-1);
                visited[i] = false;
            }
        }
        
        
        return;
    }
	
	public static boolean check (String[] data) {
        for(String d : data) {
        	int index = Math.abs(str.indexOf(d.charAt(0)) - str.indexOf(d.charAt(2)));
            
            if(d.charAt(3) == '=') {
            	if(index-1 != d.charAt(4)-'0') return false;
            }
            else if(d.charAt(3) == '>') {
            	
            	if(index-1 <= d.charAt(4)-'0') return false;
            }
            else if(d.charAt(3) == '<') {
            	if(index-1 >= d.charAt(4)-'0') return false;
            }
        }
        
        return true;
    }

}

/*
	2 "N~F=0", "R~T>2"
	
	3648
*/
/*
	2 "M~C<2", "C~M>1"
	
	0
*/