class Solution {
    public int solution(int n) {
        int answer = 0;
        int gcd = 1;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && 6 % i == 0){
                gcd = i;
            }
        }
        
        answer = (n * 6 / gcd) / 6;
        
        return answer;
    }
}