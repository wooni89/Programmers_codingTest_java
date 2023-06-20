class Solution {
    public int[] solution(int start, int end) {
        int result = start - end + 1;
        int[] answer = new int[result];
        for (int i = 0; i < start; i++) {
            if (i < result) {
                answer[i] = start - i;
            } 
        }
        return answer;
    }
}