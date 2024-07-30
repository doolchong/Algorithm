class Solution {
    public int solution(String s) {
        int answer = 0;
        char pivot = s.charAt(0);
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (cnt1 == cnt2) {
                pivot = s.charAt(i);
                cnt1 = 0;
                cnt2 = 0;
                answer++;
            }
            if (pivot == s.charAt(i)) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        return answer;
    }
}