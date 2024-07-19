class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int cnt = 0;

        if (arr.length <= 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int n : arr) {
            if (n == min) {
                cnt++;
            }
        }
        answer = new int[arr.length - cnt];

        for (int i = 0,j=0; j < arr.length; i++,j++) {
            if (arr[j] == min) {
                i--;
                continue;
            }
            answer[i] = arr[j];
        }

        return answer;
    }
}