class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int day = 0;

        String[] str = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        for (int i = 1; i <= a; i++) {
            if (i == a) {
                continue;
            }
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day += 30;
                    break;
                case 2:
                    day += 29;
                    break;
            }
            System.out.println(day);
        }
        day += b;

        answer = str[day % 7];

        return answer;
    }
}