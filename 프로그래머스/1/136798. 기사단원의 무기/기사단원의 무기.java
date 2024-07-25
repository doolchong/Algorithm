class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        long[] divisorCount = new long[number + 1];
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCount[j]++; // i는 j의 약수이므로 개수 증가
            }
        }
        
        for (int i = 1; i <= number; i++) {
            if (divisorCount[i] > limit) {
                divisorCount[i] = power;
            }
            answer += divisorCount[i];
        }

        return answer;
    }
}