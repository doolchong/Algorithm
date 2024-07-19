class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] str = new char[s.length()];
        
        for(int i =0;i<s.length();i++){
            str[i] = s.charAt(i);
        }
        
        for(int i = 0, j = 0;i<s.length();i++, j++){
            if(j%2==0){
                if(str[i]>='a'&&str[i]<='z'){
                    str[i] += ('A'-'a');
                }
            } else {
                if(str[i]>='A'&&str[i]<='Z'){
                    str[i]+=('a'-'A');
                }
            }
            if(str[i] == ' '){
                j=0;
                j--;
            }
        }
        
        for(int i =0;i < s.length();i++){
            answer += str[i];
        }
        
        return answer;
    }
}