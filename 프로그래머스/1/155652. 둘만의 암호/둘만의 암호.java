import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < skip.length(); i++) {
            set.add(skip.charAt(i));
        }


        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            for (int j = 0; j < index; j++) {
                p += 1;
                if (p > 'z') {
                    p -= 26;
                }
                if (set.contains(p)) {
                    j--;
                }
            }
            answer += p;
        }

        return answer;
    }
}