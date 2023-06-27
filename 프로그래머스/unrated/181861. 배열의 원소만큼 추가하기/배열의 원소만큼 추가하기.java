class Solution {
    public int[] solution(int[] arr) {
        int id = 0;
        for (int index : arr) {
                id += index;
            }
        int[] answer = new int[id];
        int idx = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr[i] ;j++) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}