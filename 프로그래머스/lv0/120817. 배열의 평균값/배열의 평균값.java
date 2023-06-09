class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;  
        }
        double avg = answer / numbers.length;
        return avg;
    }
}