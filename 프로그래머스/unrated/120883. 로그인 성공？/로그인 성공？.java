class Solution {
    public String solution(String[] id_pw, String[][] db) {
            
        String answer = Result.FAIL.getValue();
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] userInfo : db) {
            String dbId = userInfo[0];
            String dbPw = userInfo[1];
            
            if (id.equals(dbId) && pw.equals(dbPw)) {
                answer = Result.LOGIN.getValue();   
            } else if (id.equals(dbId)) {
                answer = Result.WRONG.getValue();
            }
        }
        
        
        
        return answer;
    }
    
    public enum Result {
        
        LOGIN("login"),
        WRONG("wrong pw"),
        FAIL("fail");

        private final String value;

        Result(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}