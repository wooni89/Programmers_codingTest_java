class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++) {
            String strNum = String.valueOf(num);
            for (int index = 0; index < strNum.length(); index++) {
                if (strNum.charAt(index) - '0' == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}