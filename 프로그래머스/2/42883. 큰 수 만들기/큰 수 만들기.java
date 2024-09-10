class Solution {
    public String solution(String number, int k) {
        StringBuilder num = new StringBuilder(number); 
        
        int i = 0;
        
       for(int j = 0; j<k; j++){
           i=0;
           int len = num.length()-1;
           while(i< len){
               if((int)num.charAt(i) < (int)num.charAt(i+1)){ 
                   num.delete(i,i+1);
                   break;
               }
               else{
                   i++;
               }
           }
           
           if(i==len){
               num.delete(i,i+1);
           }
       }
        
        
        String answer = num.toString();
        return answer;
    }
}