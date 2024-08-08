import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> result = new LinkedHashMap<>();
        int i = 0;

        for (String s : id_list) {
            map.put(s, new HashSet<>());
            result.put(s, 0);
        }

        for (int j = 0; j < report.length; j++) {
            String[] str = report[j].split(" ");
            map.get(str[1]).add(str[0]);
        }

        for (Set<String> value : map.values()) {
            if (value.size() >= k) {
                for (String s : value) {
                    int temp = result.get(s);
                    result.put(s, temp + 1);
                }
            }
        }

        for (Integer value : result.values()) {
            answer[i] = value;
            i++;
        }

        return answer;
    }
}