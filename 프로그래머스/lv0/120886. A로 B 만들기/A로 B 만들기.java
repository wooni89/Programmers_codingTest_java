class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < before.length(); i++) {
            num1 += before.charAt(i);
            num2 += after.charAt(i);
        }
        answer = (num1 == num2) ? 1 : 0;
        return answer;
    }
}