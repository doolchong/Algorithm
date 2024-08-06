import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int rank = map.get(calling);
            String before = players[rank - 1];

            players[rank - 1] = calling;
            players[rank] = before;

            map.put(calling, rank - 1);
            map.put(before, rank);
        }

        answer = players;

        return answer;
    }
}