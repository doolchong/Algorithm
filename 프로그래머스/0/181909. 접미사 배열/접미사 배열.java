import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> str = new ArrayList();

        for (int i = 0; i < my_string.length(); i++) {
            str.add(my_string.substring(i));
        }

        Collections.sort(str);

        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = str.get(i);
        }

        return answer;
    }
}