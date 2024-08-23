import java.util.Arrays;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            boolean isMatch = true;

            int[] remains = Arrays.copyOf(number, number.length);

            for (int j = i; j < i + 10; j++) {

                int index = Arrays.asList(want).indexOf(discount[j]);

                if (index == -1) {
                    continue;
                }

                remains[index]--;
            }

            for (int k = 0; k < remains.length; k++) {
                if (remains[k] != 0) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result++;
            }
        }

        return result;
    }
}