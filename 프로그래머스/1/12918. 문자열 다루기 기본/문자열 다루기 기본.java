class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        //48 57
        if (s.length() == 4 || s.length() == 6) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    cnt++;
                }
            }
            if (cnt == s.length()) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}