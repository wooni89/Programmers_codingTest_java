class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int sum = common[1] - common[0];
        int mul;
        if (common[0] != 0) {
           mul = common[1] / common[0];
        } else {
            mul = 1;
        }
        
        if (common[2] - common[1] == sum) {
            answer = common[(common.length - 1)] + sum;
        } else {
            answer = common[(common.length - 1)] * mul;
        }
        
        return answer;
    }
}