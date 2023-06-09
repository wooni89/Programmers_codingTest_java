class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int i = 0;
        i = n/10;
            answer += (n * 12000) + (k - i) * 2000;
             
        return answer;
    }
}