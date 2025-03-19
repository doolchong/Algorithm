class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int p = 0;
        
        answer = new int[intervals[0][1]-intervals[0][0]+intervals[1][1]-intervals[1][0]+2];
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++, p++) {
            answer[p] = arr[i];
        }
        
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++, p++) {
            answer[p] = arr[i];
        }
        
        return answer;
    }
}