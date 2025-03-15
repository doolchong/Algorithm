import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> str = new ArrayList();
        
        for(int i = 0; i < my_string.length(); i++) {
            str.add(my_string.substring(i));
        }
        
        for(String s : str) {
            if(s.equals(is_suffix)) {
                answer++;
            }
        }
        
        return answer;
    }
}