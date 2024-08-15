class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        while (true) {
            answer += max;
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt == arr.length) {
                break;
            }
        }

        return answer;
    }
}