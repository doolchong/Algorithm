class Solution {
    public int solution(String s) {
        int answer = 0;
        int check = 0;

        for (int i = 0; i < s.length(); i++) {
            answer *= 10;
            if (s.charAt(i) == '-') {
                check = 1;
            }
            else if(s.charAt(i) == '+'){
                check=0;
            }
            else {
                answer += (int) (s.charAt(i) - 48);
            }
        }

        if (check == 1) {
            answer *= (-1);
        }

        return answer;
    }
}