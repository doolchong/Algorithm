import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            if (map.containsKey(i)) {
                int temp = map.get(i);
                map.put(i, temp + 1);
            } else {
                map.put(i, 1);
            }
        }


        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        while (true) {
            if (k <= 0) {
                break;
            }
            k -= list.remove(0);
            answer++;
        }

        return answer;
    }
}