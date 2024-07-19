import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        String s = "";

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                s += (numbers[i] + numbers[j]) + " ";
            }
        }
        String[] str = s.split(" ");

        int l = 0;
        for (String string : str) {
            l++;
        }

        answer = new int[l];

        for (int i = 0; i < l; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        int[] result = Arrays.stream(answer).distinct().toArray();
        Arrays.sort(result);

        return result;
    }
}