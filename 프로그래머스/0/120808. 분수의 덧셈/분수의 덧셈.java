class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num1 = numer1 * denom2;
            int num2 = denom1 * numer2;
            int numer = num1 + num2;
            int denom = denom1 * denom2;
            
            int gcd = 0;

            for (int i = 1; i <= Integer.min(numer, denom); i++) {
                if (numer % i == 0 && denom % i == 0) {
                    gcd = i;
                }
            }

            numer /= gcd;
            denom /= gcd;

            int[] answer = {numer, denom};

            return answer;
    }
}