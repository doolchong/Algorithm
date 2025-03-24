class Solution {
    public int solution(String name) {
        int answer = 0;
        int min = name.length();
        
        for(int i = 0; i < name.length(); i++){
            int temp = Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            answer += temp;
            
            int j = i + 1;
            
            while(true){
                if(j >= name.length() || name.charAt(j) != 'A'){
                    break;
                }
                j++;
            }
            
            min = Math.min(min, i * 2 + name.length() - j);
            min = Math.min(min, (name.length() - j) * 2 + i);
        
        }
        
        return answer + min;
    }
}