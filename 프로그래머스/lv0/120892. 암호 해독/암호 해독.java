class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        for (int i = code-1; i < str.length ;) {
                answer += str[i];
                i += code;
            
        }
        
        return answer;
    }
}