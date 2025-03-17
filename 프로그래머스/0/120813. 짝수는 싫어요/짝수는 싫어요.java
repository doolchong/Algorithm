class Solution {
    public int[] solution(int n) {
        int[] answer = new int [n / 2 + n % 2];
        int p = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                answer[p] = i;
                p++;
            }
        } 
        
        return answer;
    }
}