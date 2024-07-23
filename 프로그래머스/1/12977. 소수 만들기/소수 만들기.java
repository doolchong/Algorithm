class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = j; k < nums.length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    int cnt = 0;
                    for (int q = 1; q <= (nums[i] + nums[j] + nums[k]); q++) {
                        if ((nums[i] + nums[j] + nums[k]) % q == 0) {
                            cnt++;
                        }
                    }
                    if (cnt == 2) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}