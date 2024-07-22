import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int cnt = 0;
        int op = 0;

        for (int i = l; i <= r; i++) {
            int[] arr = Arrays.copyOf(answer, cnt);
            int check = 0;
            int num = i;
            while (true) {
                if (num == 0) {
                    break;
                }
                if (num % 10 == 5 || num % 10 == 0) {
                    num /= 10;
                    continue;
                } else {
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                op = 1;
                cnt++;
                answer = Arrays.copyOf(arr, cnt);
                answer[cnt - 1] = i;
            }
        }

        if (op == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}