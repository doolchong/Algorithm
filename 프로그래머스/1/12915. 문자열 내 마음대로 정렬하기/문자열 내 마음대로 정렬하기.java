import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings);

        for (int j = 0; j < strings.length; j++) {
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].charAt(n) > strings[i + 1].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = temp;
                }
            }
        }

        answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }

        return answer;
    }
}