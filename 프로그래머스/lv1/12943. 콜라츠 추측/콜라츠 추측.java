class Solution {
    public int solution(int num) {
        int count = 0;
        long numLong = num;
        while (numLong != 1) {
            // 500번 수행했을 경우
            if (count == 500) {
                count = -1;
                break;
            }
            
            numLong = numLong % 2 == 0 ? numLong / 2 : numLong * 3 + 1;
            count++;

        }
        return count;
    }
}