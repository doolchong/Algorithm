class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)){
                answer[(int)c - 'A']++;
            }else if(Character.isLowerCase(c)){
                answer[(int)c - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}