class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int j = 0;

        for (int i = 0; i < phone_number.length() - 4; i++, j++) {
            answer += "*";
        }
        for (int i = j; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }

        return answer;
    }
}