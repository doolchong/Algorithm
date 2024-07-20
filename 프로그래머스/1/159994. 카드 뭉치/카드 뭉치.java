class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if (c1 < cards1.length && goal[i].equals(cards1[c1])) {
                goal[i] = "";
                c1++;
            } else if (c2 < cards2.length && goal[i].equals(cards2[c2])) {
                goal[i] = "";
                c2++;
            }
            if (goal[i].equals("")) {
                continue;
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}