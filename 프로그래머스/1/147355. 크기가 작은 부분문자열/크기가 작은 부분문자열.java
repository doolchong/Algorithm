class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < (t.length() - p.length() + 1); i++) {
            String s = "";
            for (int j = i; j < i + p.length(); j++) {
                s += t.charAt(j);
            }
            if (Long.parseLong(s) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}