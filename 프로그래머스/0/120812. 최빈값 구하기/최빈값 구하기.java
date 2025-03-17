import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int n : map.keySet()) {
            if(map.get(n) > max) {
                answer = n;
                max = Math.max(map.get(n), max);
            }
        }
        
        int cnt = 0;
        
        for(int n : map.keySet()) {
            if(map.get(n) == max) {
                cnt++;
            }
            if(cnt >= 2){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}