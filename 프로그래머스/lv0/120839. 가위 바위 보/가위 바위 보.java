class Solution {
    public String solution(String rsp) {
        // 문자열 2 일때 0 출력
        // 0일때 5출력
        // 5일때 2출력
        // 205일때 052 출력
        // 리턴값은 rsp길이만큼 리턴;
        // rsp는 0, 2, 5 숫자만 들어가있음
        String answer = "";
        String[] ary = rsp.split("");
        for (int i = 0 ; i < ary.length ; i++) {
            if (ary[i].equals("2")) {
                answer += "0";
            } else if (ary[i].equals("0")) {
                answer += "5";
            } else if (ary[i].equals("5")) {
                answer += "2";
            }
        }
        return answer;
    }
}