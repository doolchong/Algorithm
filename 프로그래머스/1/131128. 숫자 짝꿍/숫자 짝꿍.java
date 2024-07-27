class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] c1 = new int[10];
        int[] c2 = new int[10];

        for (int i = 0; i < X.length(); i++) {
            c1[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            c2[Y.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (true) {
                if (c1[i] > 0 && c2[i] > 0) {
                    sb.append(i);
                }
                c1[i] -= 1;
                c2[i] -= 1;
                if (c1[i] <= 0) {
                    break;
                } else if (c2[i] <= 0) {
                    break;
                }
            }
        }

        answer = sb.toString();

        if (answer.equals("")) {
            answer = "-1";
        }

        if (answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;
    }
}