class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int lux = 50;
        int luy = 50;
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (lux > j) {
                        lux = j;
                    }
                    if (luy > i) {
                        luy = i;
                    }
                    if (rdx < j) {
                        rdx = j;
                    }
                    if (rdy < i) {
                        rdy = i;
                    }
                }
            }
        }

        answer[0] = luy;
        answer[1] = lux;
        answer[2] = rdy + 1;
        answer[3] = rdx + 1;

        return answer;
    }
}