class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String num = Integer.toString(array[i]);
            String[] temp = num.split("");
            
            for (int k = 0; k < temp.length; k++) {
                if (temp[k].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}