class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - 1; j++) {
                char temp = ' ';
                if (c[j] < c[j + 1]) {
                    temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            answer += c[i];
        }

        return answer;
    }
}