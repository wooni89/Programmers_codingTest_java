class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        return ((k - 1) * 2) % numbers.length + 1;
    }
}