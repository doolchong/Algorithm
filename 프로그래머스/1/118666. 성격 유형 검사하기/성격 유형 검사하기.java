import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] > 4) {
                int temp = map.get(survey[i].charAt(1));
                temp += choices[i] - 4;
                map.put(survey[i].charAt(1), temp);
            } else if (choices[i] < 4) {
                int temp = map.get(survey[i].charAt(0));
                temp += 4 - choices[i];
                map.put(survey[i].charAt(0), temp);
            }
        }

        if (map.get('R') >= map.get('T')) {
            answer += 'R';
        } else {
            answer += 'T';
        }
        if (map.get('C') >= map.get('F')) {
            answer += 'C';
        } else {
            answer += 'F';
        }
        if (map.get('J') >= map.get('M')) {
            answer += 'J';
        } else {
            answer += 'M';
        }
        if (map.get('A') >= map.get('N')) {
            answer += 'A';
        } else {
            answer += 'N';
        }

        return answer;
    }
}