class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        for (int i = 0 ; i < num_list.length; i++) {
            if (i % n == 0 ) {
                count++;
            }
        }
        
        int[] answer = new int [count];
        int id = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
            answer[id] = num_list[i];
                id++;
            }
        }
        return answer;
    }
}