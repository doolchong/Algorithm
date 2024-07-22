import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int i=0;
        
        while(i<arr.length){
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                int lastIndex = stk.size()-1;
                if(arr[i] > stk.get(lastIndex)){
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(lastIndex);
                }
            }
        }
        
        int[] answer = stk.stream().mapToInt(x->x).toArray();
        return answer;
    }
}