class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < index_list.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (index_list[i] == j) {
                    answer += str[j];
                }
            }
        }
        return answer;
    }
}