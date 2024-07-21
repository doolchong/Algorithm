class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int min = max;
            int ch = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j]) {
                    if (min >= arr[j]) {
                        min = arr[j];
                        ch = 1;
                    }
                }
            }
            if (ch == 0) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }

        return answer;
    }
}