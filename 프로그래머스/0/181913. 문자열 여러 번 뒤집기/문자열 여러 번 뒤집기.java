class Solution {
    public String solution(String my_string, int[][] queries) {
            String answer = "";
            char[] myString = new char[my_string.length()];

            for (int i = 0; i < myString.length; i++) {
                myString[i] = my_string.charAt(i);
            }

            for (int i = 0; i < queries.length; i++) {
                char temp;
                for (int j = 0; j <= (queries[i][1] - queries[i][0]) / 2; j++) {
                    temp = myString[queries[i][0] + j];
                    myString[queries[i][0] + j] = myString[queries[i][1] - j];
                    myString[queries[i][1] - j] = temp;
                }
            }

            for (int i = 0; i < myString.length; i++) {
                answer += myString[i];
            }

            return answer;
        }
}