class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            answer = a; 
        } else if (a < b) {
            for (long i = a; i <= b; i++) {
                 answer += i;
            }
        } else if (a > b) {
            for (long i = a; i >= b; i--) {
                answer += i;
            }
        }
        return answer;
    }
}