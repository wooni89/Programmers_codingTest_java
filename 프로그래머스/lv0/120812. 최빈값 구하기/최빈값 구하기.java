import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(array); // array 오름차순 정렬
        max = array[array.length - 1]; //가장 큰수를 Max로 설정
        
        int count[] = new int[max +1]; // 숫자의 count를 위한 배열을 생성 인덱스는 0부터 시작함으로 max+1 을 해줌
        for(int i = 0; i < array.length; i++) { 
            count[array[i]]++; //각 숫자 index에 count[i]
        }
        max = count[0]; // 가장 큰 count값을 max로 설정
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
            } else if (max == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}