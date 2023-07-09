class Solution {
    public String solution(String code) {
        String answer = "";
        char mode = '0';
        for (int i = 0 ; i < code.length() ; i++) {
            //모드가 1일때
            if (code.charAt(i) == '1') {
                mode = mode == '0' ? '1' : '0';
                continue;
            }
            if (mode == '0') {
                //짝수
                if (i % 2 == 0) {
                    answer += code.charAt(i);
                }
            } else if (mode == '1') {
                //홀수
                if (i % 2 != 0) {
                    answer += code.charAt(i);
                }
            } 
        }
        
        if (answer.equals("")) {
             answer = "EMPTY";
        }
        return answer;
    }
}