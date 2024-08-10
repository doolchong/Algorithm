class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        int check = 1;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                check = 1;
            } else if (check == 1) {
                if (Character.isAlphabetic(c)) {
                    c = (char) (c - 'a' + 'A');
                }
                check = 0;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}