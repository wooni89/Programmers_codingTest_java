import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[0] * numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];                
                }
            }
        }
        return answer;
    }
}