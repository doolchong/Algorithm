class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] str = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (str[i] == ' ') {
                continue;
            } else {
                if (str[i] >= 'a' && str[i] <= 'z') {
                    str[i] += n;
                    if (str[i] > 'z') {
                        str[i] %= 'z';
                        str[i] += ('a' - 1);
                    }
                } else {
                    str[i] += n;
                    if (str[i] > 'Z') {
                        str[i] %= 'Z';
                        str[i] += ('A' - 1);
                    }
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            answer += str[i];
        }

        return answer;
    }
}