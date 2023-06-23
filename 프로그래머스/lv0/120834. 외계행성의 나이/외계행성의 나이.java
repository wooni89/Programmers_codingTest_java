class Solution {
    public String solution(int age) {
        String answer = "";
        char ch = ' ';
        String str = Integer.toString(age);
        for (int i = 0; i < str.length(); i++) {
          ch = (char) (str.charAt(i) - '0' + 97);
          answer += ch;
    }
        return answer;
    }
}