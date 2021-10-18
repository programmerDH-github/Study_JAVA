package Programmers;

public class 단어변환 {
	static boolean[] visit;
	static int answer = 0;
	
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		visit = new boolean[words.length];
        dfs(begin, target, words, 0);
        
        System.out.println(answer);

	}
	
	public static void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        
        for(int i = 0; i < words.length; i++) {
            if (visit[i]) {
                continue;
            }
            
            int c = 0;
            for(int j = 0; j < begin.length(); j++) {
                if(begin.charAt(j) == words[i].charAt(j)) c++;
            }
            
            if(c == begin.length() - 1) {          
                visit[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visit[i] = false;
            }
        }
    }

}
