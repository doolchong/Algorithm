import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < keymap.length; k++) {
            String s = keymap[k];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int press = i + 1;
                map.put(ch, Math.min(press, map.getOrDefault(ch, press)));
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);
                if (!map.containsKey(ch)) {
                    sum = -1;
                    break;
                }
                sum += map.get(ch);
            }
            answer[i] = sum;
        }

        return answer;
    }
}