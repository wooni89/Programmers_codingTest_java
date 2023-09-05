class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int xNum = 0;
        int num = 0;
        
        for (String s : arr) {
            if (s.equals("x")) {
                xNum += 1;
            } else if (s.contains("x")) {
                xNum += Integer.parseInt(s.substring(0, s.length() -1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        
        if (xNum != 0 && num == 0) {
            if (xNum == 1) {
                answer = "x";
            } else {
                answer = xNum + "x";
            }
        }
        
        if (xNum !=0 && num !=0) {
            if (xNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = xNum + "x" + " + " + num;
            }
        }
        
        if (xNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
        
        return answer;
    }
}