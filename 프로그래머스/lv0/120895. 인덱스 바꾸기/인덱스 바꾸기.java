class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        String temp = "";
        String answer = "";
        temp = str[num1];
        str[num1] = str[num2];
        str[num2] = temp;
        answer = String.join("", str);
        return answer;
    }
}