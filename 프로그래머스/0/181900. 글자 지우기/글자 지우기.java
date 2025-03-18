import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int p = 0;
        
        Arrays.sort(indices);
        
        for(int i = 0; i < my_string.length(); i++){
            if(p < indices.length){
                if(i==indices[p]){
                p++;
                continue;
                }
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}