class Solution {
    
    static int[] ch;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Solution solution = new Solution();
        ch=new int[n];
        
        for(int i = 0; i < n; i++){
            if(ch[i]==0){
                solution.dfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int v, int[][] computers){
        ch[v]=1;
        
        for(int i = 0; i < computers.length; i++){
            if(v != i && computers[v][i] == 1 && ch[i]==0){
                dfs(i,computers);
            }
        }
    }
}