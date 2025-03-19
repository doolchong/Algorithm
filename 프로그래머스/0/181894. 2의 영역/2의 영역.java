class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==2){
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        
        if(max == Integer.MIN_VALUE){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[max-min+1];
            for(int i = min, p = 0; i <= max; i++, p++) {
                answer[p] = arr[i];
            }
        }
        
        return answer;
    }
}