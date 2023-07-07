class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < num_list.length ; i++) {
            if (i % 2 == 0) {
                a += num_list[i]; 
            } else 
                b += num_list[i];
        }
            if (a > b) {
                return a;
            } else if (a < b) {
                return b;
            } else if (a == b) {
                answer = a;
            }
        return answer;
    }
}