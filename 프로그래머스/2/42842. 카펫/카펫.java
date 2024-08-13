class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int h = 3;
        int w = 0;

        while (true) {
            if ((brown + yellow) % h == 0) {
                w = (brown + yellow) / h;
                if ((w - 2) * (h - 2) == yellow) {
                    break;
                }
            }
            h++;
        }

        answer[0] = w;
        answer[1] = h;

        return answer;
    }
}