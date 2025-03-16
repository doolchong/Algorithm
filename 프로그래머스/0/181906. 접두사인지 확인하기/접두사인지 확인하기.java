import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] str = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            str[i] = my_string.substring(0, i + 1);
        }
        
        for(String s : str) {
            if(s.equals(is_prefix)) {
                answer++;
            }
        }
        
        return answer;
    }
}