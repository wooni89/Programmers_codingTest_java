class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String res = my_string.replaceAll("[^0-9]", "");
        for (int i = 0 ; i < res.length(); i++) {
            answer += Integer.parseInt(String.valueOf(res.charAt(i)));
        }
        return answer;
    }
}