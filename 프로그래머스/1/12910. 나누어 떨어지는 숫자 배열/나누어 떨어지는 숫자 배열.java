class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }

        answer = new int[cnt];

        cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}