class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    min++;
                    max++;
                }
            }
            if (lottos[i] == 0) {
                max++;
            }
        }

        answer[0] = 7 - max;
        answer[1] = 7 - min;

        if (max < 2)
            answer[0] = answer[1] = 6;
        if (answer[1] == 7)
            answer[1]--;

        return answer;
    }
}