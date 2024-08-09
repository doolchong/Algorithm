class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        answer = min + " " + max;

        return answer;
    }
}